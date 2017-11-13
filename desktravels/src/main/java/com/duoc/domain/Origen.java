package com.duoc.domain;

import java.math.BigDecimal;

public class Origen extends OrigenKey {

    private String nombreorigen;

    private BigDecimal idpais;

    public String getNombreorigen() {
        return nombreorigen;
    }

    public void setNombreorigen(String nombreorigen) {
        this.nombreorigen = nombreorigen;
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
        Origen other = (Origen) that;
        return (this.getIdorigen() == null ? other.getIdorigen() == null : this.getIdorigen().equals(other.getIdorigen()))
                && (this.getNombreorigen() == null ? other.getNombreorigen() == null : this.getNombreorigen().equals(other.getNombreorigen()))
                && (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdorigen() == null) ? 0 : getIdorigen().hashCode());
        result = prime * result + ((getNombreorigen() == null) ? 0 : getNombreorigen().hashCode());
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        return result;
    }
}
