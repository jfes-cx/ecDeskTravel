package com.duoc.mappers;

import com.duoc.domain.Pais;
import com.duoc.domain.PaisCriteria;
import com.duoc.domain.PaisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaisMapper {

    long countByExample(PaisCriteria example);

    int deleteByExample(PaisCriteria example);

    int deleteByPrimaryKey(PaisKey key);

    int insert(Pais record);

    int insertSelective(Pais record);

    List<Pais> selectByExample(PaisCriteria example);

    Pais selectByPrimaryKey(PaisKey key);

    int updateByExampleSelective(@Param("record") Pais record, @Param("example") PaisCriteria example);

    int updateByExample(@Param("record") Pais record, @Param("example") PaisCriteria example);

    int updateByPrimaryKeySelective(Pais record);

    int updateByPrimaryKey(Pais record);
}
