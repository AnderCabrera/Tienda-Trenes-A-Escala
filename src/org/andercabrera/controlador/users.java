package org.andercabrera.controlador;

import org.andercabrera.modelo.usuarios;

import java.sql.*;

/**
 * users
 */
public class users {
    connection conexion = new connection().getInstance();
  
    // constructor
    public users() {
    }
  
    // singleton
    private static users instance = null;
  
    public static users getInstance() {
      if (instance == null) {
        instance = new users();
      }
      return instance;
    }
  
    public void insertUser(usuarios client, String procedure) {
      try {
        Connection con = conexion.getConnection();
        PreparedStatement ps = con.prepareStatement(procedure);
  
        ps.setInt(1, client.getId_cliente());
        ps.setString(2, client.getUsuario());
        ps.setString(3, client.getContrasena());
        ps.setBoolean(4, client.isEstado_activo());
        ps.setBoolean(5, client.isAdministrador());
  
        ps.executeUpdate();
      } catch (SQLException e) {
        System.out.println("Error al insertar usuario: " + e.getMessage());
        e.printStackTrace();
      }
    }
  
    public void updateUser(int id_usuario, usuarios clientToUpdate, String procedure) {
      try {
  
        // connection
        Connection con = conexion.getConnection();
        PreparedStatement pst = con.prepareCall(procedure);
  
        // set parameters
        pst.setInt(1, id_usuario);
        pst.setInt(2, clientToUpdate.getId_cliente());
        pst.setString(3, clientToUpdate.getUsuario());
        pst.setString(4, clientToUpdate.getContrasena());
        pst.setBoolean(5, clientToUpdate.isEstado_activo());
        pst.setBoolean(6, clientToUpdate.isAdministrador());
        pst.execute();
  
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  
    public void deleteUser(int id_usuario, String procedure) {
      try {
  
        // connection
        Connection con = conexion.getConnection();
        PreparedStatement pst = con.prepareCall(procedure);
  
        // set parameters
        pst.setInt(1, id_usuario);
        pst.execute();
  
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
}