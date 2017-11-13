package com.duoc.domain;

import java.math.BigDecimal;

public class PolizaseguroKey {

    private BigDecimal idpolizaseguros;

    public BigDecimal getIdpolizaseguros() {
        return idpolizaseguros;
    }

    public void setIdpolizaseguros(BigDecimal idpolizaseguros) {
        this.idpolizaseguros = idpolizaseguros;
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
        PolizaseguroKey other = (PolizaseguroKey) that;
        return (this.getIdpolizaseguros() == null ? other.getIdpolizaseguros() == null : this.getIdpolizaseguros().equals(other.getIdpolizaseguros()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpolizaseguros() == null) ? 0 : getIdpolizaseguros().hashCode());
        return result;
    }
}
