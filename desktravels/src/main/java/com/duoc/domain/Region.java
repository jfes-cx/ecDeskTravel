package com.duoc.domain;

import java.math.BigDecimal;

public class Region extends RegionKey {

    private String nombre;

    private BigDecimal idpais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Region other = (Region) that;
        return (this.getIdregion() == null ? other.getIdregion() == null : this.getIdregion().equals(other.getIdregion()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdregion() == null) ? 0 : getIdregion().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getNombre();

    }
}
