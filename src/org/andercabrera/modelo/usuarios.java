package org.andercabrera.modelo;

public class usuarios {
    private int id_usuario;
    private int id_cliente;
    private String usuario;
    private String contrasena;
    private boolean estado_activo;
    private boolean administrador;
    
    private static usuarios instance = null;
    
    public usuarios() {
    }
    
    public usuarios(int id_cliente, String usuario, String contrasena, boolean estado_activo, boolean administrador) {
        this.id_cliente = id_cliente;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estado_activo = estado_activo;
        this.administrador = administrador;
    }

    // singleton
    public static usuarios getInstance() {
      if (instance == null) {
        instance = new usuarios();
      }
      return instance;
    }

    public int getId_usuario() {
      return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
      this.id_usuario = id_usuario;
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
