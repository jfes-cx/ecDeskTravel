package com.duoc.mappers;

import com.duoc.domain.Tipoactividadviaje;
import com.duoc.domain.TipoactividadviajeCriteria;
import com.duoc.domain.TipoactividadviajeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoactividadviajeMapper {
    long countByExample(TipoactividadviajeCriteria example);

    int deleteByExample(TipoactividadviajeCriteria example);

    int deleteByPrimaryKey(TipoactividadviajeKey key);

    int insert(Tipoactividadviaje record);

    int insertSelective(Tipoactividadviaje record);

    List<Tipoactividadviaje> selectByExample(TipoactividadviajeCriteria example);

    Tipoactividadviaje selectByPrimaryKey(TipoactividadviajeKey key);

    int updateByExampleSelective(@Param("record") Tipoactividadviaje record, @Param("example") TipoactividadviajeCriteria example);

    int updateByExample(@Param("record") Tipoactividadviaje record, @Param("example") TipoactividadviajeCriteria example);

    int updateByPrimaryKeySelective(Tipoactividadviaje record);

    int updateByPrimaryKey(Tipoactividadviaje record);
}