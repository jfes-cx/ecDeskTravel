package com.duoc.domain;

import java.math.BigDecimal;

public class MidServicioCt extends MidServicioCtKey {
    private BigDecimal idservicio;

    private BigDecimal idcontrato;

    private BigDecimal idpaquete;

    public BigDecimal getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
    }

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
        MidServicioCt other = (MidServicioCt) that;
        return (this.getIdserviciopaquete() == null ? other.getIdserviciopaquete() == null : this.getIdserviciopaquete().equals(other.getIdserviciopaquete()))
            && (this.getIdservicio() == null ? other.getIdservicio() == null : this.getIdservicio().equals(other.getIdservicio()))
            && (this.getIdcontrato() == null ? other.getIdcontrato() == null : this.getIdcontrato().equals(other.getIdcontrato()))
            && (this.getIdpaquete() == null ? other.getIdpaquete() == null : this.getIdpaquete().equals(other.getIdpaquete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdserviciopaquete() == null) ? 0 : getIdserviciopaquete().hashCode());
        result = prime * result + ((getIdservicio() == null) ? 0 : getIdservicio().hashCode());
        result = prime * result + ((getIdcontrato() == null) ? 0 : getIdcontrato().hashCode());
        result = prime * result + ((getIdpaquete() == null) ? 0 : getIdpaquete().hashCode());
        return result;
    }
}