package com.duoc.domain;

import java.math.BigDecimal;

public class Cuentacurso extends CuentacursoKey {
    private BigDecimal idcurso;

    private BigDecimal saldo;

    private String nombre;

    private String descripcion;

    private String encargado;

    public BigDecimal getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Cuentacurso other = (Cuentacurso) that;
        return (this.getIdcuentacurso() == null ? other.getIdcuentacurso() == null : this.getIdcuentacurso().equals(other.getIdcuentacurso()))
            && (this.getIdcurso() == null ? other.getIdcurso() == null : this.getIdcurso().equals(other.getIdcurso()))
            && (this.getSaldo() == null ? other.getSaldo() == null : this.getSaldo().equals(other.getSaldo()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getEncargado() == null ? other.getEncargado() == null : this.getEncargado().equals(other.getEncargado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentacurso() == null) ? 0 : getIdcuentacurso().hashCode());
        result = prime * result + ((getIdcurso() == null) ? 0 : getIdcurso().hashCode());
        result = prime * result + ((getSaldo() == null) ? 0 : getSaldo().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getEncargado() == null) ? 0 : getEncargado().hashCode());
        return result;
    }
}