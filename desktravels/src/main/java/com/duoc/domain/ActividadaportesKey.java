package com.duoc.domain;

import java.math.BigDecimal;

public class ActividadaportesKey {

    private BigDecimal idactividadaportes;

    private BigDecimal idcuentaalumnos;

    public BigDecimal getIdactividadaportes() {
        return idactividadaportes;
    }

    public void setIdactividadaportes(BigDecimal idactividadaportes) {
        this.idactividadaportes = idactividadaportes;
    }

    public BigDecimal getIdcuentaalumnos() {
        return idcuentaalumnos;
    }

    public void setIdcuentaalumnos(BigDecimal idcuentaalumnos) {
        this.idcuentaalumnos = idcuentaalumnos;
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
        ActividadaportesKey other = (ActividadaportesKey) that;
        return (this.getIdactividadaportes() == null ? other.getIdactividadaportes() == null : this.getIdactividadaportes().equals(other.getIdactividadaportes()))
                && (this.getIdcuentaalumnos() == null ? other.getIdcuentaalumnos() == null : this.getIdcuentaalumnos().equals(other.getIdcuentaalumnos()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadaportes() == null) ? 0 : getIdactividadaportes().hashCode());
        result = prime * result + ((getIdcuentaalumnos() == null) ? 0 : getIdcuentaalumnos().hashCode());
        return result;
    }
}
