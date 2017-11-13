package com.duoc.mappers;

import com.duoc.domain.Tipocontrato;
import com.duoc.domain.TipocontratoCriteria;
import com.duoc.domain.TipocontratoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipocontratoMapper {

    long countByExample(TipocontratoCriteria example);

    int deleteByExample(TipocontratoCriteria example);

    int deleteByPrimaryKey(TipocontratoKey key);

    int insert(Tipocontrato record);

    int insertSelective(Tipocontrato record);

    List<Tipocontrato> selectByExample(TipocontratoCriteria example);

    Tipocontrato selectByPrimaryKey(TipocontratoKey key);

    int updateByExampleSelective(@Param("record") Tipocontrato record, @Param("example") TipocontratoCriteria example);

    int updateByExample(@Param("record") Tipocontrato record, @Param("example") TipocontratoCriteria example);

    int updateByPrimaryKeySelective(Tipocontrato record);

    int updateByPrimaryKey(Tipocontrato record);
}
