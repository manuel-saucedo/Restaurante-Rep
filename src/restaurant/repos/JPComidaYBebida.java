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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Comida = new javax.swing.JTextField();
        Descripcion_Comida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Precio_Comida = new javax.swing.JTextField();
        bttn_agregar_comida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_comida = new javax.swing.JTable();
        bttn_eliminar_comida = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ID_C = new javax.swing.JTextField();
        btn_modificar_comida = new javax.swing.JButton();
        btn_limpiar_c = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Descripcion_Bebida = new javax.swing.JTextField();
        Nombre_Bebida = new javax.swing.JTextField();
        Precio_Bebida = new javax.swing.JTextField();
        bttn_agregar_bebida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_bebida = new javax.swing.JTable();
        bttn_eliminar_bebida = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ID_B = new javax.swing.JTextField();
        btn_modificar_bebida = new javax.swing.JButton();
        btn_limpiar_b = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 550));

        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        Nombre_Comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        Descripcion_Comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setText("Precio:");

        Precio_Comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        bttn_agregar_comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bttn_agregar_comida.setText("AGREGAR");
        bttn_agregar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_comidaActionPerformed(evt);
            }
        });

        Tabla_comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bttn_eliminar_comida.setText("ELIMINAR");
        bttn_eliminar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_comidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel8.setText("ID:");

        ID_C.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        ID_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_CActionPerformed(evt);
            }
        });

        btn_modificar_comida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_modificar_comida.setText("MODIFICAR");
        btn_modificar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_comidaActionPerformed(evt);
            }
        });

        btn_limpiar_c.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_limpiar_c.setText("CLEAR");
        btn_limpiar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Comida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_C))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descripcion_Comida)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpiar_c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_modificar_comida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttn_agregar_comida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttn_eliminar_comida)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Descripcion_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_agregar_comida)
                    .addComponent(bttn_eliminar_comida)
                    .addComponent(jLabel8)
                    .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_comida)
                    .addComponent(btn_limpiar_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMIDAS", jPanel1);

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setText("Precio:");

        Descripcion_Bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        Nombre_Bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        Precio_Bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        bttn_agregar_bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bttn_agregar_bebida.setText("AGREGAR");
        bttn_agregar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_bebidaActionPerformed(evt);
            }
        });

        Tabla_bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        bttn_eliminar_bebida.setText("ELIMINAR");
        bttn_eliminar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_bebidaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel9.setText("ID:");

        ID_B.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N

        btn_modificar_bebida.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_modificar_bebida.setText("MODIFICAR");
        btn_modificar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_bebidaActionPerformed(evt);
            }
        });

        btn_limpiar_b.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btn_limpiar_b.setText("CLEAR");
        btn_limpiar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiar_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Bebida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_B))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descripcion_Bebida)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_limpiar_b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_modificar_bebida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttn_agregar_bebida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bttn_eliminar_bebida)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Nombre_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Descripcion_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttn_agregar_bebida)
                        .addComponent(bttn_eliminar_bebida)
                        .addComponent(btn_modificar_bebida))
                    .addComponent(btn_limpiar_b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BEBIDAS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void bttn_agregar_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
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
    }                                                   

    private void bttn_eliminar_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
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
    }                                                    

    private void Tabla_comidaMouseClicked(java.awt.event.MouseEvent evt) {                                          
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
    }                                         

    private void bttn_agregar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
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
    }                                                   

    private void bttn_eliminar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
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
    }                                                    

    private void Tabla_bebidaMouseClicked(java.awt.event.MouseEvent evt) {                                          
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
    }                                         

    private void ID_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_CActionPerformed
        //Lo puse sin querer, no hace nada
    }//GEN-LAST:event_ID_CActionPerformed

    private void btn_modificar_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_comidaActionPerformed
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
    }//GEN-LAST:event_btn_modificar_comidaActionPerformed

    private void btn_modificar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_bebidaActionPerformed
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
    }//GEN-LAST:event_btn_modificar_bebidaActionPerformed

    private void btn_limpiar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_cActionPerformed
        Vacio();
        MD();
    }//GEN-LAST:event_btn_limpiar_cActionPerformed

    private void btn_limpiar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiar_bActionPerformed
        Vacio();
        MD();
    }//GEN-LAST:event_btn_limpiar_bActionPerformed
/*           
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
    */
    // Variables declaration - do not modify                     
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
    //
    private javax.swing.JButton btn_limpiar_b;
    private javax.swing.JButton btn_limpiar_c;
    private javax.swing.JButton btn_modificar_bebida;
    private javax.swing.JButton btn_modificar_comida;
    //
    private javax.swing.JButton bttn_agregar_bebida;
    private javax.swing.JButton bttn_agregar_comida;
    private javax.swing.JButton bttn_eliminar_bebida;
    private javax.swing.JButton bttn_eliminar_comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    
