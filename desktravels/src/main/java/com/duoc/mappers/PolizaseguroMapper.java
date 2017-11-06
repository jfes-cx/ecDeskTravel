package com.duoc.mappers;

import com.duoc.domain.Polizaseguro;
import com.duoc.domain.PolizaseguroCriteria;
import com.duoc.domain.PolizaseguroKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PolizaseguroMapper {
    long countByExample(PolizaseguroCriteria example);

    int deleteByExample(PolizaseguroCriteria example);

    int deleteByPrimaryKey(PolizaseguroKey key);

    int insert(Polizaseguro record);

    int insertSelective(Polizaseguro record);

    List<Polizaseguro> selectByExample(PolizaseguroCriteria example);

    Polizaseguro selectByPrimaryKey(PolizaseguroKey key);

    int updateByExampleSelective(@Param("record") Polizaseguro record, @Param("example") PolizaseguroCriteria example);

    int updateByExample(@Param("record") Polizaseguro record, @Param("example") PolizaseguroCriteria example);

    int updateByPrimaryKeySelective(Polizaseguro record);

    int updateByPrimaryKey(Polizaseguro record);
}