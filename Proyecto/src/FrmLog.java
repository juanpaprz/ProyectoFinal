
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;


public class FrmLog extends javax.swing.JFrame {

    Usuario user;
    
    public FrmLog() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void Login(){
        String nCtrl=numCtrl.getText();
        String cont=contra.getText();
        user=new Usuario(nCtrl, cont);
        ObjectInputStream tra;
        try {
            tra = new ObjectInputStream(new FileInputStream(nCtrl));
            Object con = tra.readObject();
            if(cont.equals(con.toString())){
                new FrmMain(user).setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
            }   
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        numCtrl = new javax.swing.JTextField();
        lblContra = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        lblRegister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login_png_812312 (2).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Número de control:");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        numCtrl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(numCtrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, -1));

        lblContra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblContra.setForeground(new java.awt.Color(255, 255, 255));
        lblContra.setText("Contraseña:");
        getContentPane().add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, -1));

        contra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraKeyPressed(evt);
            }
        });
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, -1));

        lblRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 255, 255));
        lblRegister.setText("Registrar");
        lblRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblRegisterFocusGained(evt);
            }
        });
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegisterMousePressed(evt);
            }
        });
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void lblRegisterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblRegisterFocusGained

    }//GEN-LAST:event_lblRegisterFocusGained

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        new FrmRegister().setVisible(true);
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setForeground(Color.blue);
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setForeground(Color.white);
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMousePressed

    }//GEN-LAST:event_lblRegisterMousePressed

    private void contraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_contraKeyPressed

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
            java.util.logging.Logger.getLogger(FrmLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField numCtrl;
    // End of variables declaration//GEN-END:variables
}
