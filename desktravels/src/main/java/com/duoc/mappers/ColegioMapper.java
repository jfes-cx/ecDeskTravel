package com.duoc.mappers;

import com.duoc.domain.Colegio;
import com.duoc.domain.ColegioCriteria;
import com.duoc.domain.ColegioKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ColegioMapper {

    long countByExample(ColegioCriteria example);

    int deleteByExample(ColegioCriteria example);

    int deleteByPrimaryKey(ColegioKey key);

    int insert(Colegio record);

    int insertSelective(Colegio record);

    List<Colegio> selectByExample(ColegioCriteria example);

    Colegio selectByPrimaryKey(ColegioKey key);

    int updateByExampleSelective(@Param("record") Colegio record, @Param("example") ColegioCriteria example);

    int updateByExample(@Param("record") Colegio record, @Param("example") ColegioCriteria example);

    int updateByPrimaryKeySelective(Colegio record);

    int updateByPrimaryKey(Colegio record);

    void GET_COLEGIOS_BY_COMUNA();

    void GET_COLEGIOS();

    void INSERT_COLEGIO(Map<String, Object> params);
}
