package com.duoc.domain;

public class CiudadKey {
    private Short idciudad;

    public Short getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Short idciudad) {
        this.idciudad = idciudad;
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
        CiudadKey other = (CiudadKey) that;
        return (this.getIdciudad() == null ? other.getIdciudad() == null : this.getIdciudad().equals(other.getIdciudad()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdciudad() == null) ? 0 : getIdciudad().hashCode());
        return result;
    }
}