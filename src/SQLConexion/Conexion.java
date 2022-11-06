/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConexion;


import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author Arima
 */
public class Conexion {
    
   Connection conectar = null;
public Connection conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/restaurant_disi","root","");
        JOptionPane.showMessageDialog(null, "Conexion exitosa");
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
    }
    return conectar;
    
    }

}
