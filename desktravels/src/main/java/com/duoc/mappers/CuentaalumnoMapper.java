package com.duoc.mappers;

import com.duoc.domain.Cuentaalumno;
import com.duoc.domain.CuentaalumnoCriteria;
import com.duoc.domain.CuentaalumnoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuentaalumnoMapper {

    long countByExample(CuentaalumnoCriteria example);

    int deleteByExample(CuentaalumnoCriteria example);

    int deleteByPrimaryKey(CuentaalumnoKey key);

    int insert(Cuentaalumno record);

    int insertSelective(Cuentaalumno record);

    List<Cuentaalumno> selectByExample(CuentaalumnoCriteria example);

    Cuentaalumno selectByPrimaryKey(CuentaalumnoKey key);

    int updateByExampleSelective(@Param("record") Cuentaalumno record, @Param("example") CuentaalumnoCriteria example);

    int updateByExample(@Param("record") Cuentaalumno record, @Param("example") CuentaalumnoCriteria example);

    int updateByPrimaryKeySelective(Cuentaalumno record);

    int updateByPrimaryKey(Cuentaalumno record);
}
