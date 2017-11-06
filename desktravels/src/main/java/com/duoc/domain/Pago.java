package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Pago extends PagoKey {
    private BigDecimal idtipopago;

    private BigDecimal idcuentacurso;

    private BigDecimal idcuentaalumno;

    private Date fechapago;

    private String detalle;

    private BigDecimal montocancelado;

    public BigDecimal getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
    }

    public BigDecimal getIdcuentacurso() {
        return idcuentacurso;
    }

    public void setIdcuentacurso(BigDecimal idcuentacurso) {
        this.idcuentacurso = idcuentacurso;
    }

    public BigDecimal getIdcuentaalumno() {
        return idcuentaalumno;
    }

    public void setIdcuentaalumno(BigDecimal idcuentaalumno) {
        this.idcuentaalumno = idcuentaalumno;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public BigDecimal getMontocancelado() {
        return montocancelado;
    }

    public void setMontocancelado(BigDecimal montocancelado) {
        this.montocancelado = montocancelado;
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
        Pago other = (Pago) that;
        return (this.getIdpago() == null ? other.getIdpago() == null : this.getIdpago().equals(other.getIdpago()))
            && (this.getIdtipopago() == null ? other.getIdtipopago() == null : this.getIdtipopago().equals(other.getIdtipopago()))
            && (this.getIdcuentacurso() == null ? other.getIdcuentacurso() == null : this.getIdcuentacurso().equals(other.getIdcuentacurso()))
            && (this.getIdcuentaalumno() == null ? other.getIdcuentaalumno() == null : this.getIdcuentaalumno().equals(other.getIdcuentaalumno()))
            && (this.getFechapago() == null ? other.getFechapago() == null : this.getFechapago().equals(other.getFechapago()))
            && (this.getDetalle() == null ? other.getDetalle() == null : this.getDetalle().equals(other.getDetalle()))
            && (this.getMontocancelado() == null ? other.getMontocancelado() == null : this.getMontocancelado().equals(other.getMontocancelado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpago() == null) ? 0 : getIdpago().hashCode());
        result = prime * result + ((getIdtipopago() == null) ? 0 : getIdtipopago().hashCode());
        result = prime * result + ((getIdcuentacurso() == null) ? 0 : getIdcuentacurso().hashCode());
        result = prime * result + ((getIdcuentaalumno() == null) ? 0 : getIdcuentaalumno().hashCode());
        result = prime * result + ((getFechapago() == null) ? 0 : getFechapago().hashCode());
        result = prime * result + ((getDetalle() == null) ? 0 : getDetalle().hashCode());
        result = prime * result + ((getMontocancelado() == null) ? 0 : getMontocancelado().hashCode());
        return result;
    }
}