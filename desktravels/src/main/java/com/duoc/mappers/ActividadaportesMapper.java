package com.duoc.mappers;

import com.duoc.domain.Actividadaportes;
import com.duoc.domain.ActividadaportesCriteria;
import com.duoc.domain.ActividadaportesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActividadaportesMapper {
    long countByExample(ActividadaportesCriteria example);

    int deleteByExample(ActividadaportesCriteria example);

    int deleteByPrimaryKey(ActividadaportesKey key);

    int insert(Actividadaportes record);

    int insertSelective(Actividadaportes record);

    List<Actividadaportes> selectByExample(ActividadaportesCriteria example);

    Actividadaportes selectByPrimaryKey(ActividadaportesKey key);

    int updateByExampleSelective(@Param("record") Actividadaportes record, @Param("example") ActividadaportesCriteria example);

    int updateByExample(@Param("record") Actividadaportes record, @Param("example") ActividadaportesCriteria example);

    int updateByPrimaryKeySelective(Actividadaportes record);

    int updateByPrimaryKey(Actividadaportes record);
}