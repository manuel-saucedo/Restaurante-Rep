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
        MD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        Cambio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Subtotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pago_con = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_venta = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        Hora = new javax.swing.JTextField();

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

        Cambio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setText("Cambio:");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setText("Total:");

        Total.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setText("Subtotal:");

        Subtotal.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setText("IVA:");

        Cliente.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel7.setText("Pagó con:");

        Pago_con.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        btn_buscar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_venta.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_venta.setText("VENTA");
        btn_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventaActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel10.setText("Cliente:");

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel11.setText("16%");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel12.setText("Fecha:");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel13.setText("Hora:");

        Fecha.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        Hora.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel2))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Total)
                                .addComponent(Subtotal)
                                .addComponent(Pago_con)
                                .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cliente)
                                .addComponent(Fecha)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_venta)
                                        .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btn_cancelar))
                            .addComponent(btn_buscar))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Pago_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_venta)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10))
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
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
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos "+ e.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventaActionPerformed
        //IVA = x1.16
        double sum = 0;
        double ST = 0;
        double CT = 0;
        int PC = Integer.parseInt(Pago_con.getText());
        for(int i=0; i<TablaProductos.getHeight(); i++){
            int Can = Integer.parseInt((String)TablaProductos.getValueAt(i, 1));//Cantidad
            int Pre = Integer.parseInt((String)TablaProductos.getValueAt(i, 2));//Precio
            int T = Can * Pre;//Total
            sum = sum + T;//Suma para el total a pagar
        }
        Subtotal.setText(""+sum);//Muestra el total a pagar sin el IVA
        ST = sum * 1.16;//Añade el IVA
        Total.setText(""+ST);//Muestra el total ya con el IVA agregado
        CT = PC-ST;//Saca el cambio de con cuanto pago menos el total a pagar
        Cambio.setText(""+CT);//Muestra el cambio
        
    }//GEN-LAST:event_btn_ventaActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Vacio();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void SubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtotalActionPerformed
        //Este no se como se puso, pero no hara nada
    }//GEN-LAST:event_SubtotalActionPerformed
    
    public void MD(){//Muestra los datos guardados en mysql
        
    }
    
    public void Vacio(){//Limpia los campos
        Subtotal.setText(null);
        Total.setText(null);
        Pago_con.setText(null);
        Cambio.setText(null);
        Cliente.setText(null);
        Fecha.setText(null);
        Hora.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cambio;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Hora;
    private javax.swing.JTextField Pago_con;
    private javax.swing.JTextField Subtotal;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTextField Total;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_venta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
