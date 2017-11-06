package com.duoc.domain;

public class Pais extends PaisKey {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Pais other = (Pais) that;
        return (this.getIdpais() == null ? other.getIdpais() == null : this.getIdpais().equals(other.getIdpais()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpais() == null) ? 0 : getIdpais().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}