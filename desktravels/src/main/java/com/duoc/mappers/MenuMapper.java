package com.duoc.mappers;

import com.duoc.domain.Menu;
import com.duoc.domain.MenuCriteria;
import com.duoc.domain.MenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {

    long countByExample(MenuCriteria example);

    int deleteByExample(MenuCriteria example);

    int deleteByPrimaryKey(MenuKey key);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuCriteria example);

    Menu selectByPrimaryKey(MenuKey key);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}
