package com.duoc.mappers;

import com.duoc.domain.Cuentacurso;
import com.duoc.domain.CuentacursoCriteria;
import com.duoc.domain.CuentacursoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuentacursoMapper {

    long countByExample(CuentacursoCriteria example);

    int deleteByExample(CuentacursoCriteria example);

    int deleteByPrimaryKey(CuentacursoKey key);

    int insert(Cuentacurso record);

    int insertSelective(Cuentacurso record);

    List<Cuentacurso> selectByExample(CuentacursoCriteria example);

    Cuentacurso selectByPrimaryKey(CuentacursoKey key);

    int updateByExampleSelective(@Param("record") Cuentacurso record, @Param("example") CuentacursoCriteria example);

    int updateByExample(@Param("record") Cuentacurso record, @Param("example") CuentacursoCriteria example);

    int updateByPrimaryKeySelective(Cuentacurso record);

    int updateByPrimaryKey(Cuentacurso record);
}
