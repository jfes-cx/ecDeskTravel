package com.duoc.domain;

public class Tipocuenta extends TipocuentaKey {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        Tipocuenta other = (Tipocuenta) that;
        return (this.getIdtipocuenta() == null ? other.getIdtipocuenta() == null : this.getIdtipocuenta().equals(other.getIdtipocuenta()))
            && (this.getNombre() == null ? other.getNombre() == null : this.getNombre().equals(other.getNombre()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdtipocuenta() == null) ? 0 : getIdtipocuenta().hashCode());
        result = prime * result + ((getNombre() == null) ? 0 : getNombre().hashCode());
        return result;
    }
}