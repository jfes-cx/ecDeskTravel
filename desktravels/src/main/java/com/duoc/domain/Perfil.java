package com.duoc.domain;

public class Perfil extends PerfilKey {

    private String descripcion;

    private String estado;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        Perfil other = (Perfil) that;
        return (this.getIdperfil() == null ? other.getIdperfil() == null : this.getIdperfil().equals(other.getIdperfil()))
                && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
                && (this.getEstado() == null ? other.getEstado() == null : this.getEstado().equals(other.getEstado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdperfil() == null) ? 0 : getIdperfil().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getEstado() == null) ? 0 : getEstado().hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return  getDescripcion();
    }
}
