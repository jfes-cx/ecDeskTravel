package com.duoc.domain;

import java.math.BigDecimal;

public class Comuna extends ComunaKey {

    private String nombre;

    private BigDecimal idregion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getIdregion() {
        return idregion;
    }

    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
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
        Comuna other = (Comuna) that;
        return (this.getIdcomuna() == null ? other.getIdcomuna() == null : this.getIdcomuna().equals(other.getIdcomuna()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getIdregion() == null ? other.getIdregion() == null : this.getIdregion().equals(other.getIdregion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcomuna() == null) ? 0 : getIdcomuna().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getIdregion() == null) ? 0 : getIdregion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
