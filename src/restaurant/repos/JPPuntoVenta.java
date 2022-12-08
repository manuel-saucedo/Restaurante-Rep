/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package restaurant.repos;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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

public class JPPuntoVenta extends javax.swing.JPanel {
    Conexion C = new Conexion();
    Connection con = C.conexion();
    PreparedStatement pst;
    ResultSet RS2;
    Statement ST2;
    //Modelos para las tablas
    DefaultTableModel modelo_productos;

    public JPPuntoVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pago_con = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        Hora = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnOk = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Cambio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel1.setText("Productos");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Cambio:");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Subtotal:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("IVA:");

        Cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClienteKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel7.setText("Pagó con:");

        Pago_con.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pago_con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pago_conKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel10.setText("Cliente:");

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel11.setText("16%");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel12.setText("Fecha:");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel13.setText("Hora:");

        Fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaKeyTyped(evt);
            }
        });

        Hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Hora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HoraKeyTyped(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(18, 90, 173));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LIMPIAR");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVenta.setBackground(new java.awt.Color(18, 90, 173));
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setPreferredSize(new java.awt.Dimension(111, 29));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentaMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VENTA");

        javax.swing.GroupLayout btnVentaLayout = new javax.swing.GroupLayout(btnVenta);
        btnVenta.setLayout(btnVentaLayout);
        btnVentaLayout.setHorizontalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnVentaLayout.setVerticalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOk.setBackground(new java.awt.Color(18, 90, 173));
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setPreferredSize(new java.awt.Dimension(111, 29));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOkMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("OK");

        javax.swing.GroupLayout btnOkLayout = new javax.swing.GroupLayout(btnOk);
        btnOk.setLayout(btnOkLayout);
        btnOkLayout.setHorizontalGroup(
            btnOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOkLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel14)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        btnOkLayout.setVerticalGroup(
            btnOkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Subtotal.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Subtotal.setText("0");

        Total.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Total.setText("0");

        Cambio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cambio.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Hora)
                            .addComponent(Cliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(Subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pago_con, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(Cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Pago_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cambio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean Fecha(String fecha){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    public boolean Hora(String hora){
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm");
            formatoFecha.setLenient(false);
            formatoFecha.parse(hora);
        } catch (ParseException e) {
            return true;
        }
        return false;
    }
    
    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Muestra todos los datos relacionados con un cliente especifico en la tabla de productos
        String Cl = Cliente.getText();
        String Fe = Fecha.getText();
        String Ho = Hora.getText();
        //Nombre de los campos en la tabla de Comanda
        String[]CamposP = {"Comida", "Cantidad", "Precio", "Bebida", "Cantidad", "Precio"};
        String[]RegistroP = new String[6];//Espacio para registrar los campos de la tabla productos
        modelo_productos = new DefaultTableModel(null,CamposP);//Modelo para visualizar la tabla de productos
        //Comando de sql para visualizar todos los regitros de dicha tabla
        //SELECT `Comida`, `Cantidad_Comida`, comida.Precio, `Bebida`, `Cantidad_Bebida`, bebidas.Precio FROM comanda, comida, bebidas WHERE Cliente='Damian' AND Fecha='22/11' AND Hora='11' AND comida.Nombre=comanda.Comida AND bebidas.Nombre=comanda.Bebida GROUP BY Comida;
        if("".equals(Cl)){
            JOptionPane.showMessageDialog(null, "El campo de cliente esta vacio");
        }
        if("".equals(Fe)){
            JOptionPane.showMessageDialog(null, "El campo de fecha esta vacio");
        }
        if("".equals(Ho)){
            JOptionPane.showMessageDialog(null, "El campo de hora esta vacio");
        }
        else{
            if(Fecha(Fe)){
                JOptionPane.showMessageDialog(null, "Fecha invalida");
            }
            if(Hora(Ho)){
                JOptionPane.showMessageDialog(null, "Hora invalida");
            }
            if(Fecha(Fe)||Hora(Ho)){
            }else{
            String SQL = "SELECT `Comida`, `Cantidad_Comida`, comida.Precio, `Bebida`, `Cantidad_Bebida`, bebidas.Precio FROM comanda, comida, bebidas WHERE Cliente='"
                    +Cl+"' AND Fecha='"+Fe+"' AND Hora='"+Ho
                    +"' AND comida.Nombre=comanda.Comida AND bebidas.Nombre=comanda.Bebida GROUP BY Comida;";
            try{
                //Agrega los registros de un cliente en especifico de la tabla de comanda de sql a la tabla
                ST2 = con.createStatement();
                RS2 = ST2.executeQuery(SQL);
                while (RS2.next()){
                    //Titulos de la base de datos
                    RegistroP[0]= RS2.getString("Comida");
                    RegistroP[1]= RS2.getString("Cantidad_Comida");
                    RegistroP[2]= RS2.getString("Precio");
                    RegistroP[3]= RS2.getString("Bebida");
                    RegistroP[4]= RS2.getString("Cantidad_Bebida");
                    RegistroP[5]= RS2.getString("Precio");
                    modelo_productos.addRow(RegistroP);
                }
            //Coloca el modelos hechos anteriormente a las tablas
            TablaProductos.setModel(modelo_productos);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al Mostrar Datos");
            }
        }
        }
        if(TablaProductos.getRowCount()<=0){
            JOptionPane.showMessageDialog(null, "No hay ningun registro con los datos consultados");
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        Vacio();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        String PC = Pago_con.getText();
        String TT = Total.getText();
        if("".equals(PC)||"".equals(TT)){
            if("".equals(PC)){
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad con la que pagará en el campo: Pagar con");
            }
            if("".equals(TT)){
                JOptionPane.showMessageDialog(null, "Presione primero el boton OK para calcular su cuenta");
            }
        }else{
            //int dpc = Integer.parseInt(PC);
            //int dtt = Integer.parseInt(TT);
            double dpc = Double.parseDouble(PC);
            double dtt = Double.parseDouble(TT);
            double CT = dpc - dtt;//Saca el cambio de con cuanto pago menos el total a pagar
            if(CT < 0){
                JOptionPane.showMessageDialog(null, "Dinero insuficiente");
             }
            else{
                Cambio.setText(""+CT);//Muestra el cambio
            }
        }
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseEntered
        setColor(btnVenta);
    }//GEN-LAST:event_btnVentaMouseEntered

    private void btnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseExited
        resetColor(btnVenta);
    }//GEN-LAST:event_btnVentaMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        setColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        resetColor(btnCancelar);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        setColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        resetColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        try{
            //IVA = x1.16
            double sum = 0;
            double sum2 = 0;
            //Subtotal.setText((String)TablaProductos.getValueAt(0, 1));
            switch(TablaProductos.getRowCount()){
                case 0:
                    JOptionPane.showMessageDialog(null, "Tabla vacia, favor de consultar el pedido con los campos de abajo: cliente, fecha, hora");
                break;
                
                default:
                    for(int i=0; i<TablaProductos.getRowCount(); i++){
                        double Can = Double.parseDouble((String)TablaProductos.getValueAt(i, 1));
                        double Pre = Double.parseDouble((String)TablaProductos.getValueAt(i, 2));
                        //int Can = Integer.parseInt((String)TablaProductos.getValueAt(i, 1));//Cantidad
                        //int Pre = Integer.parseInt((String)TablaProductos.getValueAt(i, 2));//Precio
                        double T = Can * Pre;//Total
                        sum = sum + T;//Suma para el total a pagar
                    }
                    for(int i=0; i<TablaProductos.getRowCount(); i++){
                        double Can = Double.parseDouble((String)TablaProductos.getValueAt(i, 4));
                        double Pre = Double.parseDouble((String)TablaProductos.getValueAt(i, 5));
                        //int Can = Integer.parseInt((String)TablaProductos.getValueAt(i, 4));//Cantidad
                        //int Pre = Integer.parseInt((String)TablaProductos.getValueAt(i, 5));//Precio
                        double T = Can * Pre;//Total
                        sum2 = sum2 + T;//Suma para el total a pagar
                    }
                    double S = sum + sum2;
                    Subtotal.setText(""+S);//Muestra el total a pagar sin el IVA
                    double ST = S * 1.16;//Añade el IVA
                    //int To = (int) Math.round(ST);//Total ya con IVA
                    Total.setText(""+ST);//Muestra el total ya con el IVA agregado
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnOkMouseClicked

    private void btnOkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseEntered
      setColor(btnOk);
    }//GEN-LAST:event_btnOkMouseEntered

    private void btnOkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseExited
    resetColor(btnOk);
    }//GEN-LAST:event_btnOkMouseExited

    private void Pago_conKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pago_conKeyTyped
        //Limitacion de caracteres
        if (Pago_con.getText().length() >= 10) {
            evt.consume();
        }
       //bloquear para solo letras
        char validar= evt.getKeyChar();
        if (validar <'0' || validar >'9' ) evt.consume(); {
        
        }
    }//GEN-LAST:event_Pago_conKeyTyped

    private void ClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClienteKeyTyped
        //Limitacion de caracteres
        if (Cliente.getText().length() >= 20) {
            evt.consume();
        }
        //bloquear para solo numeros
        char c = evt.getKeyChar();
        if ((c<'a' || c >'z') && (c<'A')| c>'Z') evt.consume(); {
            
        }
    }//GEN-LAST:event_ClienteKeyTyped

    private void FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaKeyTyped
         //Limitacion de caracteres
        if (Fecha.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_FechaKeyTyped

    private void HoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HoraKeyTyped
        if (Hora.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_HoraKeyTyped
    
    public void Vacio(){//Limpia los campos
        Subtotal.setText("0");
        Total.setText("0");
        Pago_con.setText(null);
        Cambio.setText("0");
        Cliente.setText(null);
        Fecha.setText(null);
        Hora.setText(null);
    }

    //Variables que llamamos para dar color a los botones
     void setColor(JPanel panel){
    panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cambio;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Hora;
    private javax.swing.JTextField Pago_con;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel Total;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCancelar;
    private javax.swing.JPanel btnOk;
    private javax.swing.JPanel btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
