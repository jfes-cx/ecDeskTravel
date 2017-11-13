package com.duoc.domain;

public class Tiposervicio extends TiposervicioKey {

    private String nombre;

    private String descripcion;

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
        Tiposervicio other = (Tiposervicio) that;
        return (this.getIdtiposervicio() == null ? other.getIdtiposervicio() == null : this.getIdtiposervicio().equals(other.getIdtiposervicio()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtiposervicio() == null) ? 0 : getIdtiposervicio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        return result;
    }
}
