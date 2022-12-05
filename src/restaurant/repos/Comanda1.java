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

public class Comanda1 extends javax.swing.JPanel {
    //Conexion con mysql
    Conexion C = new Conexion();
    Connection con = C.conexion();
    PreparedStatement valores;
    //Modelo para la tabla
    DefaultTableModel modelo;
    public Comanda1() {
        initComponents();
        
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Comida");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Bebida");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Cliente");
        this.Tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        ID_O = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        B_ok_F = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel8.setText("Fecha");

        cantidad.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        cantidad.setText("Cantidad");

        comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        comida.setText("Comida");

        bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bebida.setText("Bebida");

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel12.setText("Hora");

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel13.setText("Cliente");

        C_C1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        C_B1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        Bebida1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        Fecha1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        Hora1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        Cliente1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        Comida1.setFont(new java.awt.Font("Roboto Light", 0, 22)); // NOI18N

        B_sig_O.setBackground(new java.awt.Color(18, 90, 173));
        B_sig_O.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel1.setText("SIGUIENTE");

        javax.swing.GroupLayout B_sig_OLayout = new javax.swing.GroupLayout(B_sig_O);
        B_sig_O.setLayout(B_sig_OLayout);
        B_sig_OLayout.setHorizontalGroup(
            B_sig_OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_sig_OLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        B_sig_OLayout.setVerticalGroup(
            B_sig_OLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, B_sig_OLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel14.setText("ID");

        ID_O.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(ID_O);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bebida)
                                    .addComponent(comida))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Comida1)
                                        .addGap(18, 18, 18)
                                        .addComponent(C_C1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cantidad)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 89, Short.MAX_VALUE)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addGap(12, 12, 12)
                                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Bebida1))
                                        .addGap(18, 18, 18)
                                        .addComponent(C_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cliente1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(B_sig_O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comida)
                    .addComponent(Comida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bebida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bebida))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(47, 47, 47)
                .addComponent(B_sig_O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ORDEN", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));

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

        B_ok_F.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        B_ok_F.setText("OK");
        B_ok_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ok_FActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(B_ok_F)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_ok_F)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FINAL", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void B_ok_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ok_FActionPerformed
        try{
            //bucle del tamaño de la tabla generada
            for(int i=-1; i>Tabla.getRowCount(); i++){
                //Expresion para ingresar los datos dentro de la tabla en mysql
                String SQL = "use restaurant_disi; "
                        + "INSERT INTO comanda(`Comida`, `Cantidad`, `Fecha_hora`, `Nombre_Cl`) values('?','?','?','?');";
                valores = con.prepareStatement(SQL);
                //Datos que se guardaran en los registros de la tabla
                valores.setString(1, (String)Tabla.getValueAt(i, 1)+" - "+(String)Tabla.getValueAt(i, 3));
                valores.setString(2, (String)Tabla.getValueAt(i, 2)+" - "+(String)Tabla.getValueAt(i, 4));
                valores.setString(3, (String)Tabla.getValueAt(i, 5)+" - "+(String)Tabla.getValueAt(i, 6));
                valores.setString(4, (String)Tabla.getValueAt(i, 7));
                valores.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Registro excitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
        Vacio();
    }//GEN-LAST:event_B_ok_FActionPerformed

    private void B_sig_OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_sig_OMouseClicked
        //Boton Para cargar los datos en la tabla antes de subir a la base de datos
        int Num = Tabla.getRowCount();
        String ID = String.valueOf(Num);
        //Tamaño del array segun las columnas de la tabla
        String []D = new String[8];
        String id = Tabla.getRowCount()+"";
        D[0] = id;
        //Comida
        String NC = Comida1.getText();
        D[1] = NC;
        //Cantidad de comida
        String CC = C_C1.getText();
        D[2] = CC;
        //Bebida
        String NB = Bebida1.getText();
        D[3] = NB;
        //Cantidad de bebida
        String CB = C_B1.getText();
        D[4] = CB;
        //Fecha
        String FE = Fecha1.getText();
        D[5] = FE;
        //Hora
        String HR = Hora1.getText();
        D[6] = HR;
        //Nombre del cliente
        D[7] = Cliente1.getText();
        //Pone en blanco los campos para añadir más datos
        Comida1.setText(null);
        Bebida1.setText(null);
        C_C1.setText(null);
        C_B1.setText(null);
        //Agrega los datos a la tabla de JPane
        modelo.addRow(D);
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
        //Obtiene la fila seleccionada en la tabla
        int F = Tabla.getSelectedRow();
        if(F == -1){
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }
        else{
            int ID_F = Integer.parseInt((String)Tabla.getValueAt(F, 0));
            String N_Comida = (String)Tabla.getValueAt(F, 1);
            String Cantidad_Comida = (String)Tabla.getValueAt(F, 2);
            String N_Bebida = (String)Tabla.getValueAt(F, 3);
            String Cantidad_Bebida = (String)Tabla.getValueAt(F, 4);
            String Fecha = (String)Tabla.getValueAt(F, 5);
            String Hora = (String)Tabla.getValueAt(F, 6);
            String Cliente = (String)Tabla.getValueAt(F, 7);
            ID_O.setText(""+ID_F);
            Comida1.setText(N_Comida);
            C_C1.setText(Cantidad_Comida);
            Bebida1.setText(N_Bebida);
            C_B1.setText(Cantidad_Bebida);
            Fecha1.setText(Fecha);
            Hora1.setText(Hora);
            Cliente1.setText(Cliente);
        }
    }//GEN-LAST:event_TablaMouseClicked
    
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
    private javax.swing.JButton B_ok_F;
    private javax.swing.JPanel B_sig_O;
    private javax.swing.JTextField Bebida1;
    private javax.swing.JTextField C_B1;
    private javax.swing.JTextField C_C1;
    private javax.swing.JTextField Cliente1;
    private javax.swing.JTextField Comida1;
    private javax.swing.JTextField Fecha1;
    private javax.swing.JTextField Hora1;
    private javax.swing.JTextPane ID_O;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel bebida;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
