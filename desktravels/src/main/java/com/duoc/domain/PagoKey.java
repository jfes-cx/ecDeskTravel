package com.duoc.domain;

import java.math.BigDecimal;

public class PagoKey {
    private BigDecimal idpago;

    public BigDecimal getIdpago() {
        return idpago;
    }

    public void setIdpago(BigDecimal idpago) {
        this.idpago = idpago;
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
        PagoKey other = (PagoKey) that;
        return (this.getIdpago() == null ? other.getIdpago() == null : this.getIdpago().equals(other.getIdpago()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpago() == null) ? 0 : getIdpago().hashCode());
        return result;
    }
}