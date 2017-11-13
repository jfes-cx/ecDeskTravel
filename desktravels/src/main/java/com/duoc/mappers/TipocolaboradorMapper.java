package com.duoc.mappers;

import com.duoc.domain.Tipocolaborador;
import com.duoc.domain.TipocolaboradorCriteria;
import com.duoc.domain.TipocolaboradorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipocolaboradorMapper {

    long countByExample(TipocolaboradorCriteria example);

    int deleteByExample(TipocolaboradorCriteria example);

    int deleteByPrimaryKey(TipocolaboradorKey key);

    int insert(Tipocolaborador record);

    int insertSelective(Tipocolaborador record);

    List<Tipocolaborador> selectByExample(TipocolaboradorCriteria example);

    Tipocolaborador selectByPrimaryKey(TipocolaboradorKey key);

    int updateByExampleSelective(@Param("record") Tipocolaborador record, @Param("example") TipocolaboradorCriteria example);

    int updateByExample(@Param("record") Tipocolaborador record, @Param("example") TipocolaboradorCriteria example);

    int updateByPrimaryKeySelective(Tipocolaborador record);

    int updateByPrimaryKey(Tipocolaborador record);
}
