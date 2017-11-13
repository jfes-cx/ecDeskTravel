package com.duoc.mappers;

import com.duoc.domain.Tipoactividad;
import com.duoc.domain.TipoactividadCriteria;
import com.duoc.domain.TipoactividadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoactividadMapper {

    long countByExample(TipoactividadCriteria example);

    int deleteByExample(TipoactividadCriteria example);

    int deleteByPrimaryKey(TipoactividadKey key);

    int insert(Tipoactividad record);

    int insertSelective(Tipoactividad record);

    List<Tipoactividad> selectByExample(TipoactividadCriteria example);

    Tipoactividad selectByPrimaryKey(TipoactividadKey key);

    int updateByExampleSelective(@Param("record") Tipoactividad record, @Param("example") TipoactividadCriteria example);

    int updateByExample(@Param("record") Tipoactividad record, @Param("example") TipoactividadCriteria example);

    int updateByPrimaryKeySelective(Tipoactividad record);

    int updateByPrimaryKey(Tipoactividad record);
}
