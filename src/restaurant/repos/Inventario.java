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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arima
 */
public class Inventario extends javax.swing.JPanel {

Conexion cc = new Conexion();
Connection con = cc.conexion();
PreparedStatement ps;
ResultSet rs;
Statement st;
DefaultTableModel modelo;
    
    public Inventario() {
        initComponents();
        mostrarDatos();
    }
        public void mostrarDatos(){
        //Titulos de la Tabla
        String[]titulos = {"ID","Nombre", "Cantidadxgr_ml", "Precioxgr_ml","Proveedor"};
        String[]registros = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL= "select * from inventario";
   try{
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(SQL);
       while (rs.next()){
       //Titulos de la base de datos
       registros[0]= rs.getString("ID");
       registros[1]= rs.getString("Nombre");
       registros[2]= rs.getString("Cantidadxgr_ml");
       registros[3]= rs.getString("Precioxgr_ml");
       registros[4]= rs.getString("Proveedor");
       
       modelo.addRow(registros);
       }
       TableI.setModel(modelo);
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Error al Mostrar Datos "+ e.getMessage());
   }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDI = new javax.swing.JTextField();
        txtNomI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecI = new javax.swing.JTextField();
        txtProvI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableI = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnAct = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Inventario");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtIDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDIActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel4.setText("Cantidadxgr_ml:");

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel5.setText("Precioxgr_ml:");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("Proveedor:");

        TableI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableI);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        btnAñadir.setBackground(new java.awt.Color(18, 90, 173));
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AÑADIR");

