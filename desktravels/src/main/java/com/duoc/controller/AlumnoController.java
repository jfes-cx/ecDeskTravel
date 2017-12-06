package com.duoc.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.ibatis.session.SqlSession;

import com.duoc.domain.Alumno;
import com.duoc.util.MyBatisSqlSessionFactory;

public class AlumnoController {

    public Boolean actualizarTablaAlumnos(String nombre, String direccion, String telefono, String correo, String rut,
            BigDecimal idcurso, JTable tblAlumnos) {

        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("nombre", nombre);
        parms.put("rut", rut);
        parms.put("direccion", direccion);
        parms.put("correo", correo);
        parms.put("telefono", telefono);
        parms.put("idCurso", idcurso);
        parms.put("idApoderado", null);

        sqlSession.selectOne("com.duoc.mappers.AlumnoMapper.INSERT_ALUMNO", parms);
        Integer result = (Integer) parms.get("idAlumno");
        if (result != null) {
            Alumno al = new Alumno();
            Object[] newRowData = {nombre, rut, correo, "No Asignado"};
            DefaultTableModel defTableModel = (DefaultTableModel) tblAlumnos.getModel();
            defTableModel.addRow(newRowData);
            return true;
        } else {

            return false;
        }
    }

    public void cargarTablaAlumnos(BigDecimal idcurso, JTable tblAlumnos) {

        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            Object[][] data = {{}};
            String[] columnNames = {"Nombre", "RUT", "Correo", "Apoderado"};
            DefaultTableModel defTableModel = new DefaultTableModel(null, columnNames);
            Map<String, Object> parms = new HashMap<String, Object>();
            parms.put("idCurso", idcurso);
            sqlSession.selectList("com.duoc.mappers.AlumnoMapper.GET_ALUMNOS_BY_CUR", parms);
            List<Alumno> alumnoList = (List<Alumno>) parms.get("alumnos_cursor");
            String apell = "";
            for (Alumno al : alumnoList) {
                if (al.getApellidos() != null) {
                    apell = al.getApellidos();
                }
                Object[] newRowData = {al.getNombre() + " " + apell, al.getRut(), al.getCorreoelectronico(),
                    al.getIdapoderado()};
                defTableModel.addRow(newRowData);
            }
            tblAlumnos.setModel(defTableModel);
        } finally {
            sqlSession.close();
        }
    }

}
