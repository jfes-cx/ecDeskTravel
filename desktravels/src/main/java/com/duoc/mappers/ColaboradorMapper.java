package com.duoc.mappers;

import com.duoc.domain.Colaborador;
import com.duoc.domain.ColaboradorCriteria;
import com.duoc.domain.ColaboradorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColaboradorMapper {
    long countByExample(ColaboradorCriteria example);

    int deleteByExample(ColaboradorCriteria example);

    int deleteByPrimaryKey(ColaboradorKey key);

    int insert(Colaborador record);

    int insertSelective(Colaborador record);

    List<Colaborador> selectByExample(ColaboradorCriteria example);

    Colaborador selectByPrimaryKey(ColaboradorKey key);

    int updateByExampleSelective(@Param("record") Colaborador record, @Param("example") ColaboradorCriteria example);

    int updateByExample(@Param("record") Colaborador record, @Param("example") ColaboradorCriteria example);

    int updateByPrimaryKeySelective(Colaborador record);

    int updateByPrimaryKey(Colaborador record);
}