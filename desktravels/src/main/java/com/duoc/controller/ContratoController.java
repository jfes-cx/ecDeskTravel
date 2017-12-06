package com.duoc.controller;

import com.duoc.domain.Actividadviaje;
import com.duoc.domain.Colegio;
import com.duoc.domain.Curso;
import com.duoc.domain.Paquete;
import com.duoc.domain.Seguro;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.duoc.domain.Servicio;
import com.duoc.util.MyBatisSqlSessionFactory;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ContratoController {

    private Logger logger = Logger.getLogger(getClass());

  
    public BigDecimal stringToBigdecimal(String obj) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        try {
            return (BigDecimal) decimalFormat.parse(obj);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void cargarComboPaquetes(JComboBox<Paquete> cmbPaquete) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Paquete> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.PaqueteMapper.GET_PAQUETES", parms);
            List<Paquete> paqueteList = (List<Paquete>) parms.get("paquetes_cursor");
            for (Paquete paquete : paqueteList) {
                cmbModel.addElement(paquete);
            }
            cmbModel.setSelectedItem(null);
            cmbPaquete.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }
    
    
    public void cargarListaServicios(JList<Servicio> listServicios, BigDecimal idPaquete) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultListModel<Servicio> lstModel = new DefaultListModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idPaquete", idPaquete);
            sqlSession.selectList("com.duoc.mappers.ServicioMapper.GET_SERVICIOS_BY_PAQUETE", parms);
            List<Servicio> servicioList = (List<Servicio>) parms.get("servicios_cursor");
            for (Servicio servicio : servicioList) {
                lstModel.addElement(servicio);
            }
            listServicios.setModel(lstModel);

        } finally {
            sqlSession.close();
        }
    }
    
    public void cargarListaActividades(JList<Actividadviaje> listActividad, BigDecimal idPaquete) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultListModel<Actividadviaje> lstModel = new DefaultListModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idPaquete", idPaquete);
            sqlSession.selectList("com.duoc.mappers.ActividadviajeMapper.GET_ACTIVIDADES_BY_PAQUETE", parms);
            List<Actividadviaje> actividadList = (List<Actividadviaje>) parms.get("actividades_cursor");
            for (Actividadviaje actividad : actividadList) {
                lstModel.addElement(actividad);
            }
            listActividad.setModel(lstModel);

        } finally {
            sqlSession.close();
        }
    }
    
    public void cargarComboActividades(JComboBox<Actividadviaje> cmbActividad) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Actividadviaje> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.ActividadviajeMapper.GET_ACTIVIDADES_EXTRA", parms);
            List<Actividadviaje> actividadList = (List<Actividadviaje>) parms.get("actividades_cursor");
            for (Actividadviaje actividad : actividadList) {
                cmbModel.addElement(actividad);
            }
            cmbModel.setSelectedItem(null);
            cmbActividad.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }
    
    
     public void cargarComboServicios(JComboBox<Servicio> cmbServicio) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Servicio> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.ServicioMapper.GET_SERVICIOS_EXTRA", parms);
            List<Servicio> servicioList = (List<Servicio>) parms.get("servicios_cursor");
            for (Servicio servicio : servicioList) {
                cmbModel.addElement(servicio);
            }
            cmbModel.setSelectedItem(null);
            cmbServicio.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }
     
     public Boolean insertContrato(Curso curso, Paquete paquete, ArrayList<Actividadviaje> actividadesArray,
             ArrayList<Servicio> serviciosArray, ArrayList<Seguro> segurosArray, Date fecha, String cantDiasSt,
             String cantAlumnosSt, String totalContratoSt,Colegio colegio) {

        BigDecimal cantDias = this.stringToBigdecimal(cantDiasSt);
        BigDecimal totalContrato = this.stringToBigdecimal(totalContratoSt);
        BigDecimal cantAlumnos = this.stringToBigdecimal(cantAlumnosSt);
        
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("total",totalContrato);
        parms.put("idcolaborador",5);
        parms.put("fechainicio",fecha);
        parms.put("idpaquete",paquete.getIdpaquete());
        parms.put("idcurso",curso.getIdcurso());
        parms.put("fechatermino",fecha);
        parms.put("nombre","Contrato Gira de Estudio "+curso.getNombre()+" "+colegio.getNombre());
        parms.put("dias",cantDias);
        parms.put("alumnos",cantAlumnos);
        
        sqlSession.selectOne("com.duoc.mappers.ContratoMapper.INSERT_CONTRATO", parms);
        Integer idContrato = (Integer) parms.get("idcontrato");
        if (idContrato != null) {
            for (Actividadviaje actividad : actividadesArray ) {
                Map<String, Object> parmsAct = new HashMap<String, Object>();
                parmsAct.put("idcontrato", idContrato);
                parmsAct.put("idactividad", actividad.getIdactividadviaje());
                sqlSession.selectOne("com.duoc.mappers.MidActividadCtMapper.INSERT_MID_ACTIVIDAD_CT", parmsAct);
            }
            for (Servicio servicio : serviciosArray) {
                Map<String, Object> parmsServ = new HashMap<String, Object>();
                parmsServ.put("idcontrato", idContrato);
                parmsServ.put("idservicio", servicio.getIdservicio());
                sqlSession.selectOne("com.duoc.mappers.MidServicioCtMapper.INSERT_MID_SERVICIO_CT", parmsServ);
            }
            for (Seguro seguro : segurosArray ) {
                Map<String, Object> parmsSeg = new HashMap<String, Object>();
                parmsSeg.put("idcontrato", idContrato);
                parmsSeg.put("idpoliza", seguro.getID());
                sqlSession.selectOne("com.duoc.mappers.MidPolizaCtMapper.INSERT_MID_ACTIVIDAD_CT", parmsSeg);
            }
            return true;
        } else {
            return false;
        }
    }


}
