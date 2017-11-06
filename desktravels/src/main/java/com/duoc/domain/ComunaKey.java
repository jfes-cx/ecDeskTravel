package com.duoc.domain;

import java.math.BigDecimal;

public class ComunaKey {
    private BigDecimal idcomuna;

    public BigDecimal getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(BigDecimal idcomuna) {
        this.idcomuna = idcomuna;
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
        ComunaKey other = (ComunaKey) that;
        return (this.getIdcomuna() == null ? other.getIdcomuna() == null : this.getIdcomuna().equals(other.getIdcomuna()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcomuna() == null) ? 0 : getIdcomuna().hashCode());
        return result;
    }
}