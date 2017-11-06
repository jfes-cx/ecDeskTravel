package com.duoc.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.duoc.domain.Alumno;
import com.duoc.mappers.AlumnoMapper;
import com.duoc.util.MyBatisSqlSessionFactory;


public class AlumnoService {
	private Logger logger = Logger.getLogger(getClass());
	
	
	public List<Alumno> findAllAlumnos(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			AlumnoMapper alumnoMapper = sqlSession.getMapper(AlumnoMapper.class);
			return alumnoMapper.findAllAlumnos();
		}finally{
			sqlSession.close();
		}
	}
	
	public List<Alumno> getAlumnoByCurso(){
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			   Map<String, Object> parms = new HashMap<String, Object>(); 
			   parms.put("idCurso", BigDecimal.valueOf(122));
			   sqlSession.selectList("com.duoc.mappers.AlumnoMapper.OBTENER_ALUMNO_BYCUR", parms); 
			   List<Alumno> alumnoList = (List<Alumno>) parms.get("alumnos_cursor"); 
			   
			return alumnoList;

		}finally{
			sqlSession.close();
		}
	}
	
	
	
	
	
}
