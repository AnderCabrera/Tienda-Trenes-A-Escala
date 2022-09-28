/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.modelo;

/**
 *
 * @author informatica
 */
public class usuarios {
    private int id_cliente;
    private String usuario;
    private String contrasena;
    private boolean estado_activo;
    private boolean administrador;

    public usuarios() {
    }

    public usuarios(int id_cliente, String usuario, String contrasena, boolean estado_activo, boolean administrador) {
        this.id_cliente = id_cliente;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado_activo = estado_activo;
        this.administrador = administrador;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado_activo() {
        return estado_activo;
    }

    public void setEstado_activo(boolean estado_activo) {
        this.estado_activo = estado_activo;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}
