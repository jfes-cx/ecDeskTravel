package com.duoc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Paquete extends PaqueteKey {
    private Date fecha;

    private String nombre;

    private BigDecimal precio;

    private BigDecimal iddestino;

    private Short idorigen;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getIddestino() {
        return iddestino;
    }

    public void setIddestino(BigDecimal iddestino) {
        this.iddestino = iddestino;
    }

    public Short getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(Short idorigen) {
        this.idorigen = idorigen;
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
        Paquete other = (Paquete) that;
        return (this.getIdpaquete() == null ? other.getIdpaquete() == null : this.getIdpaquete().equals(other.getIdpaquete()))
            && (this.getFecha() == null ? other.getFecha() == null : this.getFecha().equals(other.getFecha()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()))
            && (this.getPrecio() == null ? other.getPrecio() == null : this.getPrecio().equals(other.getPrecio()))
            && (this.getIddestino() == null ? other.getIddestino() == null : this.getIddestino().equals(other.getIddestino()))
            && (this.getIdorigen() == null ? other.getIdorigen() == null : this.getIdorigen().equals(other.getIdorigen()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpaquete() == null) ? 0 : getIdpaquete().hashCode());
        result = prime * result + ((getFecha() == null) ? 0 : getFecha().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        result = prime * result + ((getPrecio() == null) ? 0 : getPrecio().hashCode());
        result = prime * result + ((getIddestino() == null) ? 0 : getIddestino().hashCode());
        result = prime * result + ((getIdorigen() == null) ? 0 : getIdorigen().hashCode());
        return result;
    }
    
    @Override
    public String toString(){
        return getNombre();
    }
}