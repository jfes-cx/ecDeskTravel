package com.duoc.domain;

import java.math.BigDecimal;

public class Apoderado extends ApoderadoKey {

    private String nombre;

    private String rut;

    private String direccion;

    private BigDecimal telefono;

    private String celular;

    private String apellidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        Apoderado other = (Apoderado) that;
        return (this.getIdapoderado() == null ? other.getIdapoderado() == null : this.getIdapoderado().equals(other.getIdapoderado()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getRut() == null ? other.getRut() == null : this.getRut().equals(other.getRut()))
                && (this.getDireccion() == null ? other.getDireccion() == null : this.getDireccion().equals(other.getDireccion()))
                && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
                && (this.getCelular() == null ? other.getCelular() == null : this.getCelular().equals(other.getCelular()))
                && (this.getApellidos() == null ? other.getApellidos() == null : this.getApellidos().equals(other.getApellidos()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdapoderado() == null) ? 0 : getIdapoderado().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getRut() == null) ? 0 : getRut().hashCode());
        result = prime * result + ((getDireccion() == null) ? 0 : getDireccion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getCelular() == null) ? 0 : getCelular().hashCode());
        result = prime * result + ((getApellidos() == null) ? 0 : getApellidos().hashCode());
        return result;
    }
}
