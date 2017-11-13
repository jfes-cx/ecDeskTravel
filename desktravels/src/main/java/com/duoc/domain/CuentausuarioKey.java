package com.duoc.domain;

import java.math.BigDecimal;

public class CuentausuarioKey {

    private BigDecimal idcuentausuario;

    public BigDecimal getIdcuentausuario() {
        return idcuentausuario;
    }

    public void setIdcuentausuario(BigDecimal idcuentausuario) {
        this.idcuentausuario = idcuentausuario;
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
        CuentausuarioKey other = (CuentausuarioKey) that;
        return (this.getIdcuentausuario() == null ? other.getIdcuentausuario() == null : this.getIdcuentausuario().equals(other.getIdcuentausuario()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentausuario() == null) ? 0 : getIdcuentausuario().hashCode());
        return result;
    }
}
