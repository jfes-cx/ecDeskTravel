package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Actividadviaje extends ActividadviajeKey {
    private String nombre;

    private String descripcion;

    private Date fechainicio;

    private Date fechatermino;

    private BigDecimal idtipoactividadviaje;

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

    public BigDecimal getIdtipoactividadviaje() {
        return idtipoactividadviaje;
    }

    public void setIdtipoactividadviaje(BigDecimal idtipoactividadviaje) {
        this.idtipoactividadviaje = idtipoactividadviaje;
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
        Actividadviaje other = (Actividadviaje) that;
        return (this.getIdactividadviaje() == null ? other.getIdactividadviaje() == null : this.getIdactividadviaje().equals(other.getIdactividadviaje()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getFechainicio() == null ? other.getFechainicio() == null : this.getFechainicio().equals(other.getFechainicio()))
            && (this.getFechatermino() == null ? other.getFechatermino() == null : this.getFechatermino().equals(other.getFechatermino()))
            && (this.getIdtipoactividadviaje() == null ? other.getIdtipoactividadviaje() == null : this.getIdtipoactividadviaje().equals(other.getIdtipoactividadviaje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadviaje() == null) ? 0 : getIdactividadviaje().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getFechainicio() == null) ? 0 : getFechainicio().hashCode());
        result = prime * result + ((getFechatermino() == null) ? 0 : getFechatermino().hashCode());
        result = prime * result + ((getIdtipoactividadviaje() == null) ? 0 : getIdtipoactividadviaje().hashCode());
        return result;
    }
}