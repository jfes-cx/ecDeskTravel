package com.duoc.mappers;

import com.duoc.domain.Apoderado;
import com.duoc.domain.ApoderadoCriteria;
import com.duoc.domain.ApoderadoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApoderadoMapper {

    long countByExample(ApoderadoCriteria example);

    int deleteByExample(ApoderadoCriteria example);

    int deleteByPrimaryKey(ApoderadoKey key);

    int insert(Apoderado record);

    int insertSelective(Apoderado record);

    List<Apoderado> selectByExample(ApoderadoCriteria example);

    Apoderado selectByPrimaryKey(ApoderadoKey key);

    int updateByExampleSelective(@Param("record") Apoderado record, @Param("example") ApoderadoCriteria example);

    int updateByExample(@Param("record") Apoderado record, @Param("example") ApoderadoCriteria example);

    int updateByPrimaryKeySelective(Apoderado record);

    int updateByPrimaryKey(Apoderado record);
}
