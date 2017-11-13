package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Contrato extends ContratoKey {

    private BigDecimal idalumno;

    private BigDecimal idcolaborador;

    private BigDecimal idtipocontrato;

    private BigDecimal idpolizaseguros;

    private Date fechainicio;

    private Date fechatermino;

    private BigDecimal idservicio;

    private String nombre;

    public BigDecimal getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public BigDecimal getIdcolaborador() {
        return idcolaborador;
    }

    public void setIdcolaborador(BigDecimal idcolaborador) {
        this.idcolaborador = idcolaborador;
    }

    public BigDecimal getIdtipocontrato() {
        return idtipocontrato;
    }

    public void setIdtipocontrato(BigDecimal idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public BigDecimal getIdpolizaseguros() {
        return idpolizaseguros;
    }

    public void setIdpolizaseguros(BigDecimal idpolizaseguros) {
        this.idpolizaseguros = idpolizaseguros;
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

    public BigDecimal getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Contrato other = (Contrato) that;
        return (this.getIdcontrato() == null ? other.getIdcontrato() == null : this.getIdcontrato().equals(other.getIdcontrato()))
                && (this.getIdalumno() == null ? other.getIdalumno() == null : this.getIdalumno().equals(other.getIdalumno()))
                && (this.getIdcolaborador() == null ? other.getIdcolaborador() == null : this.getIdcolaborador().equals(other.getIdcolaborador()))
                && (this.getIdtipocontrato() == null ? other.getIdtipocontrato() == null : this.getIdtipocontrato().equals(other.getIdtipocontrato()))
                && (this.getIdpolizaseguros() == null ? other.getIdpolizaseguros() == null : this.getIdpolizaseguros().equals(other.getIdpolizaseguros()))
                && (this.getFechainicio() == null ? other.getFechainicio() == null : this.getFechainicio().equals(other.getFechainicio()))
                && (this.getFechatermino() == null ? other.getFechatermino() == null : this.getFechatermino().equals(other.getFechatermino()))
                && (this.getIdservicio() == null ? other.getIdservicio() == null : this.getIdservicio().equals(other.getIdservicio()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcontrato() == null) ? 0 : getIdcontrato().hashCode());
        result = prime * result + ((getIdalumno() == null) ? 0 : getIdalumno().hashCode());
        result = prime * result + ((getIdcolaborador() == null) ? 0 : getIdcolaborador().hashCode());
        result = prime * result + ((getIdtipocontrato() == null) ? 0 : getIdtipocontrato().hashCode());
        result = prime * result + ((getIdpolizaseguros() == null) ? 0 : getIdpolizaseguros().hashCode());
        result = prime * result + ((getFechainicio() == null) ? 0 : getFechainicio().hashCode());
        result = prime * result + ((getFechatermino() == null) ? 0 : getFechatermino().hashCode());
        result = prime * result + ((getIdservicio() == null) ? 0 : getIdservicio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}
