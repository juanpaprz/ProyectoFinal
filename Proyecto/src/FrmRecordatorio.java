
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class FrmRecordatorio extends javax.swing.JFrame {

    Usuario us;
    String c;
    ListaRecordatorio list=new ListaRecordatorio();
    DefaultListModel model;
    ListaDoble<String> record;
    
    public FrmRecordatorio(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        us=user;
        c=us.getNumCtrl()+"r";
        genArray();
        mostrarPrimera();
    }
    
    public void genArray(){
         ObjectInputStream tra;
         record=new ListaDoble<String>();
        try{
            tra = new ObjectInputStream(new FileInputStream(c));
            while (!tra.equals(null)) {
                Object arrayCont = tra.readObject();
                record.add(arrayCont.toString());
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void mostrarPrimera(){
        ObjectInputStream tra;
        model=new DefaultListModel();
        try{
            tra = new ObjectInputStream(new FileInputStream(c));
            for (int i = 0; i < record.size(); i++) {
                Object records = tra.readObject();
                model.addElement(records);
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
        listRecord.setModel(model);
    }
    
    public void mostrarRecords(){
        ObjectInputStream tra;
        model=new DefaultListModel();
        try{
            tra = new ObjectInputStream(new FileInputStream(c));
            for (int i = 0; i < record.size(); i++) {
                Object records = tra.readObject();
                model.addElement(records);
            }
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
        listRecord.setModel(model);
    }
    
    public void actualizarArray(){
        ObjectOutputStream guar;
        try{
            guar = new ObjectOutputStream(new FileOutputStream(c));
            for (int i = 0; i < record.size(); i++) {
                try {
                    guar.writeObject(record.getAt(i));
                } catch (Exception ex) {
                    Logger.getLogger(FrmRecordatorio.class.getName()).log(Level.SEVERE, null, ex);
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listRecord = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
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

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jToggleButton1.setText("Atrás");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Actualizar lista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 170, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Nuevo recordatorio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, -1));

        listRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(listRecord);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 320));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Borrar recordatorio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new FrmMain(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        genArray();
        mostrarRecords();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new FrmNewRec(us).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x=listRecord.getSelectedIndex();
        try {
            record.deleteAt(x);
        } catch (Exception ex) {
            Logger.getLogger(FrmRecordatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        actualizarArray();
        genArray();
        mostrarRecords();
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList<String> listRecord;
    // End of variables declaration//GEN-END:variables
}
