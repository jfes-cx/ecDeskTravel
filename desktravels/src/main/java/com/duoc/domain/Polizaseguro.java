package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Polizaseguro extends PolizaseguroKey {

    private BigDecimal idalumno;

    private BigDecimal idtiposeguro;

    private Short idaseguradora;

    private String descripcion;

    private Date fechainicio;

    private Date fechatermino;

    private BigDecimal montoasegurado;

    public BigDecimal getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public BigDecimal getIdtiposeguro() {
        return idtiposeguro;
    }

    public void setIdtiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }

    public Short getIdaseguradora() {
        return idaseguradora;
    }

    public void setIdaseguradora(Short idaseguradora) {
        this.idaseguradora = idaseguradora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechatermino() {
        return fechatermino;
    }

    public void setFechatermino(Date fechatermino) {
        this.fechatermino = fechatermino;
    }

    public BigDecimal getMontoasegurado() {
        return montoasegurado;
    }

    public void setMontoasegurado(BigDecimal montoasegurado) {
        this.montoasegurado = montoasegurado;
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
        Polizaseguro other = (Polizaseguro) that;
        return (this.getIdpolizaseguros() == null ? other.getIdpolizaseguros() == null : this.getIdpolizaseguros().equals(other.getIdpolizaseguros()))
                && (this.getIdalumno() == null ? other.getIdalumno() == null : this.getIdalumno().equals(other.getIdalumno()))
                && (this.getIdtiposeguro() == null ? other.getIdtiposeguro() == null : this.getIdtiposeguro().equals(other.getIdtiposeguro()))
                && (this.getIdaseguradora() == null ? other.getIdaseguradora() == null : this.getIdaseguradora().equals(other.getIdaseguradora()))
                && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
                && (this.getFechainicio() == null ? other.getFechainicio() == null : this.getFechainicio().equals(other.getFechainicio()))
                && (this.getFechatermino() == null ? other.getFechatermino() == null : this.getFechatermino().equals(other.getFechatermino()))
                && (this.getMontoasegurado() == null ? other.getMontoasegurado() == null : this.getMontoasegurado().equals(other.getMontoasegurado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpolizaseguros() == null) ? 0 : getIdpolizaseguros().hashCode());
        result = prime * result + ((getIdalumno() == null) ? 0 : getIdalumno().hashCode());
        result = prime * result + ((getIdtiposeguro() == null) ? 0 : getIdtiposeguro().hashCode());
        result = prime * result + ((getIdaseguradora() == null) ? 0 : getIdaseguradora().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getFechainicio() == null) ? 0 : getFechainicio().hashCode());
        result = prime * result + ((getFechatermino() == null) ? 0 : getFechatermino().hashCode());
        result = prime * result + ((getMontoasegurado() == null) ? 0 : getMontoasegurado().hashCode());
        return result;
    }
}
