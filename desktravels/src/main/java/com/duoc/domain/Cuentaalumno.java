package com.duoc.domain;

import java.math.BigDecimal;

public class Cuentaalumno extends CuentaalumnoKey {
    private BigDecimal idtipocuenta;

    private BigDecimal idalumno;

    private BigDecimal cupototal;

    private BigDecimal cupoutilizado;

    private BigDecimal aporte;

    public BigDecimal getIdtipocuenta() {
        return idtipocuenta;
    }

    public void setIdtipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public BigDecimal getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public BigDecimal getCupototal() {
        return cupototal;
    }

    public void setCupototal(BigDecimal cupototal) {
        this.cupototal = cupototal;
    }

    public BigDecimal getCupoutilizado() {
        return cupoutilizado;
    }

    public void setCupoutilizado(BigDecimal cupoutilizado) {
        this.cupoutilizado = cupoutilizado;
    }

    public BigDecimal getAporte() {
        return aporte;
    }

    public void setAporte(BigDecimal aporte) {
        this.aporte = aporte;
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
        Cuentaalumno other = (Cuentaalumno) that;
        return (this.getIdcuentaalumnos() == null ? other.getIdcuentaalumnos() == null : this.getIdcuentaalumnos().equals(other.getIdcuentaalumnos()))
            && (this.getIdtipocuenta() == null ? other.getIdtipocuenta() == null : this.getIdtipocuenta().equals(other.getIdtipocuenta()))
            && (this.getIdalumno() == null ? other.getIdalumno() == null : this.getIdalumno().equals(other.getIdalumno()))
            && (this.getCupototal() == null ? other.getCupototal() == null : this.getCupototal().equals(other.getCupototal()))
            && (this.getCupoutilizado() == null ? other.getCupoutilizado() == null : this.getCupoutilizado().equals(other.getCupoutilizado()))
            && (this.getAporte() == null ? other.getAporte() == null : this.getAporte().equals(other.getAporte()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentaalumnos() == null) ? 0 : getIdcuentaalumnos().hashCode());
        result = prime * result + ((getIdtipocuenta() == null) ? 0 : getIdtipocuenta().hashCode());
        result = prime * result + ((getIdalumno() == null) ? 0 : getIdalumno().hashCode());
        result = prime * result + ((getCupototal() == null) ? 0 : getCupototal().hashCode());
        result = prime * result + ((getCupoutilizado() == null) ? 0 : getCupoutilizado().hashCode());
        result = prime * result + ((getAporte() == null) ? 0 : getAporte().hashCode());
        return result;
    }
}