package org.andercabrera.controlador;

import org.andercabrera.modelo.ventas;

import java.sql.*;

public class salesUser {
  private connection conexion = connection.getInstance();

  // constructor
  public salesUser() {
  }

  // singleton
  private static salesUser instance = null;

  public static salesUser getInstance() {
    if (instance == null) {
      instance = new salesUser();
    }
    return instance;
  }

  public void insertSale(ventas venta) {
    try {
      Connection con = conexion.getConnection();
      PreparedStatement ps = con.prepareStatement("call agregar_venta(?, ?, ?, ?, ?)");
      ps.setInt(1, venta.getId_cliente());
      ps.setInt(2, venta.getId_producto());
      ps.setInt(3, venta.getCantidad());
      ps.setInt(4, venta.getTotal());
      ps.setString(5, venta.getFecha_compra());

      ps.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Error al insertar registro_venta: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
