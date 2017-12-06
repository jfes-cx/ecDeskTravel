package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Actividadaportes extends ActividadaportesKey {
    private Date fecha;

    private BigDecimal monto;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
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
        Actividadaportes other = (Actividadaportes) that;
        return (this.getIdactividadaportes() == null ? other.getIdactividadaportes() == null : this.getIdactividadaportes().equals(other.getIdactividadaportes()))
            && (this.getIdcuentaalumnos() == null ? other.getIdcuentaalumnos() == null : this.getIdcuentaalumnos().equals(other.getIdcuentaalumnos()))
            && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()))
            && (this.getMonto() == null ? other.getMonto() == null : this.getMonto().equals(other.getMonto()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadaportes() == null) ? 0 : getIdactividadaportes().hashCode());
        result = prime * result + ((getIdcuentaalumnos() == null) ? 0 : getIdcuentaalumnos().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        result = prime * result + ((getMonto() == null) ? 0 : getMonto().hashCode());
        return result;
    }
}