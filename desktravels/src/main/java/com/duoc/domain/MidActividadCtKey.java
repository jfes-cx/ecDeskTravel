package com.duoc.domain;

import java.math.BigDecimal;

public class MidActividadCtKey {
    private BigDecimal idactividadpaquete;

    public BigDecimal getIdactividadpaquete() {
        return idactividadpaquete;
    }

    public void setIdactividadpaquete(BigDecimal idactividadpaquete) {
        this.idactividadpaquete = idactividadpaquete;
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
        MidActividadCtKey other = (MidActividadCtKey) that;
        return (this.getIdactividadpaquete() == null ? other.getIdactividadpaquete() == null : this.getIdactividadpaquete().equals(other.getIdactividadpaquete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadpaquete() == null) ? 0 : getIdactividadpaquete().hashCode());
        return result;
    }
}