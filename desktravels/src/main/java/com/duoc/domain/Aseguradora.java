package com.duoc.domain;

import java.math.BigDecimal;

public class Aseguradora extends AseguradoraKey {
    private String nombre;

    private String direccion;

    private BigDecimal telefono;

    private String email;

    private String nombrecontacto;

    private String rut;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
        Aseguradora other = (Aseguradora) that;
        return (this.getIdaseguradora() == null ? other.getIdaseguradora() == null : this.getIdaseguradora().equals(other.getIdaseguradora()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDireccion() == null ? other.getDireccion() == null : this.getDireccion().equals(other.getDireccion()))
            && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getNombrecontacto() == null ? other.getNombrecontacto() == null : this.getNombrecontacto().equals(other.getNombrecontacto()))
            && (this.getRut() == null ? other.getRut() == null : this.getRut().equals(other.getRut()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdaseguradora() == null) ? 0 : getIdaseguradora().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDireccion() == null) ? 0 : getDireccion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getNombrecontacto() == null) ? 0 : getNombrecontacto().hashCode());
        result = prime * result + ((getRut() == null) ? 0 : getRut().hashCode());
        return result;
    }
}