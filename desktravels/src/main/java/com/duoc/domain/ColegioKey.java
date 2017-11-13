package com.duoc.domain;

import java.math.BigDecimal;

public class ColegioKey {

    private BigDecimal idcolegio;

    public BigDecimal getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
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
        ColegioKey other = (ColegioKey) that;
        return (this.getIdcolegio() == null ? other.getIdcolegio() == null : this.getIdcolegio().equals(other.getIdcolegio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcolegio() == null) ? 0 : getIdcolegio().hashCode());
        return result;
    }
}
