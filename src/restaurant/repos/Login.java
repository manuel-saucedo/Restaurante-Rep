/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant.repos;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import SQLConexion.Conexion;
import java.awt.Color;
import java.beans.Statement;

/**
 *
 * @author Arima
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int xMouse, yMouse;
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGraund = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        Leave = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BackGraund.setBackground(new java.awt.Color(255, 255, 255));
        BackGraund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        BackGraund.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 70, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        BackGraund.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, -1));

        txtuser.setForeground(new java.awt.Color(204, 204, 204));
        txtuser.setText("Ingrese Nombre de Usuario");
        txtuser.setToolTipText("");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });
        BackGraund.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 250, 20));

        txtpass.setForeground(new java.awt.Color(204, 204, 204));
        txtpass.setText("********");
        txtpass.setBorder(null);
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpassMousePressed(evt);
            }
        });
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        BackGraund.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 250, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        BackGraund.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 250, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        BackGraund.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 250, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Rest.jpeg"))); // NOI18N
        BackGraund.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });
        BackGraund.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        Leave.setBackground(new java.awt.Color(255, 255, 255));
        Leave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Leave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeaveMouseExited(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 255, 255));
        txtExit.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtExit.setText("X");
        Leave.add(txtExit);

        BackGraund.add(Leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 40, 30));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login_circle_icon_206018.png"))); // NOI18N
        btnLogin.add(jLabel5);

        BackGraund.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 60, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel6.setText("INICIAR SESIÓN");
        BackGraund.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        getContentPane().add(BackGraund, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void LeaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LeaveMouseClicked

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse );
    }//GEN-LAST:event_BarraMouseDragged

    private void LeaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMouseEntered
        Leave.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_LeaveMouseEntered

    private void LeaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeaveMouseExited
        Leave.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_LeaveMouseExited

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

       String user ="admin";
       String pass ="12345";
       
       String Pass = new String(txtpass.getPassword());
       
       if(txtuser.getText().equals(user) && Pass.equals(pass)){
           Home home = new Home();
           home.setVisible(true);
           dispose();
       }else{
           JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecto");
       } 
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        // TODO add your handling code here:
        if(txtuser.getText().equals("Ingrese Nombre de Usuario")){
        txtuser.setText("");
        txtuser.setForeground(Color.black);
        }
        if(String.valueOf(txtpass.getPassword()).isEmpty()){
        txtpass.setText("********");
        txtpass.setForeground(Color.gray); 
        }
    }//GEN-LAST:event_txtuserMousePressed

    private void txtpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMousePressed
        if(String.valueOf(txtpass.getPassword()).equals("********")){
        txtpass.setText("");
        txtpass.setForeground(Color.black);  
        }
        if(txtuser.getText().isEmpty()){
        txtuser.setText("Ingrese Nombre de Usuario");
        txtuser.setForeground(Color.gray);  
            
        }
    }//GEN-LAST:event_txtpassMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGraund;
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Leave;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtExit;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
