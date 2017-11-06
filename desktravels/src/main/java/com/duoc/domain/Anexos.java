package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Anexos extends AnexosKey {
    private BigDecimal idcontrato;

    private String archivo;

    private String token;

    private Date fecha;

    public BigDecimal getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        Anexos other = (Anexos) that;
        return (this.getIdanexo() == null ? other.getIdanexo() == null : this.getIdanexo().equals(other.getIdanexo()))
            && (this.getIdcontrato() == null ? other.getIdcontrato() == null : this.getIdcontrato().equals(other.getIdcontrato()))
            && (this.getArchivo() == null ? other.getArchivo() == null : this.getArchivo().equals(other.getArchivo()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdanexo() == null) ? 0 : getIdanexo().hashCode());
        result = prime * result + ((getIdcontrato() == null) ? 0 : getIdcontrato().hashCode());
        result = prime * result + ((getArchivo() == null) ? 0 : getArchivo().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        return result;
    }
}