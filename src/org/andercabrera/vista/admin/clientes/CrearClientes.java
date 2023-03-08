package org.andercabrera.vista.admin.clientes;

import javax.swing.JOptionPane;

import org.andercabrera.controlador.*;
import org.andercabrera.modelo.clientes;
import org.andercabrera.vista.admin.*;

import java.awt.*;

public class CrearClientes extends javax.swing.JPanel {
    private static clientes modeloCliente = clientes.getInstance();
    private static clients controlador = clients.getInstance();

    public CrearClientes() {
        initComponents();
    }

    private void initComponents() {

        body1 = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

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
        Text4.setText("Nombre");
        body1.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setToolTipText("Ingrese la marca del tren");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        body1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Apellido");
        body1.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        apellido.setBackground(new java.awt.Color(255, 255, 255));
        apellido.setForeground(new java.awt.Color(0, 0, 0));
        apellido.setToolTipText("Ingrese el modelo del tren");
        apellido.setBorder(null);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
        });
        body1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Telefono");
        body1.add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setForeground(new java.awt.Color(0, 0, 0));
        telefono.setToolTipText("Ingrese la escala del tren");
        telefono.setBorder(null);
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonoMouseClicked(evt);
            }
        });
        body1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Email");
        body1.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 20));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setToolTipText("Ingrese el precio del tren");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        body1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 260, 30));

        jSeparator12.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator12.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 260, 10));

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
        Text7.setText("Direccion");
        body1.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        direccion.setBackground(new java.awt.Color(255, 255, 255));
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setToolTipText("Ingrese el modelo del tren");
        direccion.setBorder(null);
        direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionMouseClicked(evt);
            }
        });
        body1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        body1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 260, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {
        nombre.setText("");
        this.nombre.setForeground(Color.BLACK);
    }

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {
        apellido.setText("");
        apellido.setForeground(Color.BLACK);
    }

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {
        telefono.setText("");
        telefono.setForeground(Color.BLACK);
    }

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {
        email.setText("");
        email.setForeground(Color.BLACK);
    }

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {
        String nombre = this.nombre.getText();
        String apellido = this.apellido.getText();
        String direccion = this.direccion.getText();
        String telefono = this.telefono.getText();
        String email = this.email.getText();

        if (nombre.equals("") || apellido.equals("") || direccion.equals("") || telefono.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            clientes cliente = new clientes(nombre, apellido, direccion, telefono, email);
            controlador.insertClients(cliente, "call agregar_cliente(?,?,?,?,?)");
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente :)");

            this.nombre.setText("");
            this.apellido.setText("");
            this.direccion.setText("");
            this.telefono.setText("");
            this.email.setText("");
        }
    }

    private void direccionMouseClicked(java.awt.event.MouseEvent evt) {
    }

    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title1;
    public javax.swing.JTextField apellido;
    private javax.swing.JPanel body1;
    private javax.swing.JPanel button;
    public javax.swing.JTextField direccion;
    public javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField telefono;
}
