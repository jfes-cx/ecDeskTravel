package com.duoc.mappers;

import com.duoc.domain.Comuna;
import com.duoc.domain.ComunaCriteria;
import com.duoc.domain.ComunaKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComunaMapper {

    long countByExample(ComunaCriteria example);

    int deleteByExample(ComunaCriteria example);

    int deleteByPrimaryKey(ComunaKey key);

    int insert(Comuna record);

    int insertSelective(Comuna record);

    List<Comuna> selectByExample(ComunaCriteria example);

    Comuna selectByPrimaryKey(ComunaKey key);

    int updateByExampleSelective(@Param("record") Comuna record, @Param("example") ComunaCriteria example);

    int updateByExample(@Param("record") Comuna record, @Param("example") ComunaCriteria example);

    int updateByPrimaryKeySelective(Comuna record);

    int updateByPrimaryKey(Comuna record);

    void GET_COMUNAS_BY_REG();
}
