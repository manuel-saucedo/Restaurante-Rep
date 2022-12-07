/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package restaurant.repos;
import SQLConexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class JPComanda extends javax.swing.JPanel {
    /*
    ID_O = Campo de texto de ID
    Comida1 = Campo de texto del nombre de la comida
    Bebida1 = Campo de texto del nombre de la bebida
    C_C1 = Campo para la cantidad de la comida
    C_B1 = Campo para la cantidad de la bebida
    Fecha1 = Campo para la fecha
    Hora1 = Campo para la hora
    Cliente1 = Campo para el nombre del cliente
    */
    //Conexion con mysql
    Conexion C = new Conexion();
    Connection con = C.conexion();
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    //Modelo para la tabla
    DefaultTableModel modelo;
    
    public JPComanda() {
        initComponents();
        MD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        comida = new javax.swing.JLabel();
        bebida = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        C_C1 = new javax.swing.JTextField();
        C_B1 = new javax.swing.JTextField();
        Bebida1 = new javax.swing.JTextField();
        Fecha1 = new javax.swing.JTextField();
        Hora1 = new javax.swing.JTextField();
        Cliente1 = new javax.swing.JTextField();
        Comida1 = new javax.swing.JTextField();
        B_sig_O = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ID_O = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("Fecha");

        cantidad.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        cantidad.setText("Cantidad");

        comida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        comida.setText("Comida");

        bebida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bebida.setText("Bebida");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel12.setText("Hora");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel13.setText("Cliente");

        C_C1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N

        C_B1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Bebida1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Fecha1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Hora1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Cliente1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Comida1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        B_sig_O.setBackground(new java.awt.Color(18, 90, 173));
        B_sig_O.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_sig_O.setPreferredSize(new java.awt.Dimension(111, 29));
        B_sig_O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_sig_OMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_sig_OMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_sig_OMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR");

        javax.swing.GroupLayout B_sig_OLayout = new javax.swing.GroupLayout(B_sig_O);
        B_sig_O.setLayout(B_sig_OLayout);
        B_sig_OLayout.setHorizontalGroup(
            B_sig_OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_sig_OLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        B_sig_OLayout.setVerticalGroup(
            B_sig_OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(B_sig_OLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel14.setText("ID");

        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 48)); // NOI18N
        jLabel2.setText("ORDEN");

        btnBuscar.setBackground(new java.awt.Color(18, 90, 173));
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnActualizar.setBackground(new java.awt.Color(18, 90, 173));
        btnActualizar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar.setBackground(new java.awt.Color(18, 90, 173));
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

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnClear.setBackground(new java.awt.Color(18, 90, 173));
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

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LIMPIAR");

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClearLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ID_O.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cantidad)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B_sig_O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(ID_O, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bebida)
                                    .addComponent(comida))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bebida1)
                                    .addComponent(Comida1))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comida)
                            .addComponent(Comida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bebida)
                            .addComponent(C_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(C_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_sig_O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    public boolean Fecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM HH:mm");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    
    private void B_sig_OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_sig_OMouseClicked
        String c = Comida1.getText();
        String cc =  C_C1.getText();
        String b = Bebida1.getText();
        String cb = C_B1.getText();
        String f = Fecha1.getText();
        String h = Hora1.getText();
        String cl = Cliente1.getText();
        if("".equals(c)){
            JOptionPane.showMessageDialog(null, "El campo de la comida esta vacio");
        } else {
            if("".equals(cc)){
                JOptionPane.showMessageDialog(null, "El campo de la cantidad de comida esta vacio");
            }
        }
        if("".equals(b)){
            JOptionPane.showMessageDialog(null, "El campo de la bebida esta vacio");
            } else {
            if("".equals(cb)){
                JOptionPane.showMessageDialog(null, "El campo de la cantidad de bebida esta vacio");
            }
        }
        if("".equals(f)){
            JOptionPane.showMessageDialog(null, "El campo de la fecha esta vacio");
        }
        if("".equals(h)){
            JOptionPane.showMessageDialog(null, "El campo de la hora esta vacio");
        }
        if("".equals(cl)){
            JOptionPane.showMessageDialog(null, "El campo del nombre del cliente esta vacia");
        }
        if("".equals(cl) || "".equals(h) || "".equals(f) || "".equals(cc) || "".equals(cb) || "".equals(c) || "".equals(b)){
        }else{
            String fec = f +" "+ h;
            if(Fecha(fec)){
                JOptionPane.showMessageDialog(null, "Fecha y/o hora invalida");
            }else{
            try{
                String SQL = "INSERT INTO comanda(`Comida`, `Cantidad_Comida`, `Bebida`, `Cantidad_Bebida`, `Fecha`, `Hora`, `Cliente`) values(?,?,?,?,?,?,?);";
                pst = con.prepareStatement(SQL);
                //Registra los datos directamente en la tabla de mysql
                //pst.setString(1, ID_O.getText());
                pst.setString(1, Comida1.getText());
                pst.setString(2, C_C1.getText());
                pst.setString(3, Bebida1.getText());
                pst.setString(4, C_B1.getText());
                pst.setString(5, Fecha1.getText());
                pst.setString(6, Hora1.getText());
                pst.setString(7, Cliente1.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro excitoso");
                MD();
                Vacio();
                /*Comida1.setText(null);
                Bebida1.setText(null);
                C_C1.setText(null);
                C_B1.setText(null);*/
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al registrar, los campos de cantidad solo pueden tener numeros");
            }
            }
        }
    }//GEN-LAST:event_B_sig_OMouseClicked

    private void B_sig_OMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_sig_OMouseEntered
        // TODO add your handling code here:
        setColor(B_sig_O);
    }//GEN-LAST:event_B_sig_OMouseEntered

    private void B_sig_OMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_sig_OMouseExited
        // TODO add your handling code here:
        resetColor(B_sig_O);
    }//GEN-LAST:event_B_sig_OMouseExited

    
    void setColor(JPanel panel){
    panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        //Cuando se selecciona un registro de la tabla
        //Obtiene la fila seleccionada en la tabla
        int F = Tabla.getSelectedRow();
        if(F == -1){//Si no se selecciono ninguna fila
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }
        else{
            int ID = Integer.parseInt((String)Tabla.getValueAt(F, 0));//ID
            String NC = (String)Tabla.getValueAt(F, 1);//Nombre Comida
            String CC = (String)Tabla.getValueAt(F, 2);//Cantidad Comida
            String NB = (String)Tabla.getValueAt(F, 3);//Nombre Bebida
            String CB = (String)Tabla.getValueAt(F, 4);//Cantidad Bebida
            String Fe = (String)Tabla.getValueAt(F, 5);//Fecha
            String Ho = (String)Tabla.getValueAt(F, 6);//Hora
            String Cl = (String)Tabla.getValueAt(F, 7);//Cliente
            ID_O.setText(""+ID);
            Comida1.setText(NC);
            C_C1.setText(CC);
            Bebida1.setText(NB);
            C_B1.setText(CB);
            Fecha1.setText(Fe);
            Hora1.setText(Ho);
            Cliente1.setText(Cl);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String nb = Cliente1.getText();
        if("".equals(nb)){
            JOptionPane.showMessageDialog(null, "El campo del cliente esta vacio");
        }
        else{
            buscar(nb);
        /*try {
            pst = con.prepareStatement("SELECT * FROM comanda WHERE Cliente = ?");
            pst.setString(1, ID_O.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                ID_O.setText(rs.getString("ID"));
                Comida1.setText(rs.getString("Comida"));
                Bebida1.setText(rs.getString("Bebida"));
                C_C1.setText(rs.getString("Cantidad_Comida"));
                C_B1.setText(rs.getString("Cantidad_Bebida"));
                Fecha1.setText(rs.getString("Fecha"));
                Hora1.setText(rs.getString("Hora"));
                Cliente1.setText(rs.getString("Cliente"));
            }else{
                JOptionPane.showMessageDialog(null, "No existe un producto con ese nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        }
        if(Tabla.getRowCount()<=0){
            JOptionPane.showMessageDialog(null, "No hay ningun registro con el cliente a consultar");
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        String idc = ID_O.getText();
        String f = Fecha1.getText();
        String h = Hora1.getText();
        if("".equals(idc)){
            JOptionPane.showMessageDialog(null, "Ningun registro seleccionado");
        }
        else{
            String fec = f +" "+ h;
            if(Fecha(fec)){
                JOptionPane.showMessageDialog(null, "Fecha y/o hora invalida");
            }else{
        try{
            String SQL = "update comanda set Comida=?, Cantidad_Comida=?, Bebida=?, Cantidad_Bebida=?, Fecha=?, Hora=?, Cliente=? where ID=?";
            pst = con.prepareStatement(SQL);
            pst.setString(1, Comida1.getText());
            pst.setString(2, C_C1.getText());
            pst.setString(3, Bebida1.getText());
            pst.setString(4, C_B1.getText());
            pst.setString(5, Fecha1.getText());
            pst.setString(6, Hora1.getText());
            pst.setString(7, Cliente1.getText());
            pst.setInt(8, Integer.parseInt(ID_O.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizacion excitosa");
            MD();
            Vacio();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Actualizacion, los campos de cantidad solo pueden llevar numeros");
        }
        }
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String idc = ID_O.getText();
        if("".equals(idc)){
            JOptionPane.showMessageDialog(null, "El campo del identificador esta vacio o no selecciono ningun registro");
        }
        else{
        try{
            pst = con.prepareStatement("DELETE FROM comanda WHERE ID=?");
            pst.setInt(1, Integer.parseInt(ID_O.getText()));
            int n = pst.executeUpdate();
            if (n >= 0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
            MD();
            Vacio();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error al Eliminar, registro no encontrado");
        }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
         Vacio();
        MD();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
         setColor(btnActualizar);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        setColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        setColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        setColor(btnClear);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        resetColor(btnActualizar);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        resetColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        resetColor(btnClear);
    }//GEN-LAST:event_btnClearMouseExited
    
    public void MD(){//Muestra los datos guardados en mysql
        //Nombre de los campos en la tabla de Comanda
        String[]Campos = {"ID", "Comdia", "Cantidad_Comida", "Bebida", "Cantidad_Bebida", "Fecha", "Hora", "Cliente"};
        String[]Registro = new String[8];//Espacio para registrar los campos de la tabla
        modelo = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de comida
        String SQL = "SELECT * FROM comanda";//Comando de sql para visualizar todos los regitros de dicha tabla
        try{
            //Agrega los registros de la tabla comida de sql a la tabla
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            while (rs.next()){
                //Titulos de la base de datos
                Registro[0]= rs.getString("ID");
                Registro[1]= rs.getString("Comida");
                Registro[2]= rs.getString("Cantidad_Comida");
                Registro[3]= rs.getString("Bebida");
                Registro[4]= rs.getString("Cantidad_Bebida");
                Registro[5]= rs.getString("Fecha");
                Registro[6]= rs.getString("Hora");
                Registro[7]= rs.getString("Cliente");
                modelo.addRow(Registro);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos");
        }
    }
    
    public void buscar(String cli){
        //Nombre de los campos en la tabla de Comanda
        String[]Campos = {"ID", "Comdia", "Cantidad_Comida", "Bebida", "Cantidad_Bebida", "Fecha", "Hora", "Cliente"};
        String[]Registro = new String[8];//Espacio para registrar los campos de la tabla
        modelo = new DefaultTableModel(null,Campos);//Modelo para visualizar la tabla de comida
        String SQL = "SELECT * FROM comanda WHERE Cliente='"+cli+"';";//Comando de sql para visualizar todos los regitros de dicha tabla
        try{
            //Agrega los registros de la tabla comida de sql a la tabla
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            while (rs.next()){
                //Titulos de la base de datos
                Registro[0]= rs.getString("ID");
                Registro[1]= rs.getString("Comida");
                Registro[2]= rs.getString("Cantidad_Comida");
                Registro[3]= rs.getString("Bebida");
                Registro[4]= rs.getString("Cantidad_Bebida");
                Registro[5]= rs.getString("Fecha");
                Registro[6]= rs.getString("Hora");
                Registro[7]= rs.getString("Cliente");
                modelo.addRow(Registro);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos");
        }
    }
    
    public void Vacio(){//Vacia los campos para ingresar datos
        ID_O.setText(null);
        Comida1.setText(null);
        Bebida1.setText(null);
        C_C1.setText(null);
        C_B1.setText(null);
        Fecha1.setText(null);
        Hora1.setText(null);
        Cliente1.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel B_sig_O;
    private javax.swing.JTextField Bebida1;
    private javax.swing.JTextField C_B1;
    private javax.swing.JTextField C_C1;
    private javax.swing.JTextField Cliente1;
    private javax.swing.JTextField Comida1;
    private javax.swing.JTextField Fecha1;
    private javax.swing.JTextField Hora1;
    private javax.swing.JLabel ID_O;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel bebida;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
