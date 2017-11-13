package com.duoc.mappers;

import com.duoc.domain.Itinerario;
import com.duoc.domain.ItinerarioCriteria;
import com.duoc.domain.ItinerarioKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItinerarioMapper {

    long countByExample(ItinerarioCriteria example);

    int deleteByExample(ItinerarioCriteria example);

    int deleteByPrimaryKey(ItinerarioKey key);

    int insert(Itinerario record);

    int insertSelective(Itinerario record);

    List<Itinerario> selectByExample(ItinerarioCriteria example);

    Itinerario selectByPrimaryKey(ItinerarioKey key);

    int updateByExampleSelective(@Param("record") Itinerario record, @Param("example") ItinerarioCriteria example);

    int updateByExample(@Param("record") Itinerario record, @Param("example") ItinerarioCriteria example);

    int updateByPrimaryKeySelective(Itinerario record);

    int updateByPrimaryKey(Itinerario record);
}
