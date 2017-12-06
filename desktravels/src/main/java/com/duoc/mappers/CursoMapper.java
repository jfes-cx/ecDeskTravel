package com.duoc.mappers;

import java.util.Map;


public interface CursoMapper {

    void GET_CURSOS();
    
    void GET_CURSOS_BY_COL();

    void INSERT_CURSO(Map<String, Object> params);
    
    void GET_MONTOS(Map<String, Object> params);
}
