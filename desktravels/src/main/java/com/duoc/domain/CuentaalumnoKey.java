package com.duoc.domain;

import java.math.BigDecimal;

public class CuentaalumnoKey {
    private BigDecimal idcuentaalumnos;

    public BigDecimal getIdcuentaalumnos() {
        return idcuentaalumnos;
    }

    public void setIdcuentaalumnos(BigDecimal idcuentaalumnos) {
        this.idcuentaalumnos = idcuentaalumnos;
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
        CuentaalumnoKey other = (CuentaalumnoKey) that;
        return (this.getIdcuentaalumnos() == null ? other.getIdcuentaalumnos() == null : this.getIdcuentaalumnos().equals(other.getIdcuentaalumnos()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentaalumnos() == null) ? 0 : getIdcuentaalumnos().hashCode());
        return result;
    }
}