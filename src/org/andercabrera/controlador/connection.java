package org.andercabrera.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connection {

    private static connection instance;
    private Connection conexion;

    // MySQL data
    private String url = "jdbc:mysql://btd9evgvr1nucv1qrwdm-mysql.services.clever-cloud.com/btd9evgvr1nucv1qrwdm";
    private String user = "ueibrsfshxeiofkx";
    private String password = "SQlxgJNPEizGDSjLxmNw";

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
