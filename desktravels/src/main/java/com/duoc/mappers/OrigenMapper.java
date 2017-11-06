package com.duoc.mappers;

import com.duoc.domain.Origen;
import com.duoc.domain.OrigenCriteria;
import com.duoc.domain.OrigenKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrigenMapper {
    long countByExample(OrigenCriteria example);

    int deleteByExample(OrigenCriteria example);

    int deleteByPrimaryKey(OrigenKey key);

    int insert(Origen record);

    int insertSelective(Origen record);

    List<Origen> selectByExample(OrigenCriteria example);

    Origen selectByPrimaryKey(OrigenKey key);

    int updateByExampleSelective(@Param("record") Origen record, @Param("example") OrigenCriteria example);

    int updateByExample(@Param("record") Origen record, @Param("example") OrigenCriteria example);

    int updateByPrimaryKeySelective(Origen record);

    int updateByPrimaryKey(Origen record);
}