package com.duoc.mappers;

import com.duoc.domain.Servicio;
import com.duoc.domain.ServicioCriteria;
import com.duoc.domain.ServicioKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicioMapper {
    long countByExample(ServicioCriteria example);

    int deleteByExample(ServicioCriteria example);

    int deleteByPrimaryKey(ServicioKey key);

    int insert(Servicio record);

    int insertSelective(Servicio record);

    List<Servicio> selectByExample(ServicioCriteria example);

    Servicio selectByPrimaryKey(ServicioKey key);

    int updateByExampleSelective(@Param("record") Servicio record, @Param("example") ServicioCriteria example);

    int updateByExample(@Param("record") Servicio record, @Param("example") ServicioCriteria example);

    int updateByPrimaryKeySelective(Servicio record);

    int updateByPrimaryKey(Servicio record);
}