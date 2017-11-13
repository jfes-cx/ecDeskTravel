package com.duoc.mappers;

import com.duoc.domain.Actividad;
import com.duoc.domain.ActividadCriteria;
import com.duoc.domain.ActividadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActividadMapper {

    long countByExample(ActividadCriteria example);

    int deleteByExample(ActividadCriteria example);

    int deleteByPrimaryKey(ActividadKey key);

    int insert(Actividad record);

    int insertSelective(Actividad record);

    List<Actividad> selectByExample(ActividadCriteria example);

    Actividad selectByPrimaryKey(ActividadKey key);

    int updateByExampleSelective(@Param("record") Actividad record, @Param("example") ActividadCriteria example);

    int updateByExample(@Param("record") Actividad record, @Param("example") ActividadCriteria example);

    int updateByPrimaryKeySelective(Actividad record);

    int updateByPrimaryKey(Actividad record);
}
