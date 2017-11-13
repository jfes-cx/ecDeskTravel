package com.duoc.domain;

import java.math.BigDecimal;

public class Colaborador extends ColaboradorKey {

    private String nombre;

    private String direccion;

    private BigDecimal telefono;

    private BigDecimal idcuentausuario;

    private BigDecimal idtipocolaborador;

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

    public BigDecimal getIdcuentausuario() {
        return idcuentausuario;
    }

    public void setIdcuentausuario(BigDecimal idcuentausuario) {
        this.idcuentausuario = idcuentausuario;
    }

    public BigDecimal getIdtipocolaborador() {
        return idtipocolaborador;
    }

    public void setIdtipocolaborador(BigDecimal idtipocolaborador) {
        this.idtipocolaborador = idtipocolaborador;
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
        Colaborador other = (Colaborador) that;
        return (this.getIdcolaborador() == null ? other.getIdcolaborador() == null : this.getIdcolaborador().equals(other.getIdcolaborador()))
                && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
                && (this.getDireccion() == null ? other.getDireccion() == null : this.getDireccion().equals(other.getDireccion()))
                && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
                && (this.getIdcuentausuario() == null ? other.getIdcuentausuario() == null : this.getIdcuentausuario().equals(other.getIdcuentausuario()))
                && (this.getIdtipocolaborador() == null ? other.getIdtipocolaborador() == null : this.getIdtipocolaborador().equals(other.getIdtipocolaborador()))
                && (this.getRut() == null ? other.getRut() == null : this.getRut().equals(other.getRut()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcolaborador() == null) ? 0 : getIdcolaborador().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDireccion() == null) ? 0 : getDireccion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getIdcuentausuario() == null) ? 0 : getIdcuentausuario().hashCode());
        result = prime * result + ((getIdtipocolaborador() == null) ? 0 : getIdtipocolaborador().hashCode());
        result = prime * result + ((getRut() == null) ? 0 : getRut().hashCode());
        return result;
    }
}
