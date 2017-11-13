package com.duoc.domain;

public class Tipoactividad extends TipoactividadKey {

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
        Tipoactividad other = (Tipoactividad) that;
        return (this.getIdtipoactividad() == null ? other.getIdtipoactividad() == null : this.getIdtipoactividad().equals(other.getIdtipoactividad()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipoactividad() == null) ? 0 : getIdtipoactividad().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}
