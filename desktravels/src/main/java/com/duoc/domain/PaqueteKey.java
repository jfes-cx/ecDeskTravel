package com.duoc.domain;

import java.math.BigDecimal;

public class PaqueteKey {
    private BigDecimal idpaquete;

    public BigDecimal getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(BigDecimal idpaquete) {
        this.idpaquete = idpaquete;
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
        PaqueteKey other = (PaqueteKey) that;
        return (this.getIdpaquete() == null ? other.getIdpaquete() == null : this.getIdpaquete().equals(other.getIdpaquete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpaquete() == null) ? 0 : getIdpaquete().hashCode());
        return result;
    }
}