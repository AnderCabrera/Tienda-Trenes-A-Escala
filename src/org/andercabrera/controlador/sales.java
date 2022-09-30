/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.andercabrera.modelo.usuarios;

/**
 *
 * @author informatica
 */
public class sales {
  connection conexion = new connection().getInstance();

  // constructor
  public sales() {
  }

  // singleton
  private static sales instance = null;

  public static sales getInstance() {
    if (instance == null) {
      instance = new sales();
    }
    return instance;
  }

  public void deleteSale(int id_usuario, String procedure) {
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
