package com.duoc.domain;

import java.math.BigDecimal;

public class PermisoKey {

    private BigDecimal idpermiso;

    public BigDecimal getIdpermiso() {
        return idpermiso;
    }

    public void setIdpermiso(BigDecimal idpermiso) {
        this.idpermiso = idpermiso;
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
        PermisoKey other = (PermisoKey) that;
        return (this.getIdpermiso() == null ? other.getIdpermiso() == null : this.getIdpermiso().equals(other.getIdpermiso()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdpermiso() == null) ? 0 : getIdpermiso().hashCode());
        return result;
    }
}
