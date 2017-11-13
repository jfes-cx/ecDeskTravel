package com.duoc.domain;

import java.math.BigDecimal;

public class RegionKey {

    private BigDecimal idregion;

    public BigDecimal getIdregion() {
        return idregion;
    }

    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
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
        RegionKey other = (RegionKey) that;
        return (this.getIdregion() == null ? other.getIdregion() == null : this.getIdregion().equals(other.getIdregion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdregion() == null) ? 0 : getIdregion().hashCode());
        return result;
    }
}
