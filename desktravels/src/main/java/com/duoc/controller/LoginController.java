/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.duoc.controller;

import com.duoc.domain.Colegio;
import com.duoc.domain.Curso;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import com.duoc.util.MyBatisSqlSessionFactory;
import com.duoc.util.EncryptUtil;

/**
 *
 * @author Integer
 */
public class LoginController {

    private Curso cursoModel;
    private Colegio colegioModel;
    private Logger logger = Logger.getLogger(getClass());

    public LoginController() {
        this.cursoModel = new Curso();
    }


    public ArrayList<String> autenticar(String user, String password) {
        SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
        try {
            try {
                Map<String, Object> parms = new HashMap<String, Object>();
                parms.put("correo", user);
                sqlSession.selectOne("com.duoc.mappers.CuentausuarioMapper.autenticarUsuario", parms);
                Object cuentaResult = parms.get("pssw");
                String psswdString = null;
                String idPerfil = null;
                String nombrePerfil = null;
                ArrayList<String> result = new ArrayList<>();
                if (cuentaResult != null) {
                    String sha1val = EncryptUtil.sha256Hex(password);
                    System.out.println("Sha1: "+sha1val);
                    if (sha1val.equals(parms.get("pssw").toString())) {
                        result.add(0, "1");
                        result.add(1, "Usuario autenticado correctamente");
                        result.add(2, user);
                        result.add(3, parms.get("idperfil").toString());
                        result.add(4, parms.get("nomperfil").toString());
                    } else {
                        result.add(0, "0");
                        result.add(1, "Contraseña no coincide, intente nuevamente");
                    }
                } else {
                    result.add(0, "0");
                    result.add(1, "Cuenta no encontrada, intente nuevamente");
                }

                return result;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                ArrayList<String> result = new ArrayList<>();
                result.add(0, "0");
                result.add(1, "Error: " + e.getMessage());
                return result;
            }
        } finally {
            sqlSession.close();
        }
    }
}
