package org.andercabrera.vista.admin.usuarios;

import org.andercabrera.modelo.usuarios;
import org.andercabrera.controlador.*;
import org.andercabrera.vista.admin.*;
import org.andercabrera.vista.admin.Menu;
import org.andercabrera.vista.admin.usuarios.CrearUsuarios;

import java.awt.*;

import javax.swing.JOptionPane;

public class CrearUsuarios extends javax.swing.JPanel {
    private users controlador = new users().getInstance();
    private usuarios usuario = new usuarios().getInstance();

    public CrearUsuarios() {
        initComponents();
    }

    private void initComponents() {

        body1 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        Text11 = new javax.swing.JLabel();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtAdmin = new javax.swing.JComboBox<>();
        txtEstadoActivo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        body1.setBackground(new java.awt.Color(255, 255, 255));
        body1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(51, 51, 51));
        Title1.setText("Nuevo cliente");
        body1.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 10, 190));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Id_cliente");
        body1.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCliente.setToolTipText("Ingrese la marca del tren");
        txtCliente.setBorder(null);
        txtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtClienteMouseClicked(evt);
            }
        });
        body1.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Usuario");
        body1.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setToolTipText("Ingrese el modelo del tren");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        body1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Estado activo");
        body1.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Administrador");
        body1.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 20));

        button.setBackground(new java.awt.Color(130, 210, 68));
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
        jLabel1.setText("Crear");
        button.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 30));

        body1.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 260, 50));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Contraseña");
        body1.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena.setToolTipText("Ingrese el modelo del tren");
        txtContrasena.setBorder(null);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        body1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 260, 10));

        txtAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FALSE", "TRUE" }));
        body1.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 110, -1));

        txtEstadoActivo.setBackground(new java.awt.Color(255, 255, 255));
        txtEstadoActivo.setForeground(new java.awt.Color(0, 0, 0));
        txtEstadoActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRUE", "FALSE" }));
        body1.add(txtEstadoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void txtClienteMouseClicked(java.awt.event.MouseEvent evt) {
        txtCliente.setText("");
        this.txtCliente.setForeground(Color.BLACK);
    }

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {
        txtUsuario.setText("");
        txtUsuario.setForeground(Color.BLACK);
    }

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {
        int id = Integer.parseInt(txtCliente.getText());
        String nombre = txtCliente.getText();
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        boolean estadoActivo = Boolean.parseBoolean(txtEstadoActivo.getSelectedItem().toString());
        boolean admin = Boolean.parseBoolean(txtAdmin.getSelectedItem().toString());

        if (nombre.equals("") || usuario.equals("") || contrasena.equals("") || txtCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            usuarios user = new usuarios(id, usuario, contrasena, estadoActivo, admin);
            controlador.insertUser(user, "call agregar_usuario(?,?,?,?,?)");
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente :)");

            txtCliente.setText("");
            txtCliente.setText("");
            txtUsuario.setText("");
            txtContrasena.setText("");
        }
    }

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {
    }

    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> txtAdmin;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtContrasena;
    private javax.swing.JComboBox<String> txtEstadoActivo;
    public javax.swing.JTextField txtUsuario;
}
