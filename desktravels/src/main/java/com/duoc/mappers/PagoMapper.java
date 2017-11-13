package com.duoc.mappers;

import com.duoc.domain.Pago;
import com.duoc.domain.PagoCriteria;
import com.duoc.domain.PagoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PagoMapper {

    long countByExample(PagoCriteria example);

    int deleteByExample(PagoCriteria example);

    int deleteByPrimaryKey(PagoKey key);

    int insert(Pago record);

    int insertSelective(Pago record);

    List<Pago> selectByExample(PagoCriteria example);

    Pago selectByPrimaryKey(PagoKey key);

    int updateByExampleSelective(@Param("record") Pago record, @Param("example") PagoCriteria example);

    int updateByExample(@Param("record") Pago record, @Param("example") PagoCriteria example);

    int updateByPrimaryKeySelective(Pago record);

    int updateByPrimaryKey(Pago record);
    
    void GET_PAGOS_BY_CURSO();
}
