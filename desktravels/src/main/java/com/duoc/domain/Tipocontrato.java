package com.duoc.domain;

public class Tipocontrato extends TipocontratoKey {
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
        Tipocontrato other = (Tipocontrato) that;
        return (this.getIdtipocontrato() == null ? other.getIdtipocontrato() == null : this.getIdtipocontrato().equals(other.getIdtipocontrato()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocontrato() == null) ? 0 : getIdtipocontrato().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}