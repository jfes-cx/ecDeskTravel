package com.duoc.domain;

import java.math.BigDecimal;

public class TipocolaboradorKey {
    private BigDecimal idtipocolaborador;

    public BigDecimal getIdtipocolaborador() {
        return idtipocolaborador;
    }

    public void setIdtipocolaborador(BigDecimal idtipocolaborador) {
        this.idtipocolaborador = idtipocolaborador;
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
        TipocolaboradorKey other = (TipocolaboradorKey) that;
        return (this.getIdtipocolaborador() == null ? other.getIdtipocolaborador() == null : this.getIdtipocolaborador().equals(other.getIdtipocolaborador()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocolaborador() == null) ? 0 : getIdtipocolaborador().hashCode());
        return result;
    }
}