package com.duoc.domain;

import java.math.BigDecimal;

public class Cuentausuario extends CuentausuarioKey {

    private BigDecimal idperfil;

    private String nombreusuario;

    private String apellido;

    private String correoelectronico;

    private String contrasena;
    
    private String nombrePerfil;
    
    private String estado;

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    
    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public BigDecimal getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(BigDecimal idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
        Cuentausuario other = (Cuentausuario) that;
        return (this.getIdcuentausuario() == null ? other.getIdcuentausuario() == null : this.getIdcuentausuario().equals(other.getIdcuentausuario()))
                && (this.getIdperfil() == null ? other.getIdperfil() == null : this.getIdperfil().equals(other.getIdperfil()))
                && (this.getNombreusuario() == null ? other.getNombreusuario() == null : this.getNombreusuario().equals(other.getNombreusuario()))
                && (this.getApellido() == null ? other.getApellido() == null : this.getApellido().equals(other.getApellido()))
                && (this.getCorreoelectronico() == null ? other.getCorreoelectronico() == null : this.getCorreoelectronico().equals(other.getCorreoelectronico()))
                && (this.getContrasena() == null ? other.getContrasena() == null : this.getContrasena().equals(other.getContrasena()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdcuentausuario() == null) ? 0 : getIdcuentausuario().hashCode());
        result = prime * result + ((getIdperfil() == null) ? 0 : getIdperfil().hashCode());
        result = prime * result + ((getNombreusuario() == null) ? 0 : getNombreusuario().hashCode());
        result = prime * result + ((getApellido() == null) ? 0 : getApellido().hashCode());
        result = prime * result + ((getCorreoelectronico() == null) ? 0 : getCorreoelectronico().hashCode());
        result = prime * result + ((getContrasena() == null) ? 0 : getContrasena().hashCode());
        return result;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
