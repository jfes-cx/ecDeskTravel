package com.duoc.domain;

import java.math.BigDecimal;

public class MidServicioCtKey {
    private BigDecimal idserviciopaquete;

    public BigDecimal getIdserviciopaquete() {
        return idserviciopaquete;
    }

    public void setIdserviciopaquete(BigDecimal idserviciopaquete) {
        this.idserviciopaquete = idserviciopaquete;
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
        MidServicioCtKey other = (MidServicioCtKey) that;
        return (this.getIdserviciopaquete() == null ? other.getIdserviciopaquete() == null : this.getIdserviciopaquete().equals(other.getIdserviciopaquete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdserviciopaquete() == null) ? 0 : getIdserviciopaquete().hashCode());
        return result;
    }
}