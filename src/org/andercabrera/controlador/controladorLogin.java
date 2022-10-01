/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import org.andercabrera.modelo.*;

import java.sql.*;

/**
 *
 * @author Deran
 */
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

  //get id_cliente from database
  public void getIdCliente(String user) {
    int id = 0;
    try {
      Connection con = conexion.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT id_cliente FROM tbl_usuarios WHERE usuario = ?");
      ps.setString(1, user);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        id = rs.getInt("id_cliente");
      }
    } catch (SQLException e) {
      System.out.println("Error al obtener id_cliente: " + e.getMessage());
      e.printStackTrace();
    }
    modeloUsuarios.setId_cliente(id);
    System.out.println("id_cliente: " + modeloUsuarios.getId_cliente());
  }

}
