package com.duoc.domain;

import java.math.BigDecimal;

public class ComprobantepagoKey {
    private BigDecimal idComprobantePago;

    public BigDecimal getIdComprobantePago() {
        return idComprobantePago;
    }

    public void setIdComprobantePago(BigDecimal idComprobantePago) {
        this.idComprobantePago = idComprobantePago;
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
        ComprobantepagoKey other = (ComprobantepagoKey) that;
        return (this.getIdComprobantePago() == null ? other.getIdComprobantePago() == null : this.getIdComprobantePago().equals(other.getIdComprobantePago()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdComprobantePago() == null) ? 0 : getIdComprobantePago().hashCode());
        return result;
    }
}