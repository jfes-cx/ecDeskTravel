package com.duoc.domain;

import java.math.BigDecimal;

public class DestinoKey {

    private BigDecimal iddestino;

    public BigDecimal getIddestino() {
        return iddestino;
    }

    public void setIddestino(BigDecimal iddestino) {
        this.iddestino = iddestino;
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
        DestinoKey other = (DestinoKey) that;
        return (this.getIddestino() == null ? other.getIddestino() == null : this.getIddestino().equals(other.getIddestino()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIddestino() == null) ? 0 : getIddestino().hashCode());
        return result;
    }
}
