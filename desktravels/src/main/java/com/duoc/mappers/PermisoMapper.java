package com.duoc.mappers;

import com.duoc.domain.Permiso;
import com.duoc.domain.PermisoCriteria;
import com.duoc.domain.PermisoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermisoMapper {
    long countByExample(PermisoCriteria example);

    int deleteByExample(PermisoCriteria example);

    int deleteByPrimaryKey(PermisoKey key);

    int insert(Permiso record);

    int insertSelective(Permiso record);

    List<Permiso> selectByExample(PermisoCriteria example);

    Permiso selectByPrimaryKey(PermisoKey key);

    int updateByExampleSelective(@Param("record") Permiso record, @Param("example") PermisoCriteria example);

    int updateByExample(@Param("record") Permiso record, @Param("example") PermisoCriteria example);

    int updateByPrimaryKeySelective(Permiso record);

    int updateByPrimaryKey(Permiso record);
}