package org.andercabrera.vista.admin;

import org.andercabrera.vista.admin.ventas.Ventas;
import org.andercabrera.vista.admin.usuarios.Usuarios;
import org.andercabrera.vista.admin.clientes.Clientes;
import org.andercabrera.vista.admin.productos.Productos;
import org.andercabrera.vista.admin.principal.Principal;
import org.andercabrera.controlador.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;
import org.andercabrera.vista.login.Logiin;

public class Menu extends javax.swing.JFrame {
    private static Principal principal = new Principal().getInstance();
    private static Productos crear = new Productos().getInstance();
    private static Ventas rentados = new Ventas();
    private static Clientes clientes = new Clientes();
    private static Usuarios usuarios = new Usuarios();
    private Logiin login = new Logiin();

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",   
                "Octubre",
                "Noviembre",
                "Diciembre"
        };
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        
        // Adding panels to the main panel
        addPanel(principal);

        // Changing background colors
        selectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }
    
    //singleton
    private static Menu instance = null;

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        clients_icon = new javax.swing.JLabel();
        btn_crear = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        users_icon2 = new javax.swing.JLabel();
        btn_vehiculos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        users_icon1 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        clients_icon1 = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        users_icon = new javax.swing.JLabel();
        clients_icon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(91, 85, 93));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido admin");
        Header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Fecha aqui");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 30));

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 870, 110));

        Menu.setBackground(new java.awt.Color(103, 71, 71));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(130, 179, 91));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prinMouseClicked(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        clients_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clients_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/home-outline.png"))); // NOI18N
        btn_prin.add(clients_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 50));

        btn_crear.setBackground(new java.awt.Color(130, 148, 96));
        btn_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_crear.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });
        btn_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Productos");
        btn_crear.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        users_icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/train_icon.png"))); // NOI18N
        btn_crear.add(users_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, -1));

        btn_vehiculos.setBackground(new java.awt.Color(130, 148, 96));
        btn_vehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_vehiculos.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_vehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vehiculosMouseClicked(evt);
            }
        });
        btn_vehiculos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ventas");
        btn_vehiculos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        users_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/file-chart.png"))); // NOI18N
        btn_vehiculos.add(users_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_vehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 250, -1));

        btn_clientes.setBackground(new java.awt.Color(130, 148, 96));
        btn_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clientes.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");
        btn_clientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        clients_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clients_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/account-multiple.png"))); // NOI18N
        btn_clientes.add(clients_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 250, -1));

        btn_usuarios.setBackground(new java.awt.Color(130, 148, 96));
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_usuarios.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        btn_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuarios");
        btn_usuarios.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        users_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/miniUserIconModify.png"))); // NOI18N
        btn_usuarios.add(users_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, -1));

        clients_icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clients_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/andercabrera/resources/TrainLogo.png"))); // NOI18N
        Menu.add(clients_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRAINS");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 40));

        jPanel1.setBackground(new java.awt.Color(255, 29, 56));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cerrar sesión");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 250, 50));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 780));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 870, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        login.setVisible(true);
    }

    public void addPanel(JPanel panel) {
        // Panel configuration
        panel.setSize(content.getSize());
        panel.setLocation(0, 0);
        

        // Adding panel to other Panel
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.repaint();
        content.revalidate();
    }

    public void selectedButton(JPanel panel) {
        Color selectedColor = new Color(130,179,91);
        panel.setBackground(selectedColor);
    }

    public void deselectedButton(JPanel panel) {
        Color deselectedColor = new Color(130,148,96);
        panel.setBackground(deselectedColor);
    }

    private void btn_prinMouseClicked(java.awt.event.MouseEvent evt) {
        addPanel(principal);

        // Changing background colors
        selectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {
        addPanel(crear);

        // Changing background colors
        selectedButton(btn_crear);
        deselectedButton(btn_prin);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }

    private void btn_rentarMouseClicked(java.awt.event.MouseEvent evt) {

        // Changing background colors
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }

    private void btn_vehiculosMouseClicked(java.awt.event.MouseEvent evt) {
        addPanel(rentados);

        // Changing background colors
        selectedButton(btn_vehiculos);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_clientes);
        deselectedButton(btn_usuarios);
    }

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {
        addPanel(clientes);

        // Changing background colors
        selectedButton(btn_clientes);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_usuarios);
    }

    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {
        addPanel(usuarios);

        // Changing background colors
        selectedButton(btn_usuarios);
        deselectedButton(btn_prin);
        deselectedButton(btn_crear);
        deselectedButton(btn_vehiculos);
        deselectedButton(btn_clientes);
    }
    
    public JPanel getPanelContent() {
        return content;
    }


    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JPanel btn_crear;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_usuarios;
    private javax.swing.JPanel btn_vehiculos;
    private javax.swing.JLabel clients_icon;
    private javax.swing.JLabel clients_icon1;
    private javax.swing.JLabel clients_icon2;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel users_icon;
    private javax.swing.JLabel users_icon1;
    private javax.swing.JLabel users_icon2;
}
