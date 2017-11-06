package com.duoc.domain;

import java.math.BigDecimal;

public class TiposervicioKey {
    private BigDecimal idtiposervicio;

    public BigDecimal getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(BigDecimal idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
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
        TiposervicioKey other = (TiposervicioKey) that;
        return (this.getIdtiposervicio() == null ? other.getIdtiposervicio() == null : this.getIdtiposervicio().equals(other.getIdtiposervicio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtiposervicio() == null) ? 0 : getIdtiposervicio().hashCode());
        return result;
    }
}