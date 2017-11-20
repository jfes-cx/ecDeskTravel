package com.duoc.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.duoc.domain.Colegio;
import com.duoc.domain.Comuna;
import com.duoc.domain.Curso;
import com.duoc.domain.Pago;
import com.duoc.domain.Region;
import com.duoc.util.MyBatisSqlSessionFactory;
import javax.swing.JTextField;

public class CursoController {

    private Curso cursoModel;
    private Colegio colegioModel;
    private Logger logger = Logger.getLogger(getClass());

    public void actualizarComunas(BigDecimal idregion, JComboBox<Comuna> cmbComunaColegio) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Comuna> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idRegion", idregion);
            sqlSession.selectList("com.duoc.mappers.ComunaMapper.GET_COMUNAS_BY_REG", parms);
            List<Comuna> comunaList = (List<Comuna>) parms.get("comunas_cursor");
            for (Comuna comuna : comunaList) {
                cmbModel.addElement(comuna);
            }
            cmbComunaColegio.removeAllItems();
            cmbModel.setSelectedItem(null);
            cmbComunaColegio.setModel(cmbModel);

        } finally {
            sqlSession.close();
        }
    }

    public void cargarListaCursos(JList<Curso> listCursos, BigDecimal idcolegio) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultListModel<Curso> lstModel = new DefaultListModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idColegio", idcolegio);
            sqlSession.selectList("com.duoc.mappers.CursoMapper.GET_CURSOS_BY_COL", parms);
            List<Curso> cursoList = (List<Curso>) parms.get("cursos_cursor");
            for (Curso curso : cursoList) {
                lstModel.addElement(curso);
            }
            listCursos.setModel(lstModel);

        } finally {
            sqlSession.close();
        }

    }

    public void cargarListaColegiosComuna(JList<Colegio> listColegios, BigDecimal idComuna) {
        DefaultListModel<Colegio> listModel = new DefaultListModel<>();
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("idComuna", idComuna);
        sqlSession.selectList("com.duoc.mappers.ColegioMapper.GET_COLEGIOS_BY_COMUNA", parms);
        List<Colegio> colegioList = (List<Colegio>) parms.get("colegios_cursor");
        for (Colegio colegio : colegioList) {
            listModel.addElement(colegio);
        }

        listColegios.setModel(listModel);
    }

    public void cargarListaColegios(JList<Colegio> listColegios) {

        DefaultListModel<Colegio> listModel = new DefaultListModel<>();
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        sqlSession.selectList("com.duoc.mappers.ColegioMapper.GET_COLEGIOS", parms);
        List<Colegio> colegioList = (List<Colegio>) parms.get("colegios_cursor");
        for (Colegio colegio : colegioList) {
            listModel.addElement(colegio);
        }

        listColegios.setModel(listModel);
    }

    public Boolean actualizarListaCurso(String nombre, String profeJefe, Colegio col, JList<Curso> listCursos) {

        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("nombre", nombre);
        parms.put("profeJefe", profeJefe);
        parms.put("idColegio", col.getIdcolegio());

        sqlSession.selectOne("com.duoc.mappers.CursoMapper.INSERT_CURSO", parms);
        Integer result = (Integer) parms.get("idCurso");
        if (result != null) {
            Curso cur = new Curso();
            cur.setIdcurso(BigDecimal.valueOf(result));
            cur.setNombre(nombre);
            cur.setIdcolegio(col.getIdcolegio());
            cur.setProfesorjefe(profeJefe);
            ((DefaultListModel) listCursos.getModel()).addElement(cur);
            return true;
        } else {

            return false;
        }
    }

    public Boolean actualizarListaColegio(String nombre, String direccion, String telefono, Comuna comuna,
            JList<Colegio> listColegios) {

        BigDecimal tel = this.stringToBigdecimal(telefono);
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("nombre", nombre);
        parms.put("direccion", direccion);
        parms.put("telefono", tel);
        parms.put("idComuna", comuna.getIdcomuna());

        sqlSession.selectOne("com.duoc.mappers.ColegioMapper.INSERT_COLEGIO", parms);
        Integer result = (Integer) parms.get("idColegio");
        if (result != null) {
            Colegio col = new Colegio();
            col.setIdcolegio(BigDecimal.valueOf(result));
            col.setNombre(nombre);
            col.setIdcomuna(comuna.getIdcomuna());
            col.setTelefono(tel);
            ((DefaultListModel) listColegios.getModel()).addElement(col);
            return true;
        } else {

            return false;
        }
    }

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

    public void cargarComboRegion(JComboBox<Region> cmbRegion) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Region> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.RegionMapper.GET_REGIONES", parms);
            List<Region> regionList = (List<Region>) parms.get("regiones_cursor");
            for (Region region : regionList) {
                cmbModel.addElement(region);
            }
            cmbModel.setSelectedItem(null);
            cmbRegion.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }

    public void actualizarComboColegios(BigDecimal idcomuna, JComboBox<Colegio> cmbColegio) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Colegio> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            sqlSession.selectList("com.duoc.mappers.ColegioMapper.GET_COLEGIOS", parms);
            List<Colegio> colegioList = (List<Colegio>) parms.get("colegios_cursor");
            for (Colegio colegio : colegioList) {
                cmbModel.addElement(colegio);
            }
            cmbModel.setSelectedItem(null);
            cmbColegio.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }

    public void actualizarCursos(BigDecimal idcolegio, JComboBox<Curso> cmbCurso) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultComboBoxModel<Curso> cmbModel = new DefaultComboBoxModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idColegio", idcolegio);
            sqlSession.selectList("com.duoc.mappers.CursoMapper.GET_CURSOS_BY_COL", parms);
            List<Curso> cursoList = (List<Curso>) parms.get("cursos_cursor");
            for (Curso curso : cursoList) {
                cmbModel.addElement(curso);
            }
            cmbModel.setSelectedItem(null);
            cmbCurso.setModel(cmbModel);
        } finally {
            sqlSession.close();
        }
    }

    public void cargarListaPagos(BigDecimal idcurso, JList<Pago> listPagos,JTextField txtMeta, JTextField txtTotalAcumulado) {
       SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            DefaultListModel<Pago> lstModel = new DefaultListModel<>();
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idCurso", idcurso);
            sqlSession.selectList("com.duoc.mappers.PagoMapper.GET_PAGOS_BY_CURSO", parms);
            List<Pago> pagoList = (List<Pago>) parms.get("pagos_cursor");
            for (Pago pago : pagoList) {
                lstModel.addElement(pago);
            }
            listPagos.setModel(lstModel);
            
            Map<String, Object> parmsCur = new HashMap<String, Object>();
            parmsCur.put("idCurso",idcurso);
            sqlSession.selectOne("com.duoc.mappers.CursoMapper.GET_MONTOS", parmsCur);
            Integer meta = (Integer) parmsCur.get("meta");
            Integer monto = (Integer) parmsCur.get("monto");
            if (meta != null && monto != null) {
                txtMeta.setText(meta.toString());
                txtTotalAcumulado.setText(monto.toString());
            }
        } finally {
            sqlSession.close();
        }
    }
}
