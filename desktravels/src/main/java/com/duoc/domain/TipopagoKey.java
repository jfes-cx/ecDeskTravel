package com.duoc.domain;

import java.math.BigDecimal;

public class TipopagoKey {
    private BigDecimal idtipopago;

    public BigDecimal getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
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
        TipopagoKey other = (TipopagoKey) that;
        return (this.getIdtipopago() == null ? other.getIdtipopago() == null : this.getIdtipopago().equals(other.getIdtipopago()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipopago() == null) ? 0 : getIdtipopago().hashCode());
        return result;
    }
}