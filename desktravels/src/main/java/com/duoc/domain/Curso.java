package com.duoc.domain;

import java.math.BigDecimal;

public class Curso extends CursoKey {
    private BigDecimal idcolegio;

    private String nombre;

    private String profesorjefe;

    private BigDecimal cantidadalumnos;

    public BigDecimal getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesorjefe() {
        return profesorjefe;
    }

    public void setProfesorjefe(String profesorjefe) {
        this.profesorjefe = profesorjefe;
    }

    public BigDecimal getCantidadalumnos() {
        return cantidadalumnos;
    }

    public void setCantidadalumnos(BigDecimal cantidadalumnos) {
        this.cantidadalumnos = cantidadalumnos;
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
        Curso other = (Curso) that;
        return (this.getIdcurso() == null ? other.getIdcurso() == null : this.getIdcurso().equals(other.getIdcurso()))
            && (this.getIdcolegio() == null ? other.getIdcolegio() == null : this.getIdcolegio().equals(other.getIdcolegio()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getProfesorjefe() == null ? other.getProfesorjefe() == null : this.getProfesorjefe().equals(other.getProfesorjefe()))
            && (this.getCantidadalumnos() == null ? other.getCantidadalumnos() == null : this.getCantidadalumnos().equals(other.getCantidadalumnos()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcurso() == null) ? 0 : getIdcurso().hashCode());
        result = prime * result + ((getIdcolegio() == null) ? 0 : getIdcolegio().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getProfesorjefe() == null) ? 0 : getProfesorjefe().hashCode());
        result = prime * result + ((getCantidadalumnos() == null) ? 0 : getCantidadalumnos().hashCode());
        return result;
    }
}