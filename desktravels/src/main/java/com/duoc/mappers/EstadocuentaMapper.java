package com.duoc.mappers;

import com.duoc.domain.Estadocuenta;
import com.duoc.domain.EstadocuentaCriteria;
import com.duoc.domain.EstadocuentaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EstadocuentaMapper {

    long countByExample(EstadocuentaCriteria example);

    int deleteByExample(EstadocuentaCriteria example);

    int deleteByPrimaryKey(EstadocuentaKey key);

    int insert(Estadocuenta record);

    int insertSelective(Estadocuenta record);

    List<Estadocuenta> selectByExample(EstadocuentaCriteria example);

    Estadocuenta selectByPrimaryKey(EstadocuentaKey key);

    int updateByExampleSelective(@Param("record") Estadocuenta record, @Param("example") EstadocuentaCriteria example);

    int updateByExample(@Param("record") Estadocuenta record, @Param("example") EstadocuentaCriteria example);

    int updateByPrimaryKeySelective(Estadocuenta record);

    int updateByPrimaryKey(Estadocuenta record);
}
