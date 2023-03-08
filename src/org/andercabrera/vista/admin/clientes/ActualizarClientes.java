package org.andercabrera.vista.admin.clientes;

import org.andercabrera.controlador.*;
import org.andercabrera.modelo.*;

import javax.swing.JOptionPane;

public class ActualizarClientes extends javax.swing.JPanel {
    private clientes modeloCliente = new clientes().getInstance();
    private clients controlador = new clients().getInstance();

    public ActualizarClientes() {
        initComponents();
    }

    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Text3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        button = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 51));
        Title.setText("Actualizar cliente");
        body.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 10, 120));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        body.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setToolTipText("Ingrese la marca del tren");
        txtNombre.setBorder(null);
        body.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        Text6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text6.setText("Apellido");
        body.add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setToolTipText("Ingrese el modelo del tren");
        txtApellido.setBorder(null);
        body.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 260, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Telefono");
        body.add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setToolTipText("Ingrese la escala del tren");
        txtTelefono.setBorder(null);
        body.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 260, 10));

        Text11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text11.setText("Email");
        body.add(Text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, 20));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setToolTipText("Ingrese el precio del tren");
        txtEmail.setBorder(null);
        body.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 260, 30));

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

        Text7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text7.setText("Direccion");
        body.add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setToolTipText("Ingrese el modelo del tren");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDireccionMouseClicked(evt);
            }
        });
        body.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 260, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        body.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 260, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_buttonMouseClicked
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String direccion = txtDireccion.getText();

        clientes cliente = new clientes(nombre, apellido, direccion, telefono, email);

        try {
            if (nombre.equals("") || apellido.equals("") || telefono.equals("") || email.equals("")
                    || direccion.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan Campos por llenar");
            } else {
                JOptionPane.showMessageDialog(null, "Actualizado con éxito");
                controlador.updateClients(modeloCliente.getId_cliente(), cliente,
                        "call actualizar_cliente(?,?,?,?,?,?)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
            JOptionPane.showMessageDialog(null, "Puede ser que número de teléfono sea demasiado largo");
        }
    }// GEN-LAST:event_buttonMouseClicked

    private void txtDireccionMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtDireccionMouseClicked
    }// GEN-LAST:event_txtDireccionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JPanel button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtDireccion;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
