package com.duoc.domain;

import java.math.BigDecimal;

public class TipocontratoKey {

    private BigDecimal idtipocontrato;

    public BigDecimal getIdtipocontrato() {
        return idtipocontrato;
    }

    public void setIdtipocontrato(BigDecimal idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
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
        TipocontratoKey other = (TipocontratoKey) that;
        return (this.getIdtipocontrato() == null ? other.getIdtipocontrato() == null : this.getIdtipocontrato().equals(other.getIdtipocontrato()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocontrato() == null) ? 0 : getIdtipocontrato().hashCode());
        return result;
    }
}
