/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package restaurant.repos;
import SQLConexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JPCartaMenu extends javax.swing.JPanel {
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

    public JPCartaMenu() {
        initComponents();
        MD();
    }
    
    public void MD(){//Muestra los datos guardados en mysql
        //Nombre de los campos en las tablas
        String[]Campos = {"Nombre", "Precio", "Descripcion"};
        String[]Registro = new String[3];//Espacio para registrar los campos de la tabla
        String[]Registro2 = new String[3];//Espacio para registrar los campos de la tabla
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
                //Registro[0]= rs.getString("ID");
                Registro[0]= rs.getString("Nombre");
                Registro[1]= rs.getString("Precio");
                Registro[2]= rs.getString("Descripcion");
                modelo_comida.addRow(Registro);
            }
            //Agrega los registros de la tabla bebidas de sql a la tabla
            ST = con.createStatement();
            RS = ST.executeQuery(SQL2);
            while (RS.next()){
                //Titulos de la base de datos
                //Registro2[0]= RS.getString("ID");
                Registro2[0]= RS.getString("Nombre");
                Registro2[1]= RS.getString("Precio");
                Registro2[2]= RS.getString("Descripcion");
                modelo_bebida.addRow(Registro2);
            }
        //Coloca el modelos hechos anteriormente a las tablas
        Tabla_Comida.setModel(modelo_comida);
        Tabla_Bebida.setModel(modelo_bebida);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Mostrar Datos, Base de datos no activada");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Comida = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Bebida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Comida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Comida);

        Tabla_Bebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla_Bebida);

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel1.setText("COMIDAS");

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel2.setText("Y COMBOS");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel3.setText("BEBIDAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Bebida;
    private javax.swing.JTable Tabla_Comida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
