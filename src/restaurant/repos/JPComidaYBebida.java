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
        ID_C = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Precio_Comida = new javax.swing.JTextField();
        btn_agregar_c = new javax.swing.JButton();
        btn_eliminar_c = new javax.swing.JButton();
        btn_modificar_c = new javax.swing.JButton();
        btn_buscar_c = new javax.swing.JButton();
        btn_limpiar_c = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_comida = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Precio_Bebida = new javax.swing.JTextField();
        btn_agregar_b = new javax.swing.JButton();
        btn_eliminar_b = new javax.swing.JButton();
        btn_modificar_b = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_buscar_b = new javax.swing.JButton();
        Nombre_Bebida = new javax.swing.JTextField();
        btn_limpiar_b = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Descripcion_Bebida = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_bebida = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ID_B = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        Nombre_Comida.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");

        Descripcion_Comida.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        ID_C.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Precio:");

        btn_agregar_c.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_agregar_c.setText("AGREGAR");
        btn_agregar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_cActionPerformed(evt);
            }
        });

        btn_eliminar_c.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_eliminar_c.setText("ELIMINAR");
        btn_eliminar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_cActionPerformed(evt);
            }
        });

        btn_modificar_c.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_modificar_c.setText("MODIFICAR");
        btn_modificar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_cActionPerformed(evt);
            }
        });

        btn_buscar_c.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_buscar_c.setText("BUSCAR");
        btn_buscar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_cActionPerformed(evt);
            }
        });

        btn_limpiar_c.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_limpiar_c.setText("CLEAR");
        btn_limpiar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_cActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Descripcion_Comida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre_Comida)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Precio_Comida)
                    .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btn_buscar_c)
                .addGap(18, 18, 18)
                .addComponent(btn_agregar_c)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar_c)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar_c)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar_c)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Descripcion_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar_c)
                    .addComponent(btn_agregar_c)
                    .addComponent(btn_modificar_c)
                    .addComponent(btn_limpiar_c)
                    .addComponent(btn_eliminar_c))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMIDAS", jPanel1);

        btn_agregar_b.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_agregar_b.setText("AGREGAR");
        btn_agregar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_bActionPerformed(evt);
            }
        });

        btn_eliminar_b.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_eliminar_b.setText("ELIMINAR");
        btn_eliminar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_bActionPerformed(evt);
            }
        });

        btn_modificar_b.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_modificar_b.setText("MODIFICAR");
        btn_modificar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_bActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        btn_buscar_b.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_buscar_b.setText("BUSCAR");
        btn_buscar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_bActionPerformed(evt);
            }
        });

        Nombre_Bebida.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        btn_limpiar_b.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btn_limpiar_b.setText("CLEAR");
        btn_limpiar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_bActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("Descripción:");

        Descripcion_Bebida.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        ID_B.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Precio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Descripcion_Bebida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre_Bebida)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Precio_Bebida)
                    .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btn_buscar_b)
                .addGap(18, 18, 18)
                .addComponent(btn_agregar_b)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar_b)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar_b)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar_b)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Descripcion_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar_b)
                    .addComponent(btn_agregar_b)
                    .addComponent(btn_modificar_b)
                    .addComponent(btn_limpiar_b)
                    .addComponent(btn_eliminar_b))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    private void btn_buscar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_bActionPerformed
        try {
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
        }
    }//GEN-LAST:event_btn_buscar_bActionPerformed

    private void btn_agregar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_bActionPerformed
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
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_agregar_bActionPerformed

    private void btn_modificar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_bActionPerformed
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
            JOptionPane.showMessageDialog(null, "Error al modificar  " +e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_modificar_bActionPerformed

    private void btn_limpiar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_bActionPerformed
        Vacio();
        MD();
    }//GEN-LAST:event_btn_limpiar_bActionPerformed

    private void btn_eliminar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_bActionPerformed
        try{//Elimina un registro segun su ID
            pst = con.prepareStatement("DELETE FROM bebidas WHERE ID=?;");
            pst.setInt(1, Integer.parseInt(ID_B.getText()));
            int n = pst.executeUpdate();
            if (n >= 0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion "+ e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_eliminar_bActionPerformed

    private void btn_buscar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cActionPerformed
        try {
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
        }
    }//GEN-LAST:event_btn_buscar_cActionPerformed

    private void btn_agregar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_cActionPerformed
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
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_agregar_cActionPerformed

    private void btn_modificar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_cActionPerformed
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
            JOptionPane.showMessageDialog(null, "Error al modificar  " +e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_modificar_cActionPerformed

    private void btn_limpiar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_cActionPerformed
        Vacio();
        MD();
    }//GEN-LAST:event_btn_limpiar_cActionPerformed

    private void btn_eliminar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_cActionPerformed
        //Elimina un registro segun su ID
        try{
            pst = con.prepareStatement("DELETE FROM comida WHERE ID=?");
            pst.setInt(1, Integer.parseInt(ID_C.getText()));
            int n = pst.executeUpdate();
            if (n >= 0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion "+ e.getMessage());
        }
        MD();
    }//GEN-LAST:event_btn_eliminar_cActionPerformed

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
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos "+ e.getMessage());
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion_Bebida;
    private javax.swing.JTextField Descripcion_Comida;
    private javax.swing.JTextField ID_B;
    private javax.swing.JTextField ID_C;
    private javax.swing.JTextField Nombre_Bebida;
    private javax.swing.JTextField Nombre_Comida;
    private javax.swing.JTextField Precio_Bebida;
    private javax.swing.JTextField Precio_Comida;
    private javax.swing.JTable Tabla_bebida;
    private javax.swing.JTable Tabla_comida;
    private javax.swing.JButton btn_agregar_b;
    private javax.swing.JButton btn_agregar_c;
    private javax.swing.JButton btn_buscar_b;
    private javax.swing.JButton btn_buscar_c;
    private javax.swing.JButton btn_eliminar_b;
    private javax.swing.JButton btn_eliminar_c;
    private javax.swing.JButton btn_limpiar_b;
    private javax.swing.JButton btn_limpiar_c;
    private javax.swing.JButton btn_modificar_b;
    private javax.swing.JButton btn_modificar_c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
