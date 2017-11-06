package com.duoc.domain;

import java.math.BigDecimal;

public class Colegio extends ColegioKey {
    private String nombre;

    private String direccion;

    private BigDecimal telefono;

    private BigDecimal idcomuna;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigDecimal getTelefono() {
        return telefono;
    }

    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(BigDecimal idcomuna) {
        this.idcomuna = idcomuna;
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
        Colegio other = (Colegio) that;
        return (this.getIdcolegio() == null ? other.getIdcolegio() == null : this.getIdcolegio().equals(other.getIdcolegio()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDireccion() == null ? other.getDireccion() == null : this.getDireccion().equals(other.getDireccion()))
            && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
            && (this.getIdcomuna() == null ? other.getIdcomuna() == null : this.getIdcomuna().equals(other.getIdcomuna()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcolegio() == null) ? 0 : getIdcolegio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDireccion() == null) ? 0 : getDireccion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getIdcomuna() == null) ? 0 : getIdcomuna().hashCode());
        return result;
    }
}