package com.duoc.domain;

import java.math.BigDecimal;

public class CursoKey {
    private BigDecimal idcurso;

    public BigDecimal getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
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
        CursoKey other = (CursoKey) that;
        return (this.getIdcurso() == null ? other.getIdcurso() == null : this.getIdcurso().equals(other.getIdcurso()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcurso() == null) ? 0 : getIdcurso().hashCode());
        return result;
    }
}