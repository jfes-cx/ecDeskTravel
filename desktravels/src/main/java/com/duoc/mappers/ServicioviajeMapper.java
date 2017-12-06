package com.duoc.mappers;

import com.duoc.domain.Servicioviaje;
import com.duoc.domain.ServicioviajeCriteria;
import com.duoc.domain.ServicioviajeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicioviajeMapper {
    long countByExample(ServicioviajeCriteria example);

    int deleteByExample(ServicioviajeCriteria example);

    int deleteByPrimaryKey(ServicioviajeKey key);

    int insert(Servicioviaje record);

    int insertSelective(Servicioviaje record);

    List<Servicioviaje> selectByExample(ServicioviajeCriteria example);

    Servicioviaje selectByPrimaryKey(ServicioviajeKey key);

    int updateByExampleSelective(@Param("record") Servicioviaje record, @Param("example") ServicioviajeCriteria example);

    int updateByExample(@Param("record") Servicioviaje record, @Param("example") ServicioviajeCriteria example);

    int updateByPrimaryKeySelective(Servicioviaje record);

    int updateByPrimaryKey(Servicioviaje record);
}