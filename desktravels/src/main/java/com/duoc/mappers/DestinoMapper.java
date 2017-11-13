package com.duoc.mappers;

import com.duoc.domain.Destino;
import com.duoc.domain.DestinoCriteria;
import com.duoc.domain.DestinoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DestinoMapper {

    long countByExample(DestinoCriteria example);

    int deleteByExample(DestinoCriteria example);

    int deleteByPrimaryKey(DestinoKey key);

    int insert(Destino record);

    int insertSelective(Destino record);

    List<Destino> selectByExample(DestinoCriteria example);

    Destino selectByPrimaryKey(DestinoKey key);

    int updateByExampleSelective(@Param("record") Destino record, @Param("example") DestinoCriteria example);

    int updateByExample(@Param("record") Destino record, @Param("example") DestinoCriteria example);

    int updateByPrimaryKeySelective(Destino record);

    int updateByPrimaryKey(Destino record);
}