/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Comida = new javax.swing.JTextField();
        Descripcion_Comida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Precio_Comida = new javax.swing.JTextField();
        bttn_agregar_comida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_comida = new javax.swing.JTable();
        bttn_eliminar_comida = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ID_C = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Descripcion_Bebida = new javax.swing.JTextField();
        Nombre_Bebida = new javax.swing.JTextField();
        Precio_Bebida = new javax.swing.JTextField();
        bttn_agregar_bebida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_bebida = new javax.swing.JTable();
        bttn_eliminar_bebida = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ID_B = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 550));

        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText("Precio:");

        bttn_agregar_comida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_agregar_comida.setText("AGREGAR");
        bttn_agregar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_comidaActionPerformed(evt);
            }
        });

        Tabla_comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_comida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_eliminar_comida.setText("ELIMINAR");
        bttn_eliminar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_comidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Comida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Descripcion_Comida)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bttn_agregar_comida)
                .addGap(80, 80, 80)
                .addComponent(bttn_eliminar_comida)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Descripcion_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_agregar_comida)
                    .addComponent(bttn_eliminar_comida)
                    .addComponent(jLabel8)
                    .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMIDAS", jPanel1);

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("Precio:");

        bttn_agregar_bebida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_agregar_bebida.setText("AGREGAR");
        bttn_agregar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_bebidaActionPerformed(evt);
            }
        });

        Tabla_bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_bebida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_eliminar_bebida.setText("ELIMINAR");
        bttn_eliminar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_bebidaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Descripcion_Bebida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Bebida))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bttn_agregar_bebida)
                .addGap(80, 80, 80)
                .addComponent(bttn_eliminar_bebida)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Nombre_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Descripcion_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_agregar_bebida)
                    .addComponent(bttn_eliminar_bebida)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BEBIDAS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>                        

    private void bttn_agregar_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        try{
            String SQL = "INSERT INTO comida(`Nombre`, `Precio`, `Descripcion`) values('?','?','?')";
            pst = con.prepareStatement(SQL);
            pst.setString(1, Nombre_Comida.getText());
            pst.setString(2, Precio_Comida.getText());
            pst.setString(3, Descripcion_Comida.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro excitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
    }                                                   

    private void bttn_eliminar_comidaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
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
    }                                                    

    private void Tabla_comidaMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int F = Tabla_comida.getSelectedRow();
        if(F == -1){
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_C = Integer.parseInt((String)Tabla_comida.getValueAt(F, 0));
            String D_C = (String)Tabla_comida.getValueAt(F, 2);
            String P_C = (String)Tabla_comida.getValueAt(F, 1);
            Nombre_Comida.setText(""+ID_C);
            Descripcion_Comida.setText(D_C);
            Precio_Comida.setText(P_C);
        }
    }                                         

    private void bttn_agregar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        try{
            String SQL = "INSERT INTO bebidas(`Nombre`, `Precio`, `Descripcion`) values('?','?','?')";
            pst = con.prepareStatement(SQL);
            pst.setString(1, Nombre_Bebida.getText());
            pst.setString(2, Precio_Bebida.getText());
            pst.setString(3, Descripcion_Bebida.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro excitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
    }                                                   

    private void bttn_eliminar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try{
            pst = con.prepareStatement("DELETE FROM bebidas WHERE ID=?");
            pst.setInt(1, Integer.parseInt(ID_B.getText()));
            int n = pst.executeUpdate();
            if (n >= 0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion "+ e.getMessage());
        }
    }                                                    

    private void Tabla_bebidaMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int F = Tabla_bebida.getSelectedRow();
        if(F == -1){
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_B = Integer.parseInt((String)Tabla_bebida.getValueAt(F, 0));
            String D_B = (String)Tabla_bebida.getValueAt(F, 2);
            String P_B = (String)Tabla_bebida.getValueAt(F, 1);
            Nombre_Bebida.setText(""+ID_B);
            Descripcion_Bebida.setText(D_B);
            Precio_Bebida.setText(P_B);
        }
    }                                         
