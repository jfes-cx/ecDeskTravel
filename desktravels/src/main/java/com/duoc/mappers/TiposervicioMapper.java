package com.duoc.mappers;

import com.duoc.domain.Tiposervicio;
import com.duoc.domain.TiposervicioCriteria;
import com.duoc.domain.TiposervicioKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiposervicioMapper {
    long countByExample(TiposervicioCriteria example);

    int deleteByExample(TiposervicioCriteria example);

    int deleteByPrimaryKey(TiposervicioKey key);

    int insert(Tiposervicio record);

    int insertSelective(Tiposervicio record);

    List<Tiposervicio> selectByExample(TiposervicioCriteria example);

    Tiposervicio selectByPrimaryKey(TiposervicioKey key);

    int updateByExampleSelective(@Param("record") Tiposervicio record, @Param("example") TiposervicioCriteria example);

    int updateByExample(@Param("record") Tiposervicio record, @Param("example") TiposervicioCriteria example);

    int updateByPrimaryKeySelective(Tiposervicio record);

    int updateByPrimaryKey(Tiposervicio record);
}