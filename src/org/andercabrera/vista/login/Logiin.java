package org.andercabrera.vista.login;

import javax.swing.JOptionPane;

import org.andercabrera.controlador.*;
import org.andercabrera.modelo.*;
import org.andercabrera.vista.*;
import org.andercabrera.vista.admin.Menu;
import org.andercabrera.vista.client.ComprarUser;
import org.andercabrera.vista.client.MenuUser;

import java.sql.*;

public class Logiin extends javax.swing.JFrame {

    usuarios usuario = new usuarios().getInstance();
    connection conexion = connection.getInstance();
    clientes modeloClientes = clientes.getInstance();
    controladorLogin loginControlador = controladorLogin.getInstance();
    private static ComprarUser userCompras = ComprarUser.getInstance();
    private static MenuUser menuUsuario = new MenuUser();
    private static Menu menuAdmin = new Menu();

    public int id_cliente = 0;

    public Logiin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // singleton
    private static Logiin instance = null;

    public static Logiin getInstance() {
        if (instance == null) {
            instance = new Logiin();
        }
        return instance;
    }

    private void initComponents() {

        bg = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        userTitle = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        passwordTitle = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        passwordSeparator = new javax.swing.JSeparator();
        enterButton = new javax.swing.JPanel();
        enterText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanel.setBackground(new java.awt.Color(51, 51, 51));
        rightPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TRAINS");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        bg.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 630));

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("INICIAR SESIÓN");
        bg.add(loginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 50));

        userTitle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTitle.setForeground(new java.awt.Color(0, 0, 0));
        userTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userTitle.setText("USUARIO");
        bg.add(userTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        userTextField.setBackground(new java.awt.Color(255, 255, 255));
        userTextField.setToolTipText("Ingrese su nombre de usuario");
        userTextField.setBorder(null);
        bg.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 350, -1));
        bg.add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 350, -1));

        passwordTitle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        passwordTitle.setForeground(new java.awt.Color(0, 0, 0));
        passwordTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordTitle.setText("CONTRASEÑA");
        bg.add(passwordTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        passwordTextField.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextField.setBorder(null);
        bg.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 350, -1));
        bg.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 350, -1));

        enterButton.setBackground(new java.awt.Color(51, 51, 51));
        enterButton.setToolTipText("");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        enterText.setBackground(new java.awt.Color(51, 51, 51));
        enterText.setFont(new java.awt.Font("Roboto Bk", 0, 12)); // NOI18N
        enterText.setForeground(new java.awt.Color(255, 255, 255));
        enterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterText.setText("ENTRAR");
        enterText.setToolTipText("");
        enterText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout enterButtonLayout = new javax.swing.GroupLayout(enterButton);
        enterButton.setLayout(enterButtonLayout);
        enterButtonLayout.setHorizontalGroup(
            enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        enterButtonLayout.setVerticalGroup(
            enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(enterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    public int getIdCliente() {
        return id_cliente;
    }

    private void enterTextMouseClicked(java.awt.event.MouseEvent evt) {
        String user = userTextField.getText().toString();
        String password = passwordTextField.getText().toString();

        if (loginControlador.login(user, password)) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + user);

            try {
                Connection con = conexion.getConnection();
                PreparedStatement ps = con.prepareStatement("SELECT id_cliente FROM tbl_usuarios WHERE usuario = ?");
                ps.setString(1, user);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    id_cliente = rs.getInt("id_cliente");
                }
            } catch (SQLException e) {
                System.out.println("Error al obtener id_cliente: " + e.getMessage());
                e.printStackTrace();
            }

            userCompras.id_cliente = id_cliente;        

            userTextField.setText("");
            passwordTextField.setText("");            

            this.dispose();
            menuUsuario.setVisible(true);
            
        } else if(user.equals("admin") && password.equals("admin")) {
            this.dispose();
            menuAdmin.setVisible(true);

            userTextField.setText("");
            passwordTextField.setText(""); 
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }

    private void createAccountMousePressed(java.awt.event.MouseEvent evt) {
    }

    private void createAccountMouseReleased(java.awt.event.MouseEvent evt) {
    }

    private javax.swing.JPanel bg;
    private javax.swing.JPanel enterButton;
    private javax.swing.JLabel enterText;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSeparator userSeparator;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel userTitle;
}
