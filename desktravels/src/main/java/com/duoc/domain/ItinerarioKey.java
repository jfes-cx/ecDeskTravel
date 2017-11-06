package com.duoc.domain;

import java.math.BigDecimal;

public class ItinerarioKey {
    private BigDecimal iddestino;

    private BigDecimal idactividadviaje;

    private BigDecimal idorigen;

    public BigDecimal getIddestino() {
        return iddestino;
    }

    public void setIddestino(BigDecimal iddestino) {
        this.iddestino = iddestino;
    }

    public BigDecimal getIdactividadviaje() {
        return idactividadviaje;
    }

    public void setIdactividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
    }

    public BigDecimal getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(BigDecimal idorigen) {
        this.idorigen = idorigen;
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
        ItinerarioKey other = (ItinerarioKey) that;
        return (this.getIddestino() == null ? other.getIddestino() == null : this.getIddestino().equals(other.getIddestino()))
            && (this.getIdactividadviaje() == null ? other.getIdactividadviaje() == null : this.getIdactividadviaje().equals(other.getIdactividadviaje()))
            && (this.getIdorigen() == null ? other.getIdorigen() == null : this.getIdorigen().equals(other.getIdorigen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIddestino() == null) ? 0 : getIddestino().hashCode());
        result = prime * result + ((getIdactividadviaje() == null) ? 0 : getIdactividadviaje().hashCode());
        result = prime * result + ((getIdorigen() == null) ? 0 : getIdorigen().hashCode());
        return result;
    }
}