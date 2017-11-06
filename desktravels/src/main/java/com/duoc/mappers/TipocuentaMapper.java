package com.duoc.mappers;

import com.duoc.domain.Tipocuenta;
import com.duoc.domain.TipocuentaCriteria;
import com.duoc.domain.TipocuentaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipocuentaMapper {
    long countByExample(TipocuentaCriteria example);

    int deleteByExample(TipocuentaCriteria example);

    int deleteByPrimaryKey(TipocuentaKey key);

    int insert(Tipocuenta record);

    int insertSelective(Tipocuenta record);

    List<Tipocuenta> selectByExample(TipocuentaCriteria example);

    Tipocuenta selectByPrimaryKey(TipocuentaKey key);

    int updateByExampleSelective(@Param("record") Tipocuenta record, @Param("example") TipocuentaCriteria example);

    int updateByExample(@Param("record") Tipocuenta record, @Param("example") TipocuentaCriteria example);

    int updateByPrimaryKeySelective(Tipocuenta record);

    int updateByPrimaryKey(Tipocuenta record);
}