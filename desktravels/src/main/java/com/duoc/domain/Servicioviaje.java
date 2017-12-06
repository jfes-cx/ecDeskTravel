package com.duoc.domain;

public class Servicioviaje extends ServicioviajeKey {
    private String tiposervicio;

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
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
        Servicioviaje other = (Servicioviaje) that;
        return (this.getIdservicioviaje() == null ? other.getIdservicioviaje() == null : this.getIdservicioviaje().equals(other.getIdservicioviaje()))
            && (this.getTiposervicio() == null ? other.getTiposervicio() == null : this.getTiposervicio().equals(other.getTiposervicio()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdservicioviaje() == null) ? 0 : getIdservicioviaje().hashCode());
        result = prime * result + ((getTiposervicio() == null) ? 0 : getTiposervicio().hashCode());
        return result;
    }
}