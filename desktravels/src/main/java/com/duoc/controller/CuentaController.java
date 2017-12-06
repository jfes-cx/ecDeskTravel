package com.duoc.controller;

import com.duoc.domain.Colaborador;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.ibatis.session.SqlSession;

import com.duoc.util.MyBatisSqlSessionFactory;
import javax.swing.JTable;
import com.duoc.domain.CuentaConexionDTO;
import com.duoc.domain.Cuentausuario;
import com.duoc.domain.Perfil;
import com.duoc.util.EncryptUtil;
import java.math.BigDecimal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import com.duoc.ui.CuentaForm;
import com.duoc.util.CuentaTableModel;

import org.apache.ibatis.exceptions.PersistenceException;

public class CuentaController {


    public void cargarTablaCuentas(JTable tblCuentas) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
          
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.CuentaconexionMapper.GET_CUENTAS_CONEXION", parms);
            List<CuentaConexionDTO> cuentaList = (List<CuentaConexionDTO>) parms.get("cuentas_cursor");
            CuentaTableModel model = new CuentaTableModel(cuentaList);
            tblCuentas.setModel(model);
          
        } finally {
            sqlSession.close();
        }
    }


    
    public void cargarComboPerfiles(JComboBox<Perfil> cmbPerfiles){
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Perfil> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.PerfilMapper.GET_PERFILES", parms);
            List<Perfil> perfilList = (List<Perfil>) parms.get("perfiles_cursor");
            for (Perfil perfil : perfilList) {
                cmbModel.addElement(perfil);
            }
            cmbPerfiles.removeAllItems();
            cmbModel.setSelectedItem(null);
            cmbPerfiles.setModel(cmbModel);

        } finally {
            sqlSession.close();
        }
    }

    public Boolean insertarCuenta(String rut, String nombre, String apellidoPat, 
            String apellidoMat, String email, String telefono, String contra, Perfil perfil,
            String estado, JTable cuentasTable, CuentaForm cuentaForm) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try{
            
            Map<String, Object> parms = new HashMap<String, Object>();
            BigDecimal estadoSt ;
            if(estado == "Activa"){
                estadoSt = BigDecimal.valueOf(1);
            }else{
                estadoSt = BigDecimal.valueOf(2);
            }
            String contrasena = null;
            if (contra!=null) {
                contrasena = EncryptUtil.sha256Hex(contra);
            }
            
            parms.put("idPerfil",perfil.getIdperfil());
            parms.put("contrasena",contrasena);
            parms.put("correo",email);
            parms.put("idEstado",estadoSt);


            sqlSession.selectOne("com.duoc.mappers.CuentausuarioMapper.INSERT_CUENTA", parms);
            Integer idCuentaNew = (Integer) parms.get("idCuenta");
            if (idCuentaNew != null) {
                Map<String, Object> parmsCol = new HashMap<String, Object>();

                parmsCol.put("nombre",nombre);
                parmsCol.put("telefono",telefono);
                parmsCol.put("idCuentausuario",idCuentaNew);
                parmsCol.put("idTipocolaborador",21);
                parmsCol.put("rut",rut);
                parmsCol.put("apellidoPat",apellidoPat);
                parmsCol.put("apellidoMat",apellidoMat);

                sqlSession.selectOne("com.duoc.mappers.ColaboradorMapper.INSERT_COLABORADOR", parmsCol);

                Integer idColNew = (Integer) parmsCol.get("idColaborador");

                CuentaConexionDTO cuentaDTO = new CuentaConexionDTO();
                Cuentausuario cuen = new Cuentausuario();
                Colaborador col = new Colaborador();
                col.setRut(rut);
                col.setNombre(nombre);
                col.setApellidpaterno(apellidoPat);
                col.setApellidomaterno(apellidoMat);
                col.setIdtipocolaborador(BigDecimal.valueOf(21));
                col.setTelefono(BigDecimal.valueOf(Integer.valueOf(telefono)));
                col.setRut(rut);
                col.setIdcolaborador(BigDecimal.valueOf(idColNew));
                cuen.setIdcuentausuario(BigDecimal.valueOf(idCuentaNew));
                cuen.setCorreoelectronico(email);
                cuen.setEstado(estado);
                cuen.setIdperfil(perfil.getIdperfil());
                cuen.setNombrePerfil(perfil.getDescripcion());
                cuentaDTO.setCol(col);
                cuentaDTO.setCuenta(cuen);
                CuentaTableModel model = ((CuentaTableModel) cuentasTable.getModel());
                model.addToItemList(cuentaDTO);
                
                return true;
            }else{
                return false;
            }
        }catch (PersistenceException pe){
                sqlSession.rollback();
                System.out.println("Error Cause: "+pe.getCause()+" Message: "+pe.getMessage());
                return false;
        }
    }

    public boolean actualizarCuenta(CuentaConexionDTO cuentaAct, JTable cuentasTable, CuentaForm aThis) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try{
            
            Map<String, Object> parms = new HashMap<String, Object>();
            String contrasena = null;
            if (cuentaAct.getCuenta().getContrasena() != null) {
                contrasena = EncryptUtil.sha256Hex(cuentaAct.getCuenta().getContrasena());
            }
         
            parms.put("idColaborador",cuentaAct.getCuenta().getIdperfil());
            parms.put("nombre",cuentaAct.getCol().getNombre());
            parms.put("telefono",cuentaAct.getCol().getTelefono());
            parms.put("idCuentausuario",cuentaAct.getCuenta().getIdcuentausuario());
            parms.put("rut",cuentaAct.getCol().getRut());
            parms.put("apellidoPat",cuentaAct.getCol().getApellidpaterno());
            parms.put("apellidoMat",cuentaAct.getCol().getApellidomaterno());
            parms.put("idPerfil",cuentaAct.getCuenta().getIdperfil());
            parms.put("contrasena",contrasena);
            parms.put("correoElectronico",cuentaAct.getCuenta().getCorreoelectronico());
            parms.put("idEstado",cuentaAct.getCuenta().getIdestado());

            sqlSession.selectOne("com.duoc.mappers.CuentausuarioMapper.UPDATE_CUENTAUSUARIO", parms);

            cargarTablaCuentas(cuentasTable);    
            return true;
        }catch (PersistenceException pe){
                sqlSession.rollback();
                System.out.println("Error Cause: "+pe.getCause()+" Message: "+pe.getMessage());
                return false;
        }
    }
    
    public boolean desactivarCuenta(Integer cuentaAct, JTable cuentasTable) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try{
            
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idCuentausuario",cuentaAct);
            parms.put("idEstado",2);

            sqlSession.selectOne("com.duoc.mappers.CuentausuarioMapper.UPDATE_CUENTAUSUARIO", parms);

            cargarTablaCuentas(cuentasTable);
            return true;
        }catch (PersistenceException pe){
                sqlSession.rollback();
                System.out.println("Error Cause: "+pe.getCause()+" Message: "+pe.getMessage());
                return false;
        }
    }

}
