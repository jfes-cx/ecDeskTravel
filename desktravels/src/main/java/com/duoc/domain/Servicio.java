package com.duoc.domain;

import java.math.BigDecimal;

public class Servicio extends ServicioKey {
    private BigDecimal idtiposervicio;

    private String nombre;

    private String descripcion;

    private BigDecimal telefono;

    private String encargado;

    public BigDecimal getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(BigDecimal idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
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

    public BigDecimal getTelefono() {
        return telefono;
    }

    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
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
            && (this.getIdtiposervicio() == null ? other.getIdtiposervicio() == null : this.getIdtiposervicio().equals(other.getIdtiposervicio()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()))
            && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
            && (this.getEncargado() == null ? other.getEncargado() == null : this.getEncargado().equals(other.getEncargado()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdservicio() == null) ? 0 : getIdservicio().hashCode());
        result = prime * result + ((getIdtiposervicio() == null) ? 0 : getIdtiposervicio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getEncargado() == null) ? 0 : getEncargado().hashCode());
        return result;
    }
}