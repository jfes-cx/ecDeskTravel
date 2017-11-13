package com.duoc.domain;

import java.math.BigDecimal;

public class ColaboradorKey {

    private BigDecimal idcolaborador;

    public BigDecimal getIdcolaborador() {
        return idcolaborador;
    }

    public void setIdcolaborador(BigDecimal idcolaborador) {
        this.idcolaborador = idcolaborador;
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
        ColaboradorKey other = (ColaboradorKey) that;
        return (this.getIdcolaborador() == null ? other.getIdcolaborador() == null : this.getIdcolaborador().equals(other.getIdcolaborador()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcolaborador() == null) ? 0 : getIdcolaborador().hashCode());
        return result;
    }
}
