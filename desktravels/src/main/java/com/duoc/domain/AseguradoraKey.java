package com.duoc.domain;

import java.math.BigDecimal;

public class AseguradoraKey {
    private BigDecimal idaseguradora;

    public BigDecimal getIdaseguradora() {
        return idaseguradora;
    }

    public void setIdaseguradora(BigDecimal idaseguradora) {
        this.idaseguradora = idaseguradora;
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
        AseguradoraKey other = (AseguradoraKey) that;
        return (this.getIdaseguradora() == null ? other.getIdaseguradora() == null : this.getIdaseguradora().equals(other.getIdaseguradora()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdaseguradora() == null) ? 0 : getIdaseguradora().hashCode());
        return result;
    }
}