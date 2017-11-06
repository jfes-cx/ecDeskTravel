package com.duoc.domain;

import java.math.BigDecimal;

public class CuentacursoKey {
    private BigDecimal idcuentacurso;

    public BigDecimal getIdcuentacurso() {
        return idcuentacurso;
    }

    public void setIdcuentacurso(BigDecimal idcuentacurso) {
        this.idcuentacurso = idcuentacurso;
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
        CuentacursoKey other = (CuentacursoKey) that;
        return (this.getIdcuentacurso() == null ? other.getIdcuentacurso() == null : this.getIdcuentacurso().equals(other.getIdcuentacurso()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentacurso() == null) ? 0 : getIdcuentacurso().hashCode());
        return result;
    }
}