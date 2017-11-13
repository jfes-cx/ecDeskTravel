package com.duoc.domain;

import java.math.BigDecimal;

public class ActividadviajeKey {

    private BigDecimal idactividadviaje;

    public BigDecimal getIdactividadviaje() {
        return idactividadviaje;
    }

    public void setIdactividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
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
        ActividadviajeKey other = (ActividadviajeKey) that;
        return (this.getIdactividadviaje() == null ? other.getIdactividadviaje() == null : this.getIdactividadviaje().equals(other.getIdactividadviaje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadviaje() == null) ? 0 : getIdactividadviaje().hashCode());
        return result;
    }
}
