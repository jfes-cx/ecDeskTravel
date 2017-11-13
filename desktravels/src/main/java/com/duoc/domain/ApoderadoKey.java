package com.duoc.domain;

import java.math.BigDecimal;

public class ApoderadoKey {

    private BigDecimal idapoderado;

    public BigDecimal getIdapoderado() {
        return idapoderado;
    }

    public void setIdapoderado(BigDecimal idapoderado) {
        this.idapoderado = idapoderado;
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
        ApoderadoKey other = (ApoderadoKey) that;
        return (this.getIdapoderado() == null ? other.getIdapoderado() == null : this.getIdapoderado().equals(other.getIdapoderado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdapoderado() == null) ? 0 : getIdapoderado().hashCode());
        return result;
    }
}
