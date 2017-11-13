package com.duoc.domain;

import java.math.BigDecimal;

public class TiposeguroKey {

    private BigDecimal idtiposeguro;

    public BigDecimal getIdtiposeguro() {
        return idtiposeguro;
    }

    public void setIdtiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
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
        TiposeguroKey other = (TiposeguroKey) that;
        return (this.getIdtiposeguro() == null ? other.getIdtiposeguro() == null : this.getIdtiposeguro().equals(other.getIdtiposeguro()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtiposeguro() == null) ? 0 : getIdtiposeguro().hashCode());
        return result;
    }
}
