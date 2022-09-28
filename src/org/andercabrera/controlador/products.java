/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import org.andercabrera.modelo.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Deran
 */
public class products {

  connection conexion = new connection().getInstance();

  // constructor
  public products() {
  }

  // singleton
  private static products instance = null;

  public static products getInstance() {
    if (instance == null) {
      instance = new products();
    }
    return instance;
  }

  public void insertProducts(productos product) {
    try {
      Connection con = conexion.getConnection();
      PreparedStatement ps = con.prepareStatement("call agregar_producto(?,?,?,?)");
      ps.setString(1, product.getMarca());
      ps.setString(2, product.getModelo());
      ps.setString(3, product.getEscala());
      ps.setInt(4, product.getPrecio());
      ps.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Error al insertar producto: " + e.getMessage());
      e.printStackTrace();
    }
  }

  public void updateProducts(int id_producto, productos productToUpdate) {
    try {

      // connection
      Connection con = conexion.getConnection();
      PreparedStatement pst = con.prepareCall("call actualizar_producto(?,?,?,?,?)");

      // set parameters
      pst.setInt(1, id_producto);
      pst.setString(2, productToUpdate.getMarca());
      pst.setString(3, productToUpdate.getModelo());
      pst.setString(4, productToUpdate.getEscala());
      pst.setInt(5, productToUpdate.getPrecio());
      pst.execute();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public void deleteProducts(int id_producto) {
    try {

      // connection
      Connection con = conexion.getConnection();
      PreparedStatement pst = con.prepareCall("call eliminar_producto(?)");

      // set parameters
      pst.setInt(1, id_producto);
      pst.execute();

    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
