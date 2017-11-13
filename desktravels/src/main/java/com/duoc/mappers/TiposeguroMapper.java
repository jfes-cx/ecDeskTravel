package com.duoc.mappers;

import com.duoc.domain.Tiposeguro;
import com.duoc.domain.TiposeguroCriteria;
import com.duoc.domain.TiposeguroKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TiposeguroMapper {

    long countByExample(TiposeguroCriteria example);

    int deleteByExample(TiposeguroCriteria example);

    int deleteByPrimaryKey(TiposeguroKey key);

    int insert(Tiposeguro record);

    int insertSelective(Tiposeguro record);

    List<Tiposeguro> selectByExample(TiposeguroCriteria example);

    Tiposeguro selectByPrimaryKey(TiposeguroKey key);

    int updateByExampleSelective(@Param("record") Tiposeguro record, @Param("example") TiposeguroCriteria example);

    int updateByExample(@Param("record") Tiposeguro record, @Param("example") TiposeguroCriteria example);

    int updateByPrimaryKeySelective(Tiposeguro record);

    int updateByPrimaryKey(Tiposeguro record);
}
