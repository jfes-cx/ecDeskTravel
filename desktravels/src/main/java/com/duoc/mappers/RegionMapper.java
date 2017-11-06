package com.duoc.mappers;

import com.duoc.domain.Region;
import com.duoc.domain.RegionCriteria;
import com.duoc.domain.RegionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionCriteria example);

    int deleteByExample(RegionCriteria example);

    int deleteByPrimaryKey(RegionKey key);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionCriteria example);

    Region selectByPrimaryKey(RegionKey key);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionCriteria example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionCriteria example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}