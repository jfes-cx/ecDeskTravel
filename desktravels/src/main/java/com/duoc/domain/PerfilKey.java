package com.duoc.domain;

import java.math.BigDecimal;

public class PerfilKey {
    private BigDecimal idperfil;

    public BigDecimal getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BigDecimal idperfil) {
        this.idperfil = idperfil;
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
        PerfilKey other = (PerfilKey) that;
        return (this.getIdperfil() == null ? other.getIdperfil() == null : this.getIdperfil().equals(other.getIdperfil()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdperfil() == null) ? 0 : getIdperfil().hashCode());
        return result;
    }
}