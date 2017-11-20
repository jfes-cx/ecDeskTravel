package com.duoc.mappers;

import java.util.Map;


public interface CuentausuarioMapper {


    void autenticarUsuario(Map<String, Object> params);
    
    void INSERT_CUENTA(Map<String, Object> params);
}
