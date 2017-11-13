package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Estadocuenta extends EstadocuentaKey {

    private BigDecimal idcuentaalumno;

    private String detalle;

    private Date fecha;

    public BigDecimal getIdcuentaalumno() {
        return idcuentaalumno;
    }

    public void setIdcuentaalumno(BigDecimal idcuentaalumno) {
        this.idcuentaalumno = idcuentaalumno;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        Estadocuenta other = (Estadocuenta) that;
        return (this.getIdestadocuenta() == null ? other.getIdestadocuenta() == null : this.getIdestadocuenta().equals(other.getIdestadocuenta()))
                && (this.getIdcuentaalumno() == null ? other.getIdcuentaalumno() == null : this.getIdcuentaalumno().equals(other.getIdcuentaalumno()))
                && (this.getDetalle() == null ? other.getDetalle() == null : this.getDetalle().equals(other.getDetalle()))
                && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdestadocuenta() == null) ? 0 : getIdestadocuenta().hashCode());
        result = prime * result + ((getIdcuentaalumno() == null) ? 0 : getIdcuentaalumno().hashCode());
        result = prime * result + ((getDetalle() == null) ? 0 : getDetalle().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        return result;
    }
}
