/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.domain;

import com.duoc.domain.Colaborador;
import com.duoc.domain.Cuentausuario;

/**
 *
 * @author Integer
 */
public class CuentaConexionDTO {
    
   private Cuentausuario cuenta;
   private Colaborador col;

    public Cuentausuario getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentausuario cuenta) {
        this.cuenta = cuenta;
    }

    public Colaborador getCol() {
        return col;
    }

    public void setCol(Colaborador col) {
        this.col = col;
    }
   
   
    
}
