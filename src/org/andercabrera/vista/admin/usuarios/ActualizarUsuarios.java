package org.andercabrera.vista.admin.usuarios;

import org.andercabrera.modelo.usuarios;
import org.andercabrera.controlador.*;
import org.andercabrera.vista.admin.*;
import org.andercabrera.vista.admin.Menu;
import org.andercabrera.vista.admin.usuarios.CrearUsuarios;

import javax.swing.JOptionPane;
public class ActualizarUsuarios extends javax.swing.JPanel {
    private users controlador = new users().getInstance();
    private usuarios modelo = new usuarios().getInstance();
    
    public ActualizarUsuarios() {
        initComponents();
    }

    private void initComponents() {
        txtContrasena = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        txtId_cliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Text7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Text8 = new javax.swing.JLabel();
        Text12 = new javax.swing.JLabel();
        button1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Text9 = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtEstadoActivo = new javax.swing.JComboBox<>();
        txtAdmin = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(51, 51, 51));
        Title1.setText("Actualizar cliente");
        txtContrasena.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        txtContrasena.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 10, 120));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Id_cliente");
        txtContrasena.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        txtId_cliente.setBackground(new java.awt.Color(255, 255, 255));
        txtId_cliente.setForeground(new java.awt.Color(0, 0, 0));
        txtId_cliente.setToolTipText("Ingrese la marca del tren");
        txtId_cliente.setBorder(null);
        txtContrasena.add(txtId_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        txtContrasena.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Usuario");
        txtContrasena.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setToolTipText("Ingrese el modelo del tren");
        txtUsuario.setBorder(null);
        txtContrasena.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 30));

        jSeparator9.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));
        txtContrasena.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 10));

        Text8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text8.setText("Estado activo");
        txtContrasena.add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        Text12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text12.setText("Administrador");
        txtContrasena.add(Text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 20));

        button1.setBackground(new java.awt.Color(18, 90, 173));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Actualizar");
        button1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        txtContrasena.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 260, 50));

        Text9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text9.setText("Contasena");
        txtContrasena.add(Text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        txtcontrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtcontrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtcontrasena.setToolTipText("Ingrese el modelo del tren");
        txtcontrasena.setBorder(null);
        txtcontrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcontrasenaMouseClicked(evt);
            }
        });
        txtContrasena.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, 30));

        jSeparator11.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator11.setPreferredSize(new java.awt.Dimension(200, 10));
        txtContrasena.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 260, 10));

        txtEstadoActivo.setBackground(new java.awt.Color(255, 255, 255));
        txtEstadoActivo.setForeground(new java.awt.Color(0, 0, 0));
        txtEstadoActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRUE", "FALSE" }));
        txtContrasena.add(txtEstadoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 110, -1));

        txtAdmin.setBackground(new java.awt.Color(255, 255, 255));
        txtAdmin.setForeground(new java.awt.Color(0, 0, 0));
        txtAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FALSE", "TRUE" }));
        txtContrasena.add(txtAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int id_cliente = Integer.parseInt(txtId_cliente.getText());
        String user = txtUsuario.getText();
        String contrasena = txtcontrasena.getText();
        boolean estadoActivo = Boolean.parseBoolean(txtEstadoActivo.getSelectedItem().toString());
        boolean admin = Boolean.parseBoolean(txtAdmin.getSelectedItem().toString());

        if (user.equals("") || contrasena.equals("")) {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        } else {

            usuarios usuario = new usuarios(id_cliente, user, contrasena, estadoActivo, admin);
            controlador.updateUser(modelo.getId_usuario(), usuario, "call actualizar_usuario(? ,? ,? ,? ,? ,?)");
            JOptionPane.showMessageDialog(null, "Modificacion exitosa.");
        }
    }

    private void txtcontrasenaMouseClicked(java.awt.event.MouseEvent evt) {
    }


    private javax.swing.JLabel Text12;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel button1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> txtAdmin;
    private javax.swing.JPanel txtContrasena;
    private javax.swing.JComboBox<String> txtEstadoActivo;
    public static javax.swing.JTextField txtId_cliente;
    public static javax.swing.JTextField txtUsuario;
    public static javax.swing.JTextField txtcontrasena;
}
