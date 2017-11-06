package com.duoc.mappers;

import com.duoc.domain.Aseguradora;
import com.duoc.domain.AseguradoraCriteria;
import com.duoc.domain.AseguradoraKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AseguradoraMapper {
    long countByExample(AseguradoraCriteria example);

    int deleteByExample(AseguradoraCriteria example);

    int deleteByPrimaryKey(AseguradoraKey key);

    int insert(Aseguradora record);

    int insertSelective(Aseguradora record);

    List<Aseguradora> selectByExample(AseguradoraCriteria example);

    Aseguradora selectByPrimaryKey(AseguradoraKey key);

    int updateByExampleSelective(@Param("record") Aseguradora record, @Param("example") AseguradoraCriteria example);

    int updateByExample(@Param("record") Aseguradora record, @Param("example") AseguradoraCriteria example);

    int updateByPrimaryKeySelective(Aseguradora record);

    int updateByPrimaryKey(Aseguradora record);
}