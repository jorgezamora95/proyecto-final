/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorge.fin;

import org.springframework.data.annotation.Id;

/**
 *
 * @author T-
 */
public class Usuario {
    @Id
    private String rfc;
    private String nombre;
    private String mail;
    private Direccion direccion;

    public Usuario() {
    }

    public Usuario(String rfc) {
        this.rfc = rfc;
    }

    public Usuario(String rfc, String nombre, String mail, Direccion direccion) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
}
