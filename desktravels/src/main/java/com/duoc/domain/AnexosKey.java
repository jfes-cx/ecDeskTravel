package com.duoc.domain;

import java.math.BigDecimal;

public class AnexosKey {

    private BigDecimal idanexo;

    public BigDecimal getIdanexo() {
        return idanexo;
    }

    public void setIdanexo(BigDecimal idanexo) {
        this.idanexo = idanexo;
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
        AnexosKey other = (AnexosKey) that;
        return (this.getIdanexo() == null ? other.getIdanexo() == null : this.getIdanexo().equals(other.getIdanexo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdanexo() == null) ? 0 : getIdanexo().hashCode());
        return result;
    }
}
