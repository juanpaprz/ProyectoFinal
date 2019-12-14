
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmNotas extends javax.swing.JFrame {
    
    Usuario us;
    String h;
    ListaRecordatorio list1=new ListaRecordatorio();
    ListaDoble<String> arrayNotas;
    DefaultListModel model;

    public FrmNotas(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        us=user;
        h=us.getNumCtrl()+"n";
        genArraya();
        mostrarPrimera();
    }
    
    public void genArraya(){
         ObjectInputStream tra;
         arrayNotas=new ListaDoble<String>();
        try{
            tra = new ObjectInputStream(new FileInputStream(h));
            while (!tra.equals(null)) {
                Object arrayCont = tra.readObject();
                arrayNotas.add(arrayCont.toString());
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void mostrarNotas(){
        ObjectInputStream tra;
        model=new DefaultListModel();
        try{
            tra = new ObjectInputStream(new FileInputStream(h));
            for (int i = 0; i < arrayNotas.size(); i++) {
                Object nots = tra.readObject();
                model.addElement(nots);
            }
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
        listNotas.setModel(model);
    }
    
    public void mostrarPrimera(){
        ObjectInputStream tra;
        model=new DefaultListModel();
        try{
            tra = new ObjectInputStream(new FileInputStream(h));
            for (int i = 0; i < arrayNotas.size(); i++) {
                Object nots = tra.readObject();
                model.addElement(nots);
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
        listNotas.setModel(model);
    }
    
    public void actualizarArray(){
        ObjectOutputStream guar;
        try{
            guar = new ObjectOutputStream(new FileOutputStream(h));
            for (int i = 0; i < arrayNotas.size(); i++) {
                try {
                    guar.writeObject(arrayNotas.getAt(i));
                } catch (Exception ex) {
                    Logger.getLogger(FrmNotas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listNotas = new javax.swing.JList<>();
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

        btnV.setBackground(new java.awt.Color(255, 255, 255));
        btnV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnV.setText("Ver Nota");
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });
        getContentPane().add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnC.setText("Crear Nota");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Borrar Nota");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        listNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(listNotas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        genArraya();
        mostrarNotas();
    }//GEN-LAST:event_btnVActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        new FrmNewNota(us).setVisible(true);
    }//GEN-LAST:event_btnCActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=listNotas.getSelectedIndex();
        try {
            arrayNotas.deleteAt(x);
        } catch (Exception ex) {
            Logger.getLogger(FrmNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        actualizarArray();
        genArraya();
        mostrarNotas();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new FrmMain(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listNotas;
    // End of variables declaration//GEN-END:variables

}
