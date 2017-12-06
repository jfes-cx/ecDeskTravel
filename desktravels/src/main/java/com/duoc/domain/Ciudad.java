package com.duoc.domain;

import java.math.BigDecimal;

public class Ciudad extends CiudadKey {
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
        Ciudad other = (Ciudad) that;
        return (this.getIdciudad() == null ? other.getIdciudad() == null : this.getIdciudad().equals(other.getIdciudad()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdciudad() == null) ? 0 : getIdciudad().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        return result;
    }
}