package com.duoc.mappers;

import com.duoc.domain.Alumno;
import com.duoc.domain.AlumnoCriteria;
import com.duoc.domain.AlumnoKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AlumnoMapper {

    long countByExample(AlumnoCriteria example);

    int deleteByExample(AlumnoCriteria example);

    int deleteByPrimaryKey(AlumnoKey key);

    int insert(Alumno record);

    int insertSelective(Alumno record);

    List<Alumno> selectByExample(AlumnoCriteria example);

    List<Alumno> findAllAlumnos();

    void GET_ALUMNOS_BY_CUR();

    void INSERT_ALUMNO(Map<String, Object> params);

    Alumno selectByPrimaryKey(AlumnoKey key);

    int updateByExampleSelective(@Param("record") Alumno record, @Param("example") AlumnoCriteria example);

    int updateByExample(@Param("record") Alumno record, @Param("example") AlumnoCriteria example);

    int updateByPrimaryKeySelective(Alumno record);

    int updateByPrimaryKey(Alumno record);
}
