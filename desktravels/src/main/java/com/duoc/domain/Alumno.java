package com.duoc.domain;

import java.math.BigDecimal;

public class Alumno extends AlumnoKey {
    private BigDecimal idapoderado;

    private BigDecimal idcurso;

    private String nombre;

    private String direccion;

    private BigDecimal telefono;

    private String correoelectronico;

    private String rut;

    private String apellidos;

    public BigDecimal getIdapoderado() {
        return idapoderado;
    }

    public void setIdapoderado(BigDecimal idapoderado) {
        this.idapoderado = idapoderado;
    }

    public BigDecimal getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
    }

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

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
        Alumno other = (Alumno) that;
        return (this.getIdalumno() == null ? other.getIdalumno() == null : this.getIdalumno().equals(other.getIdalumno()))
            && (this.getIdapoderado() == null ? other.getIdapoderado() == null : this.getIdapoderado().equals(other.getIdapoderado()))
            && (this.getIdcurso() == null ? other.getIdcurso() == null : this.getIdcurso().equals(other.getIdcurso()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getDireccion() == null ? other.getDireccion() == null : this.getDireccion().equals(other.getDireccion()))
            && (this.getTelefono() == null ? other.getTelefono() == null : this.getTelefono().equals(other.getTelefono()))
            && (this.getCorreoelectronico() == null ? other.getCorreoelectronico() == null : this.getCorreoelectronico().equals(other.getCorreoelectronico()))
            && (this.getRut() == null ? other.getRut() == null : this.getRut().equals(other.getRut()))
            && (this.getApellidos() == null ? other.getApellidos() == null : this.getApellidos().equals(other.getApellidos()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdalumno() == null) ? 0 : getIdalumno().hashCode());
        result = prime * result + ((getIdapoderado() == null) ? 0 : getIdapoderado().hashCode());
        result = prime * result + ((getIdcurso() == null) ? 0 : getIdcurso().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getDireccion() == null) ? 0 : getDireccion().hashCode());
        result = prime * result + ((getTelefono() == null) ? 0 : getTelefono().hashCode());
        result = prime * result + ((getCorreoelectronico() == null) ? 0 : getCorreoelectronico().hashCode());
        result = prime * result + ((getRut() == null) ? 0 : getRut().hashCode());
        result = prime * result + ((getApellidos() == null) ? 0 : getApellidos().hashCode());
        return result;
    }
    
    @Override
	public
    String toString(){
    	return "Alumno: RUT: "+getRut()+"Nombre: "+getNombre();
    }
}