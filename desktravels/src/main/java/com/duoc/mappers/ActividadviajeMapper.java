package com.duoc.mappers;

import com.duoc.domain.Actividadviaje;
import com.duoc.domain.ActividadviajeCriteria;
import com.duoc.domain.ActividadviajeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActividadviajeMapper {

    long countByExample(ActividadviajeCriteria example);

    int deleteByExample(ActividadviajeCriteria example);

    int deleteByPrimaryKey(ActividadviajeKey key);

    int insert(Actividadviaje record);

    int insertSelective(Actividadviaje record);

    List<Actividadviaje> selectByExample(ActividadviajeCriteria example);

    Actividadviaje selectByPrimaryKey(ActividadviajeKey key);

    int updateByExampleSelective(@Param("record") Actividadviaje record, @Param("example") ActividadviajeCriteria example);

    int updateByExample(@Param("record") Actividadviaje record, @Param("example") ActividadviajeCriteria example);

    int updateByPrimaryKeySelective(Actividadviaje record);

    int updateByPrimaryKey(Actividadviaje record);
}
