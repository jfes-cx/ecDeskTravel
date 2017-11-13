package com.duoc.domain;

import java.math.BigDecimal;

public class OrigenKey {

    private BigDecimal idorigen;

    public BigDecimal getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(BigDecimal idorigen) {
        this.idorigen = idorigen;
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
        OrigenKey other = (OrigenKey) that;
        return (this.getIdorigen() == null ? other.getIdorigen() == null : this.getIdorigen().equals(other.getIdorigen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdorigen() == null) ? 0 : getIdorigen().hashCode());
        return result;
    }
}
