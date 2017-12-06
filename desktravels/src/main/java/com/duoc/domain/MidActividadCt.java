package com.duoc.domain;

import java.math.BigDecimal;

public class MidActividadCt extends MidActividadCtKey {
    private BigDecimal idcontrato;

    private BigDecimal idpaquete;

    private BigDecimal idactividadviaje;

    public BigDecimal getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }

    public BigDecimal getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(BigDecimal idpaquete) {
        this.idpaquete = idpaquete;
    }

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
        MidActividadCt other = (MidActividadCt) that;
        return (this.getIdactividadpaquete() == null ? other.getIdactividadpaquete() == null : this.getIdactividadpaquete().equals(other.getIdactividadpaquete()))
            && (this.getIdcontrato() == null ? other.getIdcontrato() == null : this.getIdcontrato().equals(other.getIdcontrato()))
            && (this.getIdpaquete() == null ? other.getIdpaquete() == null : this.getIdpaquete().equals(other.getIdpaquete()))
            && (this.getIdactividadviaje() == null ? other.getIdactividadviaje() == null : this.getIdactividadviaje().equals(other.getIdactividadviaje()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdactividadpaquete() == null) ? 0 : getIdactividadpaquete().hashCode());
        result = prime * result + ((getIdcontrato() == null) ? 0 : getIdcontrato().hashCode());
        result = prime * result + ((getIdpaquete() == null) ? 0 : getIdpaquete().hashCode());
        result = prime * result + ((getIdactividadviaje() == null) ? 0 : getIdactividadviaje().hashCode());
        return result;
    }
}