        javax.swing.GroupLayout btnAñadirLayout = new javax.swing.GroupLayout(btnAñadir);
        btnAñadir.setLayout(btnAñadirLayout);
        btnAñadirLayout.setHorizontalGroup(
            btnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAñadirLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAñadirLayout.setVerticalGroup(
            btnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAñadirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnBorrar.setBackground(new java.awt.Color(18, 90, 173));
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR");

        javax.swing.GroupLayout btnBorrarLayout = new javax.swing.GroupLayout(btnBorrar);
        btnBorrar.setLayout(btnBorrarLayout);
        btnBorrarLayout.setHorizontalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBorrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnBorrarLayout.setVerticalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBorrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        btnBuscar.setBackground(new java.awt.Color(18, 90, 173));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        btnAct.setBackground(new java.awt.Color(18, 90, 173));
        btnAct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActLayout = new javax.swing.GroupLayout(btnAct);
        btnAct.setLayout(btnActLayout);
        btnActLayout.setHorizontalGroup(
            btnActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        btnActLayout.setVerticalGroup(
            btnActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(txtProvI, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                    .addComponent(txtPrecI, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCantI))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNomI, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                        .addComponent(txtIDI)))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtNomI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCantI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPrecI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtProvI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(429, 429, 429))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDIActionPerformed

    private void TableIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableIMouseClicked
        int fila=TableI.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Fila no Seleccionada");
        }else{
            int id=Integer.parseInt((String)TableI.getValueAt(fila, 0));
            String nom=(String)TableI.getValueAt(fila, 1);
            int cant=Integer.parseInt((String)TableI.getValueAt(fila, 2));
            int prec=Integer.parseInt((String)TableI.getValueAt(fila, 3));
            String prov=(String)TableI.getValueAt(fila, 4);
            txtIDI.setText(""+id);
            txtNomI.setText(nom);
            txtCantI.setText(""+cant);
            txtPrecI.setText(""+prec);
            txtProvI.setText(prov);

        }
    }//GEN-LAST:event_TableIMouseClicked

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        insertarDatos();
        limpiarCajas();     
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        // TODO add your handling code here:
        eliminarRegistro();
        limpiarCajas();
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
         try {
            ps = con.prepareStatement("SELECT * FROM inventario WHERE ID = ?");
            ps.setString(1,txtIDI.getText());
            rs = ps.executeQuery();
            if(rs.next()){
                txtIDI.setText(rs.getString("ID"));
                txtNomI.setText(rs.getString("Nombre"));
                txtCantI.setText(rs.getString("Cantidadxgr_ml"));
                txtPrecI.setText(rs.getString("Precioxgr_ml"));
                txtProvI.setText(rs.getString("Proveedor"));
            }else{
                JOptionPane.showMessageDialog(null, "No existe un producto con ese nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActMouseClicked
        // TODO add your handling code here:
        actualizarDatos();
        limpiarCajas();
    }//GEN-LAST:event_btnActMouseClicked

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        // TODO add your handling code here:
        //btnAñadir.setBackground(Color.WHITE);
        setColor(btnAñadir);
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        // TODO add your handling code here:
       resetColor(btnAñadir);
    }//GEN-LAST:event_btnAñadirMouseExited

    private void btnActMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActMouseExited
        // TODO add your handling code here:
        resetColor(btnAct);
    }//GEN-LAST:event_btnActMouseExited

    private void btnActMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActMouseEntered
        // TODO add your handling code here:
        setColor(btnAct);
    }//GEN-LAST:event_btnActMouseEntered

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        // TODO add your handling code here:
        setColor(btnBorrar);
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        resetColor(btnBorrar);
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        resetColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        setColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered
    
    public void insertarDatos(){
    try{
        String SQL = "insert into inventario(ID,Nombre, Cantidadxgr_ml, Precioxgr_ml, Proveedor) values(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(SQL);
        //Envia lo que se ingresa en el cuadro de texto
        //pst.setString(1, txtID.getText());
        pst.setString(1, txtIDI.getText());
        pst.setString(2, txtNomI.getText());
        pst.setInt(3, Integer.parseInt(txtCantI.getText()));
        pst.setInt(4, Integer.parseInt(txtPrecI.getText()));
        pst.setString(5,txtProvI.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro excitoso");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
    }
}
        public void limpiarCajas(){
    txtIDI.setText("");
    txtNomI.setText("");
    txtCantI.setText("");
    txtPrecI.setText("");
    txtProvI.setText("");
}
        public void actualizarDatos(){
    try{
        String SQL = "update inventario set Nombre=?,Cantidadxgr_ml=?,Precioxgr_ml=?,Proveedor=? where ID=?";
        
        ps = con.prepareStatement(SQL);
        ps.setString(1, txtNomI.getText());
        ps.setInt(2, Integer.parseInt(txtCantI.getText()));
        ps.setInt(3, Integer.parseInt(txtPrecI.getText()));
        ps.setString(4,txtProvI.getText());
        ps.setInt(5, Integer.parseInt(txtIDI.getText()));
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Actualizacion excitosa");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de Actualizacion  " +e.getMessage());
    }
}        
    
    public void eliminarRegistro(){
        
                //int filaSeleccionada = TableEm.getSelectedRow();
                
        try{
            ps = con.prepareStatement("delete from inventario where ID=?");
            ps.setInt(1,Integer.parseInt(txtIDI.getText()));
            int n = ps.executeUpdate();
            if (n>=0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error de eliminacion "+ e.getMessage());
        }
    }
            public void actualizarDatos(){
    try{
        String SQL = "update inventario set Nombre=?,Cantidadxgr_ml=?,Precioxgr_ml=?,Proveedor=? where ID=?";


        ps.setString(1, txtNomI.getText());
        ps.setInt(2, Integer.parseInt(txtCantI.getText()));
        ps.setInt(3, Integer.parseInt(txtPrecI.getText()));
        ps.setString(4,txtProvI.getText());
        ps.setInt(5, Integer.parseInt(txtIDI.getText()));
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Actualizacion excitosa");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de Actualizacion  " +e.getMessage());
    }
}
    public void insertarDatos(){
    try{
        String SQL = "insert into inventario(ID,Nombre, Cantidadxgr_ml, Precioxgr_ml, Proveedor) values(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(SQL);
        //Envia lo que se ingresa en el cuadro de texto
        //pst.setString(1, txtID.getText());
        pst.setString(1, txtIDI.getText());
        pst.setString(2, txtNomI.getText());
        pst.setInt(3, Integer.parseInt(txtCantI.getText()));
        pst.setInt(4, Integer.parseInt(txtPrecI.getText()));
        pst.setString(5,txtProvI.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro excitoso");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de Registro  " +e.getMessage());
    }
}
        public void limpiarCajas(){
    txtIDI.setText("");
    txtNomI.setText("");
    txtCantI.setText("");
    txtPrecI.setText("");
    txtProvI.setText("");
}
    void setColor(JPanel panel){
    panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableI;
    private javax.swing.JPanel btnAct;
    private javax.swing.JPanel btnAñadir;
    private javax.swing.JPanel btnBorrar;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantI;
    private javax.swing.JTextField txtIDI;
    private javax.swing.JTextField txtNomI;
    private javax.swing.JTextField txtPrecI;
    private javax.swing.JTextField txtProvI;
    // End of variables declaration//GEN-END:variables
}
