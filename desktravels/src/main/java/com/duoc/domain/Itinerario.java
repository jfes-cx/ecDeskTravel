package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Itinerario extends ItinerarioKey {
    private Date fechainicio;

    private Date fechatermino;

    private BigDecimal idcontrato;

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

    public BigDecimal getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
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
        Itinerario other = (Itinerario) that;
        return (this.getIddestino() == null ? other.getIddestino() == null : this.getIddestino().equals(other.getIddestino()))
            && (this.getIdactividadviaje() == null ? other.getIdactividadviaje() == null : this.getIdactividadviaje().equals(other.getIdactividadviaje()))
            && (this.getIdorigen() == null ? other.getIdorigen() == null : this.getIdorigen().equals(other.getIdorigen()))
            && (this.getFechainicio() == null ? other.getFechainicio() == null : this.getFechainicio().equals(other.getFechainicio()))
            && (this.getFechatermino() == null ? other.getFechatermino() == null : this.getFechatermino().equals(other.getFechatermino()))
            && (this.getIdcontrato() == null ? other.getIdcontrato() == null : this.getIdcontrato().equals(other.getIdcontrato()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIddestino() == null) ? 0 : getIddestino().hashCode());
        result = prime * result + ((getIdactividadviaje() == null) ? 0 : getIdactividadviaje().hashCode());
        result = prime * result + ((getIdorigen() == null) ? 0 : getIdorigen().hashCode());
        result = prime * result + ((getFechainicio() == null) ? 0 : getFechainicio().hashCode());
        result = prime * result + ((getFechatermino() == null) ? 0 : getFechatermino().hashCode());
        result = prime * result + ((getIdcontrato() == null) ? 0 : getIdcontrato().hashCode());
        return result;
    }
}