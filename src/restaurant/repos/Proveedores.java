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
public class Proveedores extends javax.swing.JPanel {

    /**
     * Creates new form Proveedores
     */
    
 Conexion cc = new Conexion();
Connection con = cc.conexion();
PreparedStatement ps;
ResultSet rs;
Statement st;
    public Proveedores() {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNlegal = new javax.swing.JTextField();
        txtNcom = new javax.swing.JTextField();
        txtMatprim = new javax.swing.JTextField();
        txtCporU = new javax.swing.JTextField();
        txtPrecioU = new javax.swing.JTextField();
        txtPrecioT = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnAñadir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre Legal:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel3.setText("Nombre Comercial:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel4.setText("Materia Prima:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel5.setText("Cantidad por Unidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabel6.setText("Precio Unitario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        jLabel7.setText("Precio Total:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel8.setText("Telefono:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));
        jPanel1.add(txtNlegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 220, -1));
        jPanel1.add(txtNcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, -1));
        jPanel1.add(txtMatprim, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 220, -1));
        jPanel1.add(txtCporU, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 220, -1));
        jPanel1.add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 220, -1));
        jPanel1.add(txtPrecioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 220, -1));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 220, -1));

        btnAñadir.setBackground(new java.awt.Color(18, 90, 173));
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.setPreferredSize(new java.awt.Dimension(111, 29));
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AÑADIR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnAñadirLayout = new javax.swing.GroupLayout(btnAñadir);
        btnAñadir.setLayout(btnAñadirLayout);
        btnAñadirLayout.setHorizontalGroup(
            btnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAñadirLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        btnAñadirLayout.setVerticalGroup(
            btnAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAñadirLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

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

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, -1));

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

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BUSCAR");

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBuscarLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        btnActualizar.setBackground(new java.awt.Color(18, 90, 173));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 220, -1));

        jLabel12.setText("Identificador:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(18, 90, 173));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(111, 29));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("LIMPIAR");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(31, 31, 31))
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1729, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // Funcion de insertado de datos
        int fila=Table.getSelectedRow();
        if (fila ==-1){
            JOptionPane.showMessageDialog(null, "Fila no Seleccionada");
        }else{
             String ID=(String)Table.getValueAt(fila, 0);
            String NomL=(String)Table.getValueAt(fila, 1);
            String NomC=(String)Table.getValueAt(fila, 2);
            String MatP=(String)Table.getValueAt(fila, 3);
            String CporU=(String)Table.getValueAt(fila, 4);
            String PrecioU=(String)Table.getValueAt(fila,5);
              String PrecioT=(String)Table.getValueAt(fila,6);
            String Telefono=(String)Table.getValueAt(fila, 7);
            
            //Mandamos a llamar a las variables
            txtNlegal.setText(ID);
            txtNlegal.setText(NomL);
            txtNcom.setText(NomC);
            txtMatprim.setText(MatP);
            txtCporU.setText(CporU);
            txtPrecioU.setText(PrecioU);
            txtPrecioT.setText(PrecioT);
            txtTel.setText(Telefono);
            //txtPrecioT.setText();
            //txtTel.setText();
        }
    }//GEN-LAST:event_TableMouseClicked

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        insertarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminarRegistro();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
         if (txtID.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Error Campo vacio, Verifique que el identificador ID este correcto");
        }else{    
        try {
        ps = con.prepareStatement("SELECT * FROM proveedores WHERE ID = ?");
        ps.setString(1,txtID.getText());
        rs = ps.executeQuery();
        if(rs.next()){
            txtID.setText(rs.getString("ID"));
            txtNcom.setText(rs.getString("Nombre_comercial"));
            txtNlegal.setText(rs.getString("Nombre_legal"));
            txtMatprim.setText(rs.getString("Materia_prima"));
            txtCporU.setText(rs.getString("Cantidadxunidad"));
            txtPrecioU.setText(rs.getString("Precio_unitario"));
            txtPrecioT.setText(rs.getString("Precio_Total"));
            txtTel.setText(rs.getString("Telefono"));
        }else{
            JOptionPane.showMessageDialog(null, "no es posible buscar datos, si el ID es Erroneo o esta vacio");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        setColor(btnAñadir);
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        setColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        setColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        setColor(btnActualizar);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        resetColor(btnAñadir);
    }//GEN-LAST:event_btnAñadirMouseExited

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        resetColor(btnEliminar);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        resetColor(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        resetColor(btnActualizar);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCajas();
        JOptionPane.showMessageDialog(null, "Se limpiaron los campos");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        setColor(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        resetColor(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    //Metodos
    
     public void eliminarRegistro(){
          if (txtID.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Error campo vacio, No es posible eliminar un campo Vacio, Verifique que los datos esten correctos");
        }else{    
        int filaSeleccionada = Table.getSelectedRow();
        try{
            String SQL = "delete from proveedores where ID="+Table.getValueAt(filaSeleccionada,0);
            Statement st = con.createStatement();
            int n = st.executeUpdate(SQL);
            if (n>=0){
                 JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "no es posible eliminar datos, si no seleccionan el registro o lo digitan");
        }
          }
    }
    public void limpiarCajas(){
   
    txtID.setText("");
    txtNcom.setText("");
    txtNlegal.setText("");
    txtMatprim.setText("");
    txtCporU.setText("");
    txtPrecioU.setText("");
    txtPrecioT.setText("");
    txtTel.setText("");
}

        public void insertarDatos(){
          if (txtID.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Error Campos Vacios, No es posible insertar datos vacios, Verifique que los datos esten correctos");
        }else{       
        try{
        String SQL = "insert into proveedores (ID,Nombre_legal,Nombre_comercial, Materia_prima,Cantidadxunidad, Precio_unitario, Precio_total,Telefono) values(?,?,?,?,?,?,?,?)";    
        ps = con.prepareStatement(SQL);        
        //Envia lo que se ingresa en el cuadro de texto
        ps.setString(1, txtID.getText());
        ps.setString(2, txtNcom.getText());
        ps.setString(3, txtNlegal.getText());
        ps.setString(4, txtMatprim.getText());
        ps.setString(5, txtCporU.getText());
        ps.setString(6, txtPrecioU.getText());
        ps.setString(7, txtPrecioT.getText());
        ps.setString(8, txtTel.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro excitoso");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "no es posible insertar datos, si existen campos vacios");
    }
          }
}
  
        public void actualizarDatos(){
     if (txtID.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Error campo vacio, no es posible actualizar un campo vacio, Verifique que los datos esten correctos");
        }else{ 
     String SQL = "update proveedores set  Nombre_legal=?,Nombre_comercial=?,Materia_prima=?,Cantidadxunidad=?,Precio_unitario=?,Precio_total=?,Telefono =? where ID=?";
     if (txtID.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Error al actualizar, registro no encontrado");
        }else{    
     try{
       ps = con.prepareStatement(SQL);

        //Envia lo que se ingresa en el cuadro de texto
        ps.setString(1,txtID.getText());
        ps.setString(2, txtNcom.getText());
        ps.setString(3, txtNlegal.getText());
        ps.setString(4, txtMatprim.getText());
        ps.setString(5, txtCporU.getText());
        ps.setString(6,txtPrecioU.getText());
        ps.setString(7, txtPrecioT.getText());
        ps.setString(8,txtTel.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Actualizacion excitosa");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "no es posible Actualizar datos, si existen campos vacios");
    }
    }
    } 
}
  
        public void mostrarDatos(){
        //Titulos de la Tabla
        String[]titulos = {"ID","Nombre_legal", "Nombre_comercial", "Cantidadxunidad","Precio_unitario", "Precio_total","Telefono"};
        String[]registros = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        String SQL= "select * from proveedores";
   try{
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(SQL);
       while (rs.next()){
       //Titulos de la base de datos
       registros[0]= rs.getString("ID");
       registros[1]= rs.getString("Nombre_legal");
       registros[2]= rs.getString("Nombre_comercial");
       registros[3]= rs.getString("Cantidadxunidad");
       registros[4]= rs.getString("Precio_unitario");
       registros[5]= rs.getString("Precio_total");
       registros[6]= rs.getString("Telefono");
       modelo.addRow(registros);
       }
       Table.setModel(modelo);
   }catch(Exception e){
       JOptionPane.showMessageDialog(null, "Error al Mostrar Datos ");
   }
    }
     
    //Variables que llamamos para dar color a los botones
     void setColor(JPanel panel){
    panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JPanel btnActualizar;
    private javax.swing.JPanel btnAñadir;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCporU;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMatprim;
    private javax.swing.JTextField txtNcom;
    private javax.swing.JTextField txtNlegal;
    private javax.swing.JTextField txtPrecioT;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
