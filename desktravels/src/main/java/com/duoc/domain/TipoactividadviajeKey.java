package com.duoc.domain;

import java.math.BigDecimal;

public class TipoactividadviajeKey {

    private BigDecimal idtipoactividadviaje;

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
        TipoactividadviajeKey other = (TipoactividadviajeKey) that;
        return (this.getIdtipoactividadviaje() == null ? other.getIdtipoactividadviaje() == null : this.getIdtipoactividadviaje().equals(other.getIdtipoactividadviaje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipoactividadviaje() == null) ? 0 : getIdtipoactividadviaje().hashCode());
        return result;
    }
}
