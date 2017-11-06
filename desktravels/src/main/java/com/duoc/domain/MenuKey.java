package com.duoc.domain;

import java.math.BigDecimal;

public class MenuKey {
    private BigDecimal idmenu;

    public BigDecimal getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(BigDecimal idmenu) {
        this.idmenu = idmenu;
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
        MenuKey other = (MenuKey) that;
        return (this.getIdmenu() == null ? other.getIdmenu() == null : this.getIdmenu().equals(other.getIdmenu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdmenu() == null) ? 0 : getIdmenu().hashCode());
        return result;
    }
}