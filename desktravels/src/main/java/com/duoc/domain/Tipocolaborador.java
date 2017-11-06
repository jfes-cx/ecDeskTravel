package com.duoc.domain;

public class Tipocolaborador extends TipocolaboradorKey {
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        Tipocolaborador other = (Tipocolaborador) that;
        return (this.getIdtipocolaborador() == null ? other.getIdtipocolaborador() == null : this.getIdtipocolaborador().equals(other.getIdtipocolaborador()))
            && (this.getDescripcion() == null ? other.getDescripcion() == null : this.getDescripcion().equals(other.getDescripcion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocolaborador() == null) ? 0 : getIdtipocolaborador().hashCode());
        result = prime * result + ((getDescripcion() == null) ? 0 : getDescripcion().hashCode());
        return result;
    }
}