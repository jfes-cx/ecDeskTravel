package com.duoc.domain;

import java.math.BigDecimal;

public class ServicioviajeKey {
    private BigDecimal idservicioviaje;

    public BigDecimal getIdservicioviaje() {
        return idservicioviaje;
    }

    public void setIdservicioviaje(BigDecimal idservicioviaje) {
        this.idservicioviaje = idservicioviaje;
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
        ServicioviajeKey other = (ServicioviajeKey) that;
        return (this.getIdservicioviaje() == null ? other.getIdservicioviaje() == null : this.getIdservicioviaje().equals(other.getIdservicioviaje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdservicioviaje() == null) ? 0 : getIdservicioviaje().hashCode());
        return result;
    }
}