*/
/*
    // Variables declaration - do not modify                     
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
>>>>>>> master
    private javax.swing.JButton bttn_agregar_bebida;
    private javax.swing.JButton bttn_agregar_comida;
    private javax.swing.JButton bttn_eliminar_bebida;
    private javax.swing.JButton bttn_eliminar_comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration                   
}
=======
    Conexion C = new Conexion();
    Connection con = C.conexion();
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    ResultSet RS;
    Statement ST;
    DefaultTableModel modelo_comida;
    DefaultTableModel modelo_bebida;

    public JPComidaYBebida() {
        initComponents();
        MD();
    }
    public void MD(){//Muestra los datos guardados en mysql
        //Nombre de los campos en la tabla de Comanda
        String[]Campos = {"ID", "Nombre", "Precio", "Descripcion"};
        String[]Registro = new String[4];//Espacio para registrar los campos de la tabla
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
                Registro[0]= RS.getString("ID");
                Registro[1]= RS.getString("Nombre");
                Registro[2]= RS.getString("Precio");
                Registro[3]= RS.getString("Descripcion");
                modelo_comida.addRow(Registro);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla_comida.setModel(modelo_comida);
        Tabla_bebida.setModel(modelo_bebida);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos "+ e.getMessage());
        }
    }
    public void Vacio(){
        Nombre_Comida.setText(null);
        Descripcion_Comida.setText(null);
        Precio_Comida.setText(null);
        Nombre_Bebida.setText(null);
        Descripcion_Bebida.setText(null);
        Precio_Bebida.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nombre_Comida = new javax.swing.JTextField();
        Descripcion_Comida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Precio_Comida = new javax.swing.JTextField();
        bttn_agregar_comida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_comida = new javax.swing.JTable();
        bttn_eliminar_comida = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ID_C = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Descripcion_Bebida = new javax.swing.JTextField();
        Nombre_Bebida = new javax.swing.JTextField();
        Precio_Bebida = new javax.swing.JTextField();
        bttn_agregar_bebida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_bebida = new javax.swing.JTable();
        bttn_eliminar_bebida = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ID_B = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 550));

        jTabbedPane1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText("Precio:");

        bttn_agregar_comida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_agregar_comida.setText("AGREGAR");
        bttn_agregar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_comidaActionPerformed(evt);
            }
        });

        Tabla_comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_comida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_eliminar_comida.setText("ELIMINAR");
        bttn_eliminar_comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_comidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel8.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Comida))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Descripcion_Comida)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bttn_agregar_comida)
                .addGap(80, 80, 80)
                .addComponent(bttn_eliminar_comida)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Descripcion_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Precio_Comida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_agregar_comida)
                    .addComponent(bttn_eliminar_comida)
                    .addComponent(jLabel8)
                    .addComponent(ID_C, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("COMIDAS", jPanel1);

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel6.setText("Precio:");

        bttn_agregar_bebida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_agregar_bebida.setText("AGREGAR");
        bttn_agregar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_agregar_bebidaActionPerformed(evt);
            }
        });

        Tabla_bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
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

        bttn_eliminar_bebida.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        bttn_eliminar_bebida.setText("ELIMINAR");
        bttn_eliminar_bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminar_bebidaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel9.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Descripcion_Bebida))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Nombre_Bebida))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(bttn_agregar_bebida)
                .addGap(80, 80, 80)
                .addComponent(bttn_eliminar_bebida)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Nombre_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Descripcion_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Precio_Bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttn_agregar_bebida)
                    .addComponent(bttn_eliminar_bebida)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(ID_B, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("BEBIDAS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_agregar_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_agregar_comidaActionPerformed
        try{
            String SQL = "INSERT INTO comida(`Nombre`, `Precio`, `Descripcion`) values('?','?','?')";
            pst = con.prepareStatement(SQL);
            //Registra los datos directamente en la tabla de mysql
            pst.setString(1, Nombre_Comida.getText());
            pst.setString(2, Precio_Comida.getText());
            pst.setString(3, Descripcion_Comida.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro excitoso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
        }
    }//GEN-LAST:event_bttn_agregar_comidaActionPerformed

    private void bttn_eliminar_comidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_eliminar_comidaActionPerformed
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
    }//GEN-LAST:event_bttn_eliminar_comidaActionPerformed

    private void Tabla_comidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_comidaMouseClicked
        int F = Tabla_comida.getSelectedRow();
        if(F == -1){
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_C = Integer.parseInt((String)Tabla_comida.getValueAt(F, 0));
            String D_C = (String)Tabla_comida.getValueAt(F, 2);
            String P_C = (String)Tabla_comida.getValueAt(F, 1);
            Nombre_Comida.setText(""+ID_C);
            Descripcion_Comida.setText(D_C);
            Precio_Comida.setText(P_C);
        }
    }//GEN-LAST:event_Tabla_comidaMouseClicked

    private void bttn_agregar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_agregar_bebidaActionPerformed
        try{
            String SQL = "INSERT INTO bebidas(`Nombre`, `Precio`, `Descripcion`) values('?','?','?')";
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
    }//GEN-LAST:event_bttn_agregar_bebidaActionPerformed

    private void bttn_eliminar_bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_eliminar_bebidaActionPerformed
        try{
            pst = con.prepareStatement("DELETE FROM bebidas WHERE ID=?");
            pst.setInt(1, Integer.parseInt(ID_B.getText()));
            int n = pst.executeUpdate();
            if (n >= 0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion "+ e.getMessage());
        }
    }//GEN-LAST:event_bttn_eliminar_bebidaActionPerformed

    private void Tabla_bebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_bebidaMouseClicked
        int F = Tabla_bebida.getSelectedRow();
        if(F == -1){
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        }else{
            int ID_B = Integer.parseInt((String)Tabla_bebida.getValueAt(F, 0));
            String D_B = (String)Tabla_bebida.getValueAt(F, 2);
            String P_B = (String)Tabla_bebida.getValueAt(F, 1);
            Nombre_Bebida.setText(""+ID_B);
            Descripcion_Bebida.setText(D_B);
            Precio_Bebida.setText(P_B);
        }
    }//GEN-LAST:event_Tabla_bebidaMouseClicked


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
    private javax.swing.JButton bttn_agregar_bebida;
    private javax.swing.JButton bttn_agregar_comida;
    private javax.swing.JButton bttn_eliminar_bebida;
    private javax.swing.JButton bttn_eliminar_comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
*/}
