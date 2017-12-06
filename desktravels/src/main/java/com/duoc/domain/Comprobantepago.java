package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Comprobantepago extends ComprobantepagoKey {
    private String rutaArchivo;

    private BigDecimal idPago;

    private Date fecha;

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public BigDecimal getIdPago() {
        return idPago;
    }

    public void setIdPago(BigDecimal idPago) {
        this.idPago = idPago;
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
        Comprobantepago other = (Comprobantepago) that;
        return (this.getIdComprobantePago() == null ? other.getIdComprobantePago() == null : this.getIdComprobantePago().equals(other.getIdComprobantePago()))
            && (this.getRutaArchivo() == null ? other.getRutaArchivo() == null : this.getRutaArchivo().equals(other.getRutaArchivo()))
            && (this.getIdPago() == null ? other.getIdPago() == null : this.getIdPago().equals(other.getIdPago()))
            && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdComprobantePago() == null) ? 0 : getIdComprobantePago().hashCode());
        result = prime * result + ((getRutaArchivo() == null) ? 0 : getRutaArchivo().hashCode());
        result = prime * result + ((getIdPago() == null) ? 0 : getIdPago().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        return result;
    }
}