package org.andercabrera.vista.admin.productos;

import org.andercabrera.controlador.*;
import org.andercabrera.modelo.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ActualizarProducto extends javax.swing.JPanel {

    private static products controladorProducts = new products().getInstance();
    private static productos modeloProducto = new productos().getInstance();

    public ActualizarProducto() {
        initComponents();
    }

    //singleton
    private static ActualizarProducto instance = null;

    public static ActualizarProducto getInstance() {
        if (instance == null) {
            instance = new ActualizarProducto();
        }
        return instance;
    }
    
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        escala = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 51));
        Title.setText("Actualizar producto");
        body.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 10, 120));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Marca");
        body.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setForeground(new java.awt.Color(0, 0, 0));
        marca.setToolTipText("Ingrese la marca del tren");
        marca.setBorder(null);
        body.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Modelo");
        body.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        modelo.setBackground(new java.awt.Color(255, 255, 255));
        modelo.setForeground(new java.awt.Color(0, 0, 0));
        modelo.setToolTipText("Ingrese el modelo del tren");
        modelo.setBorder(null);
        body.add(modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Escala");
        body.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        escala.setBackground(new java.awt.Color(255, 255, 255));
        escala.setForeground(new java.awt.Color(0, 0, 0));
        escala.setToolTipText("Ingrese la escala del tren");
        escala.setBorder(null);
        body.add(escala, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Precio");
        body.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 20));

        precio.setBackground(new java.awt.Color(255, 255, 255));
        precio.setForeground(new java.awt.Color(0, 0, 0));
        precio.setToolTipText("Ingrese el precio del tren");
        precio.setBorder(null);
        body.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 260, 30));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 260, 10));

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });
        button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        body.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 260, 50));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 650));
    }

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {
        String marca = this.marca.getText();
        String modelo = this.modelo.getText();
        String escala = this.escala.getText();
        int precio = Integer.parseInt(this.precio.getText());

        productos productoActualizado = new productos(marca, modelo, escala, precio);

        if (marca.equals("") || modelo.equals("") || escala.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Campos por llenar");
        } else if (precio == 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número >:(");
        } else {
            JOptionPane.showMessageDialog(null, "Actualizado con éxito");
            controladorProducts.updateProducts(modeloProducto.getId_producto(), productoActualizado);
        }
    }

    // SUBIR
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }

    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    public javax.swing.JTextField escala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JTextField marca;
    public javax.swing.JTextField modelo;
    public javax.swing.JTextField precio;
}
