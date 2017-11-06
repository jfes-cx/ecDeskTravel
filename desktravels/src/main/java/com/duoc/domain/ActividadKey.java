package com.duoc.domain;

import java.math.BigDecimal;

public class ActividadKey {
    private BigDecimal idactividad;

    public BigDecimal getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
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
        ActividadKey other = (ActividadKey) that;
        return (this.getIdactividad() == null ? other.getIdactividad() == null : this.getIdactividad().equals(other.getIdactividad()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividad() == null) ? 0 : getIdactividad().hashCode());
        return result;
    }
}