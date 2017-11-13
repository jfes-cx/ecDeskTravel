package com.duoc.mappers;

import com.duoc.domain.Tipopago;
import com.duoc.domain.TipopagoCriteria;
import com.duoc.domain.TipopagoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipopagoMapper {

    long countByExample(TipopagoCriteria example);

    int deleteByExample(TipopagoCriteria example);

    int deleteByPrimaryKey(TipopagoKey key);

    int insert(Tipopago record);

    int insertSelective(Tipopago record);

    List<Tipopago> selectByExample(TipopagoCriteria example);

    Tipopago selectByPrimaryKey(TipopagoKey key);

    int updateByExampleSelective(@Param("record") Tipopago record, @Param("example") TipopagoCriteria example);

    int updateByExample(@Param("record") Tipopago record, @Param("example") TipopagoCriteria example);

    int updateByPrimaryKeySelective(Tipopago record);

    int updateByPrimaryKey(Tipopago record);
}
