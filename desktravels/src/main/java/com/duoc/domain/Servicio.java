package com.duoc.domain;

import java.math.BigDecimal;

public class Servicio extends ServicioKey {
    private String nombre;

    private String descripcion;

    private BigDecimal idservicioviaje;

    private BigDecimal precio;

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

    public BigDecimal getIdservicioviaje() {
        return idservicioviaje;
    }

    public void setIdservicioviaje(BigDecimal idservicioviaje) {
        this.idservicioviaje = idservicioviaje;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
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
        Servicio other = (Servicio) that;
        return (this.getIdservicio() == null ? other.getIdservicio() == null : this.getIdservicio().equals(other.getIdservicio()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getIdservicioviaje() == null ? other.getIdservicioviaje() == null : this.getIdservicioviaje().equals(other.getIdservicioviaje()))
            && (this.getPrecio() == null ? other.getPrecio() == null : this.getPrecio().equals(other.getPrecio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdservicio() == null) ? 0 : getIdservicio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getIdservicioviaje() == null) ? 0 : getIdservicioviaje().hashCode());
        result = prime * result + ((getPrecio() == null) ? 0 : getPrecio().hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return getNombre();
    }
}