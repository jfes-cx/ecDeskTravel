package com.duoc.domain;

import java.math.BigDecimal;

public class TipoactividadKey {

    private BigDecimal idtipoactividad;

    public BigDecimal getIdtipoactividad() {
        return idtipoactividad;
    }

    public void setIdtipoactividad(BigDecimal idtipoactividad) {
        this.idtipoactividad = idtipoactividad;
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
        TipoactividadKey other = (TipoactividadKey) that;
        return (this.getIdtipoactividad() == null ? other.getIdtipoactividad() == null : this.getIdtipoactividad().equals(other.getIdtipoactividad()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipoactividad() == null) ? 0 : getIdtipoactividad().hashCode());
        return result;
    }
}
