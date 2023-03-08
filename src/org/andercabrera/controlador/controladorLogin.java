package org.andercabrera.controlador;

import org.andercabrera.modelo.*;

import java.sql.*;

public class controladorLogin {

  clientes modeloClientes = clientes.getInstance();
  connection conexion = connection.getInstance();

  // constructor
  public controladorLogin() {
  }

  // singleton
  private static controladorLogin instance = null;

  public static controladorLogin getInstance() {
    if (instance == null) {
      instance = new controladorLogin();
    }
    return instance;
  }

  public boolean login(String user, String password) {
    try {
      Connection con = conexion.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT * FROM tbl_usuarios WHERE usuario = ? AND contrasena = ?");
      ps.setString(1, user);
      ps.setString(2, password);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        return true;
      }

    } catch (SQLException e) {
      System.out.println("Error al iniciar sesión: " + e.getMessage());
      e.printStackTrace();
    }
    return false;
  }


}
