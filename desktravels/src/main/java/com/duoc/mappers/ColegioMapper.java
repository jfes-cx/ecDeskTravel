package com.duoc.mappers;

import com.duoc.domain.Colegio;
import com.duoc.domain.ColegioCriteria;
import com.duoc.domain.ColegioKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ColegioMapper {


    void GET_COLEGIOS_BY_COMUNA(Map<String, Object> params);

    void GET_COLEGIOS();

    void INSERT_COLEGIO(Map<String, Object> params);
}
