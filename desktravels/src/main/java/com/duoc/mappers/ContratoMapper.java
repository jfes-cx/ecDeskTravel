package com.duoc.mappers;

import com.duoc.domain.Contrato;
import com.duoc.domain.ContratoCriteria;
import com.duoc.domain.ContratoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContratoMapper {
    long countByExample(ContratoCriteria example);

    int deleteByExample(ContratoCriteria example);

    int deleteByPrimaryKey(ContratoKey key);

    int insert(Contrato record);

    int insertSelective(Contrato record);

    List<Contrato> selectByExample(ContratoCriteria example);

    Contrato selectByPrimaryKey(ContratoKey key);

    int updateByExampleSelective(@Param("record") Contrato record, @Param("example") ContratoCriteria example);

    int updateByExample(@Param("record") Contrato record, @Param("example") ContratoCriteria example);

    int updateByPrimaryKeySelective(Contrato record);

    int updateByPrimaryKey(Contrato record);
}