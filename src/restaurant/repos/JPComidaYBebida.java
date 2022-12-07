/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package restaurant.repos;
import SQLConexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPComidaYBebida extends javax.swing.JPanel {
    //Conexion con mysql
    Conexion C = new Conexion();
    Connection con = C.conexion();
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    ResultSet RS;
    Statement ST;
    //Modelos para las tablas
    DefaultTableModel modelo_comida;
    DefaultTableModel modelo_bebida;

    public JPComidaYBebida() {
        initComponents();
        MD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Comida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Descripcion_Comida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Precio_Comida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_comida = new javax.swing.JTable();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ID_C = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Precio_Bebida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nombre_Bebida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Descripcion_Bebida = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_bebida = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarB = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnAgregarB = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnModificarB = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnClearB = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnEliminarB = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ID_B = new javax.swing.JLabel();

        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        Nombre_Comida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");

        Descripcion_Comida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Precio:");

        Precio_Comida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Tabla_comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla_comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_comidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_comida);

        btnBuscar.setBackground(new java.awt.Color(18, 90, 173));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        btnAgregar.setBackground(new java.awt.Color(18, 90, 173));
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificar.setBackground(new java.awt.Color(18, 90, 173));
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MODIFICAR");

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClear.setBackground(new java.awt.Color(18, 90, 173));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setPreferredSize(new java.awt.Dimension(111, 29));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LIMPIAR");

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel12)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar.setBackground(new java.awt.Color(18, 90, 173));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        ID_C.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descripcion_Comida)
                    .addComponent(Nombre_Comida))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Precio_Comida, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(ID_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Descripcion_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMIDAS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Precio_Bebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(Precio_Bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 240, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Nombre_Bebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(Nombre_Bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 6, 250, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("Descripción:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        Descripcion_Bebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(Descripcion_Bebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 41, 250, -1));

        Tabla_bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla_bebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_bebidaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_bebida);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 386));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("Precio:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        btnBuscarB.setBackground(new java.awt.Color(18, 90, 173));
        btnBuscarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarB.setPreferredSize(new java.awt.Dimension(111, 29));
        btnBuscarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarBMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarBLayout = new javax.swing.GroupLayout(btnBuscarB);
        btnBuscarB.setLayout(btnBuscarBLayout);
        btnBuscarBLayout.setHorizontalGroup(
            btnBuscarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarBLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnBuscarBLayout.setVerticalGroup(
            btnBuscarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnBuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnAgregarB.setBackground(new java.awt.Color(18, 90, 173));
        btnAgregarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarB.setPreferredSize(new java.awt.Dimension(111, 29));
        btnAgregarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarBMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarBLayout = new javax.swing.GroupLayout(btnAgregarB);
        btnAgregarB.setLayout(btnAgregarBLayout);
        btnAgregarBLayout.setHorizontalGroup(
            btnAgregarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAgregarBLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(22, 22, 22))
        );
        btnAgregarBLayout.setVerticalGroup(
            btnAgregarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnAgregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        btnModificarB.setBackground(new java.awt.Color(18, 90, 173));
        btnModificarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarB.setPreferredSize(new java.awt.Dimension(111, 29));
        btnModificarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarBMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MODIFICAR");

        javax.swing.GroupLayout btnModificarBLayout = new javax.swing.GroupLayout(btnModificarB);
        btnModificarB.setLayout(btnModificarBLayout);
        btnModificarBLayout.setHorizontalGroup(
            btnModificarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarBLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18))
        );
        btnModificarBLayout.setVerticalGroup(
            btnModificarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModificarBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel2.add(btnModificarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnClearB.setBackground(new java.awt.Color(18, 90, 173));
        btnClearB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearB.setPreferredSize(new java.awt.Dimension(111, 29));
        btnClearB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearBMouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LIMPIAR");

        javax.swing.GroupLayout btnClearBLayout = new javax.swing.GroupLayout(btnClearB);
        btnClearB.setLayout(btnClearBLayout);
        btnClearBLayout.setHorizontalGroup(
            btnClearBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearBLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnClearBLayout.setVerticalGroup(
            btnClearBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnClearB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        btnEliminarB.setBackground(new java.awt.Color(18, 90, 173));
        btnEliminarB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarB.setPreferredSize(new java.awt.Dimension(111, 29));
        btnEliminarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarBMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarBLayout = new javax.swing.GroupLayout(btnEliminarB);
        btnEliminarB.setLayout(btnEliminarBLayout);
        btnEliminarBLayout.setHorizontalGroup(
            btnEliminarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarBLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel18)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnEliminarBLayout.setVerticalGroup(
            btnEliminarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        jPanel2.add(btnEliminarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        ID_B.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jPanel2.add(ID_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 240, 20));

        jTabbedPane1.addTab("BEBIDAS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_comidaMouseClicked
        //Cuando se selecciona un registro de la tabla
        //Obtiene la fila seleccionada en la tabla
        int F = Tabla_comida.getSelectedRow();
        if(F == -1){//Si no se selecciono ninguna fila
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_C2 = Integer.parseInt((String)Tabla_comida.getValueAt(F, 0));//ID
            String NC = (String)Tabla_comida.getValueAt(F, 1);//Nombre
            String DC = (String)Tabla_comida.getValueAt(F, 3);//Descripcion
            String PC = (String)Tabla_comida.getValueAt(F, 2);//Precio
            ID_C.setText(""+ID_C2);
            Nombre_Comida.setText(NC);
            Descripcion_Comida.setText(DC);
            Precio_Comida.setText(PC);
        }
    }//GEN-LAST:event_Tabla_comidaMouseClicked

    private void Tabla_bebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_bebidaMouseClicked
        //Cuando se selecciona un registro de la tabla
        //Obtiene la fila seleccionada en la tabla
        int F = Tabla_bebida.getSelectedRow();
        if(F == -1){//Si no se selecciono ninguna fila
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_B2 = Integer.parseInt((String)Tabla_bebida.getValueAt(F, 0));//ID
            String NB = (String)Tabla_bebida.getValueAt(F, 1);//Nombre
            String DB = (String)Tabla_bebida.getValueAt(F, 3);//Descripcion
            String PB = (String)Tabla_bebida.getValueAt(F, 2);//Precio
            ID_B.setText(""+ID_B2);
            Nombre_Bebida.setText(NB);
            Descripcion_Bebida.setText(DB);
            Precio_Bebida.setText(PB);
        }
    }//GEN-LAST:event_Tabla_bebidaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Boton buscar de la tabla comida
        String nc = Nombre_Comida.getText();
        if("".equals(nc)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        else{
            buscarcomida(nc);
            /*try {
                pst = con.prepareStatement("SELECT * FROM comida WHERE Nombre = ?");
                pst.setString(1,Nombre_Comida.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    ID_C.setText(rs.getString("ID"));
                    Nombre_Comida.setText(rs.getString("Nombre"));
                    Precio_Comida.setText(rs.getString("Precio"));
                    Descripcion_Comida.setText(rs.getString("Descripcion"));
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un producto con ese nombre");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        //boton agregar de la tabla comida
        String nc = Nombre_Comida.getText();
        String pc = Precio_Comida.getText();
        String dc = Descripcion_Comida.getText();
        String idc = ID_C.getText();
        if("".equals(idc)){
        if("".equals(nc)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        if("".equals(pc)){
            JOptionPane.showMessageDialog(null, "El campo de precio esta vacio");
        }
        if("".equals(dc)){
            JOptionPane.showMessageDialog(null, "La descripcion esta vacia");
        }
        if("".equals(dc) || "".equals(pc) || "".equals(nc)){
        }
        else{
            try{
                String SQL = "INSERT INTO comida(`Nombre`, `Precio`, `Descripcion`) values(?,?,?);";
                pst = con.prepareStatement(SQL);
                //Registra los datos directamente en la tabla de mysql
                pst.setString(1, Nombre_Comida.getText());
                pst.setString(2, Precio_Comida.getText());
                pst.setString(3, Descripcion_Comida.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro excitoso");
                Vacio();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de Registro, el campo de precio solo puede llevar numeros");
            }
            MD();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "No puede agregar un registro con el mismo identificador, favor de limpiar y añadir un registro manualmente");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        //boton modificar de comida
        String idc = ID_C.getText();
        String nc = Nombre_Comida.getText();
        String pc = Precio_Comida.getText();
        String dc = Descripcion_Comida.getText();
        if("".equals(nc)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        if("".equals(pc)){
            JOptionPane.showMessageDialog(null, "El campo de precio esta vacio");
        }
        if("".equals(dc)){
            JOptionPane.showMessageDialog(null, "La descripcion esta vacia");
        }
        else{
        if("".equals(idc)){
            JOptionPane.showMessageDialog(null, "Ningun registro seleccionado");
        }
        if("".equals(idc) || "".equals(dc) || "".equals(pc) || "".equals(nc)){
        }
        else{
            try{
                String SQL = "update comida set Nombre=?, Precio=?, Descripcion=? where ID=?";
                pst = con.prepareStatement(SQL);
                pst.setString(1, Nombre_Comida.getText());
                pst.setString(2, Precio_Comida.getText());
                pst.setString(3, Descripcion_Comida.getText());
                pst.setInt(4, Integer.parseInt(ID_C.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación excitosa");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar, el campo de precio solo puede tener numeros");
            }
            MD();
            Vacio();
        }
    }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
       Vacio();
        MD();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //Elimina un registro segun su ID
        String idc = ID_C.getText();
        if("".equals(idc)){
            JOptionPane.showMessageDialog(null, "No a selecciono ningun registro");
        }
        else{
            try{
                pst = con.prepareStatement("DELETE FROM comida WHERE ID=?");
                pst.setInt(1, Integer.parseInt(ID_C.getText()));
                int n = pst.executeUpdate();
                if (n >= 0){
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar, registro no encontrado");
            }
            MD();
            Vacio();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        setColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        setColor(btnAgregar);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        setColor(btnModificar);
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        setColor(btnClear);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
       setColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        resetColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        resetColor(btnAgregar);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        resetColor(btnModificar);
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        resetColor(btnClear);
    }//GEN-LAST:event_btnClearMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnBuscarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBMouseClicked
        String nb = Nombre_Bebida.getText();
        if("".equals(nb)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        else{
            buscarbebida(nb);
            /*try {
                pst = con.prepareStatement("SELECT * FROM bebidas WHERE Nombre = ?");
                pst.setString(1,Nombre_Bebida.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    ID_B.setText(rs.getString("ID"));
                    Nombre_Bebida.setText(rs.getString("Nombre"));
                    Precio_Bebida.setText(rs.getString("Precio"));
                    Descripcion_Bebida.setText(rs.getString("Descripcion"));
                }else{
                    JOptionPane.showMessageDialog(null, "No existe un producto con ese nombre");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }//GEN-LAST:event_btnBuscarBMouseClicked

    private void btnAgregarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarBMouseClicked
        String nc = Nombre_Bebida.getText();
        String pc = Precio_Bebida.getText();
        String dc = Descripcion_Bebida.getText();
        String idc = ID_B.getText();
        if("".equals(idc)){
        if("".equals(nc)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        if("".equals(pc)){
            JOptionPane.showMessageDialog(null, "El campo de precio esta vacio");
        }
        if("".equals(dc)){
            JOptionPane.showMessageDialog(null, "La descripcion esta vacia");
        }
        if("".equals(dc) || "".equals(pc) || "".equals(nc)){
        }
        else{
            try{
                String SQL = "INSERT INTO bebidas(`Nombre`, `Precio`, `Descripcion`) values(?,?,?);";
                pst = con.prepareStatement(SQL);
                //Registra los datos directamente en la tabla de mysql
                pst.setString(1, Nombre_Bebida.getText());
                pst.setString(2, Precio_Bebida.getText());
                pst.setString(3, Descripcion_Bebida.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro excitoso");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de Registro, el campo de precio solo puede llevar numeros");
            }
            MD();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "No puede agregar un registro con el mismo identificador, favor de limpiar y añadir un registro manualmente");
        }
    }//GEN-LAST:event_btnAgregarBMouseClicked

    private void btnModificarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarBMouseClicked
        String idc = ID_B.getText();
        String nc = Nombre_Bebida.getText();
        String pc = Precio_Bebida.getText();
        String dc = Descripcion_Bebida.getText();
        if("".equals(nc)){
            JOptionPane.showMessageDialog(null, "El campo del nombre esta vacio");
        }
        if("".equals(pc)){
            JOptionPane.showMessageDialog(null, "El campo de precio esta vacio");
        }
        if("".equals(dc)){
            JOptionPane.showMessageDialog(null, "La descripcion esta vacia");
        }
        if("".equals(idc) || "".equals(dc) || "".equals(pc) || "".equals(nc)){
        }
        else{
        if("".equals(idc)){
            JOptionPane.showMessageDialog(null, "Ningun registro seleccionado");
        }
        else{
            try{
                String SQL = "update bebidas set Nombre=?, Precio=?, Descripcion=? where ID=?";
                pst = con.prepareStatement(SQL);
                pst.setString(1, Nombre_Bebida.getText());
                pst.setString(2, Precio_Bebida.getText());
                pst.setString(3, Descripcion_Bebida.getText());
                pst.setInt(4, Integer.parseInt(ID_B.getText()));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Modificación excitosa");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar, el campo de precio solo puede tener numeros");
            }
            MD();
            Vacio();
        }
    }
    }//GEN-LAST:event_btnModificarBMouseClicked

    private void btnClearBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearBMouseClicked
        Vacio();
        MD();
    }//GEN-LAST:event_btnClearBMouseClicked

    private void btnEliminarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarBMouseClicked
        String idb = ID_B.getText();
        if("".equals(idb)){
            JOptionPane.showMessageDialog(null, "No a selecciono ningun registro");
        }
        else{
            try{//Elimina un registro segun su ID
                pst = con.prepareStatement("DELETE FROM bebidas WHERE ID=?;");
                pst.setInt(1, Integer.parseInt(ID_B.getText()));
                int n = pst.executeUpdate();
                if (n >= 0){
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al eliminar, registro no encontrado");
            }
            MD();
            Vacio();
        }
    }//GEN-LAST:event_btnEliminarBMouseClicked

    private void btnBuscarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBMouseEntered
       setColor(btnBuscarB);
    }//GEN-LAST:event_btnBuscarBMouseEntered

    private void btnAgregarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarBMouseEntered
        setColor(btnAgregarB);
    }//GEN-LAST:event_btnAgregarBMouseEntered

    private void btnModificarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarBMouseEntered
        setColor(btnModificarB);
    }//GEN-LAST:event_btnModificarBMouseEntered

    private void btnClearBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearBMouseEntered
        setColor(btnClearB);
    }//GEN-LAST:event_btnClearBMouseEntered

    private void btnEliminarBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarBMouseEntered
       setColor(btnEliminarB);
    }//GEN-LAST:event_btnEliminarBMouseEntered

    private void btnBuscarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBMouseExited
        resetColor(btnBuscarB);
    }//GEN-LAST:event_btnBuscarBMouseExited

    private void btnAgregarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarBMouseExited
        resetColor(btnAgregarB);
    }//GEN-LAST:event_btnAgregarBMouseExited

    private void btnModificarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarBMouseExited
        resetColor(btnModificarB);
    }//GEN-LAST:event_btnModificarBMouseExited

    private void btnClearBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearBMouseExited
        resetColor(btnClearB);
    }//GEN-LAST:event_btnClearBMouseExited

    private void btnEliminarBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarBMouseExited
        resetColor(btnEliminarB);
    }//GEN-LAST:event_btnEliminarBMouseExited
    
    public void MD(){//Muestra los datos guardados en mysql
        //Nombre de los campos en las tablas
        String[]Campos = {"ID", "Nombre", "Precio", "Descripcion"};
        String[]Registro = new String[4];//Espacio para registrar los campos de la tabla
        String[]Registro2 = new String[4];//Espacio para registrar los campos de la tabla
        modelo_comida = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de comida
        String SQL = "SELECT * FROM comida";//Comando de sql para visualizar todos los regitros de dicha tabla
        modelo_bebida = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de bebidas
        String SQL2 = "SELECT * FROM bebidas";//Comando de sql para visualizar todos los regitros de dicha tabla
        try{
            //Agrega los registros de la tabla comida de sql a la tabla
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            while (rs.next()){
                //Titulos de la base de datos
                Registro[0]= rs.getString("ID");
                Registro[1]= rs.getString("Nombre");
                Registro[2]= rs.getString("Precio");
                Registro[3]= rs.getString("Descripcion");
                modelo_comida.addRow(Registro);
            }
            //Agrega los registros de la tabla bebidas de sql a la tabla
            ST = con.createStatement();
            RS = ST.executeQuery(SQL2);
            while (RS.next()){
                //Titulos de la base de datos
                Registro2[0]= RS.getString("ID");
                Registro2[1]= RS.getString("Nombre");
                Registro2[2]= RS.getString("Precio");
                Registro2[3]= RS.getString("Descripcion");
                modelo_bebida.addRow(Registro2);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla_comida.setModel(modelo_comida);
        Tabla_bebida.setModel(modelo_bebida);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos");
        }
    }
    
    public void Vacio(){
        ID_C.setText(null);
        Nombre_Comida.setText(null);
        Descripcion_Comida.setText(null);
        Precio_Comida.setText(null);
        ID_B.setText(null);
        Nombre_Bebida.setText(null);
        Descripcion_Bebida.setText(null);
        Precio_Bebida.setText(null);
    }
    
    //Variables que llamamos para dar color a los botones
     void setColor(JPanel panel){
    panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    public void buscarcomida(String busc){
        String[]Campos = {"ID", "Nombre", "Precio", "Descripcion"};
        String[]Registro = new String[4];//Espacio para registrar los campos de la tabla
        modelo_comida = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de comida
        String SQL = "SELECT * FROM comida WHERE Nombre ='"+ busc+"';";//Comando de sql para visualizar todos los regitros de dicha tabla
        try{
            //Agrega los registros de la tabla comida de sql a la tabla
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            while (rs.next()){
                //Titulos de la base de datos
                Registro[0]= rs.getString("ID");
                Registro[1]= rs.getString("Nombre");
                Registro[2]= rs.getString("Precio");
                Registro[3]= rs.getString("Descripcion");
                modelo_comida.addRow(Registro);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla_comida.setModel(modelo_comida);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos, Producto no encontrado");
        }
    }
    
    public void buscarbebida(String busb){
        String[]Campos = {"ID", "Nombre", "Precio", "Descripcion"};
        String[]Registro = new String[4];//Espacio para registrar los campos de la tabla
        modelo_bebida = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de comida
        String SQL = "SELECT * FROM bebidas WHERE Nombre ='"+ busb+"';";//Comando de sql para visualizar todos los regitros de dicha tabla
        try{
            //Agrega los registros de la tabla comida de sql a la tabla
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            while (rs.next()){
                //Titulos de la base de datos
                Registro[0]= rs.getString("ID");
                Registro[1]= rs.getString("Nombre");
                Registro[2]= rs.getString("Precio");
                Registro[3]= rs.getString("Descripcion");
                modelo_bebida.addRow(Registro);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla_bebida.setModel(modelo_bebida);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos, Producto no encontrado");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion_Bebida;
    private javax.swing.JTextField Descripcion_Comida;
    private javax.swing.JLabel ID_B;
    private javax.swing.JLabel ID_C;
    private javax.swing.JTextField Nombre_Bebida;
    private javax.swing.JTextField Nombre_Comida;
    private javax.swing.JTextField Precio_Bebida;
    private javax.swing.JTextField Precio_Comida;
    private javax.swing.JTable Tabla_bebida;
    private javax.swing.JTable Tabla_comida;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JPanel btnAgregarB;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnBuscarB;
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnClearB;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnEliminarB;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JPanel btnModificarB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
