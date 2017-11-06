package com.duoc.domain;

import java.math.BigDecimal;

public class EstadocuentaKey {
    private BigDecimal idestadocuenta;

    public BigDecimal getIdestadocuenta() {
        return idestadocuenta;
    }

    public void setIdestadocuenta(BigDecimal idestadocuenta) {
        this.idestadocuenta = idestadocuenta;
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
        EstadocuentaKey other = (EstadocuentaKey) that;
        return (this.getIdestadocuenta() == null ? other.getIdestadocuenta() == null : this.getIdestadocuenta().equals(other.getIdestadocuenta()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdestadocuenta() == null) ? 0 : getIdestadocuenta().hashCode());
        return result;
    }
}