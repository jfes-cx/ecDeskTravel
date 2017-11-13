package com.duoc.domain;

import java.math.BigDecimal;

public class TipocuentaKey {

    private BigDecimal idtipocuenta;

    public BigDecimal getIdtipocuenta() {
        return idtipocuenta;
    }

    public void setIdtipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
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
        TipocuentaKey other = (TipocuentaKey) that;
        return (this.getIdtipocuenta() == null ? other.getIdtipocuenta() == null : this.getIdtipocuenta().equals(other.getIdtipocuenta()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocuenta() == null) ? 0 : getIdtipocuenta().hashCode());
        return result;
    }
}
