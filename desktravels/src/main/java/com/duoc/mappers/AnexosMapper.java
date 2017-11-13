package com.duoc.mappers;

import com.duoc.domain.Anexos;
import com.duoc.domain.AnexosCriteria;
import com.duoc.domain.AnexosKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnexosMapper {

    long countByExample(AnexosCriteria example);

    int deleteByExample(AnexosCriteria example);

    int deleteByPrimaryKey(AnexosKey key);

    int insert(Anexos record);

    int insertSelective(Anexos record);

    List<Anexos> selectByExample(AnexosCriteria example);

    Anexos selectByPrimaryKey(AnexosKey key);

    int updateByExampleSelective(@Param("record") Anexos record, @Param("example") AnexosCriteria example);

    int updateByExample(@Param("record") Anexos record, @Param("example") AnexosCriteria example);

    int updateByPrimaryKeySelective(Anexos record);

    int updateByPrimaryKey(Anexos record);
}
