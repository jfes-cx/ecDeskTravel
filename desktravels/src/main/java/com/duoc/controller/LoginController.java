/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.duoc.controller;

import com.duoc.domain.Alumno;
import com.duoc.domain.Colegio;
import com.duoc.domain.Cuentausuario;
import com.duoc.domain.Curso;
import com.duoc.mappers.AlumnoMapper;
import com.duoc.ui.DeskTravelMain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static java.security.spec.MGF1ParameterSpec.SHA1;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import com.duoc.util.MyBatisSqlSessionFactory;

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
    
  
    
    public String sha256Hex(String input) {
        String sha256 = null;
        sha256 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(input);  
        return sha256;
    }
    
    public ArrayList<String> autenticar(String user,String password) {
    	SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			try {
				   Map<String, Object> parms = new HashMap<String, Object>(); 
				   parms.put("correo",user);
				   sqlSession.selectOne("com.duoc.mappers.CuentausuarioMapper.autenticarUsuario", parms); 
				   Object cuentaResult = parms.get("pssw");
				   String psswdString = null;
				   String idPerfil = null;
				   String nombrePerfil=null;
				   ArrayList<String> result = new ArrayList<>();
				   if(cuentaResult != null) {
					   String sha1val = sha256Hex(password);
					   if(sha1val.equals(parms.get("pssw").toString())){
						   result.add(0,"1");
						   result.add(1,"Usuario autenticado correctamente");
						   result.add(2,user);
						   result.add(3,parms.get("idperfil").toString());
						   result.add(4,parms.get("nomperfil").toString());
					   }else {
						   result.add(0,"0");
						   result.add(1,"Contraseña no coincide, intente nuevamente");
					   } 
				   }else {
					   result.add(0,"0");
					   result.add(1,"Cuenta no encontrada, intente nuevamente");
				   }
				   
				   return result;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				ArrayList<String> result = new ArrayList<>();
				result.add(0,"0");
				result.add(1,"Error: "+e.getMessage());
				return result;
			}
		}finally{
			sqlSession.close();
		}
    }
}
