package org.andercabrera.controlador;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class showDataTable {
    
    // constructor
    public showDataTable() {
    }
    
    connection conexion = new connection().getInstance();
    
    // singleton
    private static showDataTable instance = null;

    public static showDataTable getInstance() {
        if (instance == null) {
            instance = new showDataTable();
        }
        return instance;
    }

    public void showDataTable(JTable table, String procedure) {
        try {
            // table
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            // connection
            Connection con = conexion.getConnection();
            PreparedStatement pst = con.prepareCall(procedure);
            ResultSet rs = pst.executeQuery();

            // insertion of data
            while (rs.next()) {
                Object[] row = new Object[rs.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
