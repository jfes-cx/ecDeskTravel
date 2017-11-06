package com.duoc.domain;

import java.math.BigDecimal;

public class PaisKey {
    private BigDecimal idpais;

    public BigDecimal getIdpais() {
        return idpais;
    }

    public void setIdpais(BigDecimal idpais) {
        this.idpais = idpais;
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
        PaisKey other = (PaisKey) that;
        return (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        return result;
    }
}