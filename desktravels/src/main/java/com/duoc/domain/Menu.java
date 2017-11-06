package com.duoc.domain;

import java.math.BigDecimal;

public class Menu extends MenuKey {
    private BigDecimal idperfil;

    private String nombremenu;

    public BigDecimal getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BigDecimal idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombremenu() {
        return nombremenu;
    }

    public void setNombremenu(String nombremenu) {
        this.nombremenu = nombremenu;
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
        Menu other = (Menu) that;
        return (this.getIdmenu() == null ? other.getIdmenu() == null : this.getIdmenu().equals(other.getIdmenu()))
            && (this.getIdperfil() == null ? other.getIdperfil() == null : this.getIdperfil().equals(other.getIdperfil()))
            && (this.getNombremenu() == null ? other.getNombremenu() == null : this.getNombremenu().equals(other.getNombremenu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdmenu() == null) ? 0 : getIdmenu().hashCode());
        result = prime * result + ((getIdperfil() == null) ? 0 : getIdperfil().hashCode());
        result = prime * result + ((getNombremenu() == null) ? 0 : getNombremenu().hashCode());
        return result;
    }
}