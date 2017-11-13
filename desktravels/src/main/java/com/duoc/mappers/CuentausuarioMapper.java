package com.duoc.mappers;

import com.duoc.domain.Cuentausuario;
import com.duoc.domain.CuentausuarioCriteria;
import com.duoc.domain.CuentausuarioKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CuentausuarioMapper {

    long countByExample(CuentausuarioCriteria example);

    int deleteByExample(CuentausuarioCriteria example);

    int deleteByPrimaryKey(CuentausuarioKey key);

    int insert(Cuentausuario record);

    int insertSelective(Cuentausuario record);

    List<Cuentausuario> selectByExample(CuentausuarioCriteria example);

    Cuentausuario selectByPrimaryKey(CuentausuarioKey key);

    int updateByExampleSelective(@Param("record") Cuentausuario record, @Param("example") CuentausuarioCriteria example);

    int updateByExample(@Param("record") Cuentausuario record, @Param("example") CuentausuarioCriteria example);

    int updateByPrimaryKeySelective(Cuentausuario record);

    int updateByPrimaryKey(Cuentausuario record);

    void autenticarUsuario(Map<String, Object> params);
}
