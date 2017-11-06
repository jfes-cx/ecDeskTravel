package com.duoc.mappers;

import com.duoc.domain.Curso;
import com.duoc.domain.CursoCriteria;
import com.duoc.domain.CursoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CursoMapper {
    long countByExample(CursoCriteria example);

    int deleteByExample(CursoCriteria example);

    int deleteByPrimaryKey(CursoKey key);

    int insert(Curso record);

    int insertSelective(Curso record);

    List<Curso> selectByExample(CursoCriteria example);

    Curso selectByPrimaryKey(CursoKey key);

    int updateByExampleSelective(@Param("record") Curso record, @Param("example") CursoCriteria example);

    int updateByExample(@Param("record") Curso record, @Param("example") CursoCriteria example);

    int updateByPrimaryKeySelective(Curso record);

    int updateByPrimaryKey(Curso record);
}