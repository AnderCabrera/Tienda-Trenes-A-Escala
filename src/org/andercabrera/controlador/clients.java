package org.andercabrera.controlador;

import org.andercabrera.modelo.clientes;

import java.sql.*;

public class clients {
  connection conexion = new connection().getInstance();

  // constructor
  public clients() {
  }

  // singleton
  private static clients instance = null;

  public static clients getInstance() {
    if (instance == null) {
      instance = new clients();
    }
    return instance;
  }

  public void insertClients(clientes client, String procedure) {
    try {
      Connection con = conexion.getConnection();
      PreparedStatement ps = con.prepareStatement(procedure);

      ps.setString(1, client.getNombre());
      ps.setString(2, client.getApellido());
      ps.setString(3, client.getDireccion());
      ps.setString(4, client.getTelefono());
      ps.setString(5, client.getEmail());

      ps.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Error al insertar cliente: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void updateClients(int id_cliente, clientes clientToUpdate, String procedure) {
    try {

      // connection
      Connection con = conexion.getConnection();
      PreparedStatement pst = con.prepareCall(procedure);

      // set parameters
      pst.setInt(1, id_cliente);
      pst.setString(2, clientToUpdate.getNombre());
      pst.setString(3, clientToUpdate.getApellido());
      pst.setString(4, clientToUpdate.getDireccion());
      pst.setString(5, clientToUpdate.getTelefono());
      pst.setString(6, clientToUpdate.getEmail());
      pst.execute();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void deleteClient(int id_cliente, String procedure) {
    try {

      // connection
      Connection con = conexion.getConnection();
      PreparedStatement pst = con.prepareCall(procedure);

      // set parameters
      pst.setInt(1, id_cliente);
      pst.execute();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
  
}