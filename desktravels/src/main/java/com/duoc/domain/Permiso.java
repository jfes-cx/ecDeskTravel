package com.duoc.domain;

import java.math.BigDecimal;

public class Permiso extends PermisoKey {

    private BigDecimal idperfil;

    private String nombre;

    private String descripcion;

    public BigDecimal getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BigDecimal idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        Permiso other = (Permiso) that;
        return (this.getIdpermiso() == null ? other.getIdpermiso() == null : this.getIdpermiso().equals(other.getIdpermiso()))
                && (this.getIdperfil() == null ? other.getIdperfil() == null : this.getIdperfil().equals(other.getIdperfil()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpermiso() == null) ? 0 : getIdpermiso().hashCode());
        result = prime * result + ((getIdperfil() == null) ? 0 : getIdperfil().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        return result;
    }
}
