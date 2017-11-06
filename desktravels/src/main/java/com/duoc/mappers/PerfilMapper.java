package com.duoc.mappers;

import com.duoc.domain.Perfil;
import com.duoc.domain.PerfilCriteria;
import com.duoc.domain.PerfilKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerfilMapper {
    long countByExample(PerfilCriteria example);

    int deleteByExample(PerfilCriteria example);

    int deleteByPrimaryKey(PerfilKey key);

    int insert(Perfil record);

    int insertSelective(Perfil record);

    List<Perfil> selectByExample(PerfilCriteria example);

    Perfil selectByPrimaryKey(PerfilKey key);

    int updateByExampleSelective(@Param("record") Perfil record, @Param("example") PerfilCriteria example);

    int updateByExample(@Param("record") Perfil record, @Param("example") PerfilCriteria example);

    int updateByPrimaryKeySelective(Perfil record);

    int updateByPrimaryKey(Perfil record);
}