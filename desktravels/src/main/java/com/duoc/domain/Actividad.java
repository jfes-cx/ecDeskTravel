package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Actividad extends ActividadKey {
    private BigDecimal idcurso;

    private BigDecimal idtipoactividad;

    private String nombre;

    private Date fechainicio;

    private Date fechatermino;

    private BigDecimal montorecaudado;

    public BigDecimal getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
    }

    public BigDecimal getIdtipoactividad() {
        return idtipoactividad;
    }

    public void setIdtipoactividad(BigDecimal idtipoactividad) {
        this.idtipoactividad = idtipoactividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public BigDecimal getMontorecaudado() {
        return montorecaudado;
    }

    public void setMontorecaudado(BigDecimal montorecaudado) {
        this.montorecaudado = montorecaudado;
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
        Actividad other = (Actividad) that;
        return (this.getIdactividad() == null ? other.getIdactividad() == null : this.getIdactividad().equals(other.getIdactividad()))
            && (this.getIdcurso() == null ? other.getIdcurso() == null : this.getIdcurso().equals(other.getIdcurso()))
            && (this.getIdtipoactividad() == null ? other.getIdtipoactividad() == null : this.getIdtipoactividad().equals(other.getIdtipoactividad()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getFechainicio() == null ? other.getFechainicio() == null : this.getFechainicio().equals(other.getFechainicio()))
            && (this.getFechatermino() == null ? other.getFechatermino() == null : this.getFechatermino().equals(other.getFechatermino()))
            && (this.getMontorecaudado() == null ? other.getMontorecaudado() == null : this.getMontorecaudado().equals(other.getMontorecaudado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividad() == null) ? 0 : getIdactividad().hashCode());
        result = prime * result + ((getIdcurso() == null) ? 0 : getIdcurso().hashCode());
        result = prime * result + ((getIdtipoactividad() == null) ? 0 : getIdtipoactividad().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getFechainicio() == null) ? 0 : getFechainicio().hashCode());
        result = prime * result + ((getFechatermino() == null) ? 0 : getFechatermino().hashCode());
        result = prime * result + ((getMontorecaudado() == null) ? 0 : getMontorecaudado().hashCode());
        return result;
    }
}