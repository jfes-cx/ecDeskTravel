package com.duoc.domain;

import java.math.BigDecimal;

public class ServicioKey {
    private BigDecimal idservicio;

    public BigDecimal getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
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
        ServicioKey other = (ServicioKey) that;
        return (this.getIdservicio() == null ? other.getIdservicio() == null : this.getIdservicio().equals(other.getIdservicio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdservicio() == null) ? 0 : getIdservicio().hashCode());
        return result;
    }
}