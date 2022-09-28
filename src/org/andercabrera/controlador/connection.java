/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.andercabrera.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deran
 */
public class connection {

    private static connection instance;
    private Connection conexion;

    // MySQL data
    private String url = "jdbc:mysql://localhost:3306/tienda_linea?TimeZone=UTC&useSSL=false";
    private String user = "root";
    private String password = "mysql.com";

    // constructor
    public connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {

        }
    }

    // Singleton
    public static connection getInstance() {
        if (instance == null) {
            instance = new connection();
        }
        return instance;
    }

    // Getters
    public Connection getConnection() {
        return conexion;
    }

    // Setters
    public void setConnection(Connection connection) {
        this.conexion = connection;
    }
}
