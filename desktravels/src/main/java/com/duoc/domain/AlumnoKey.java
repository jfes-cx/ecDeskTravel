package com.duoc.domain;

import java.math.BigDecimal;

public class AlumnoKey {
    private BigDecimal idalumno;

    public BigDecimal getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
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
        AlumnoKey other = (AlumnoKey) that;
        return (this.getIdalumno() == null ? other.getIdalumno() == null : this.getIdalumno().equals(other.getIdalumno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdalumno() == null) ? 0 : getIdalumno().hashCode());
        return result;
    }
}