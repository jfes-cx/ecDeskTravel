package com.duoc.domain;

import java.math.BigDecimal;

public class Destino extends DestinoKey {

    private String nombredestino;

    private BigDecimal idpais;

    public String getNombredestino() {
        return nombredestino;
    }

    public void setNombredestino(String nombredestino) {
        this.nombredestino = nombredestino;
    }

    public BigDecimal getIdpais() {
        return idpais;
    }

    public void setIdpais(BigDecimal idpais) {
        this.idpais = idpais;
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
        Destino other = (Destino) that;
        return (this.getIddestino() == null ? other.getIddestino() == null : this.getIddestino().equals(other.getIddestino()))
                && (this.getNombredestino() == null ? other.getNombredestino() == null : this.getNombredestino().equals(other.getNombredestino()))
                && (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIddestino() == null) ? 0 : getIddestino().hashCode());
        result = prime * result + ((getNombredestino() == null) ? 0 : getNombredestino().hashCode());
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        return result;
    }
}
