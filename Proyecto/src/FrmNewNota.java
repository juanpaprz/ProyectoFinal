
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmNewNota extends javax.swing.JFrame{
    
    Usuario us;
    String c;
    ListaNotas list=new ListaNotas();
    ListaDoble<String> arrayNotas=new ListaDoble<String>();

    public FrmNewNota(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        us=user;
        c=us.getNumCtrl()+"n";
        genArray();
        txtNota.setLineWrap(true);
        txtNota.setWrapStyleWord(true);
    }
    
    public void genArray(){
         ObjectInputStream tra;
        try{
            tra = new ObjectInputStream(new FileInputStream(c));
            while (!tra.equals(null)) {
                Object arrayCont = tra.readObject();
                arrayNotas.add(arrayCont.toString());
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void guardadNotas(){
        ObjectOutputStream guar;
        arrayNotas.add(list.getDatos());
        try{
            guar = new ObjectOutputStream(new FileOutputStream(c));
            for (int i = 0; i < arrayNotas.size(); i++) {
                try {   
                    guar.writeObject(arrayNotas.getAt(i));
                } catch (Exception ex) {
                    Logger.getLogger(FrmNewNota.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
    }
    
    public int arraySize(){
        return arrayNotas.size();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar Nota");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNota.setRows(5);
        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        list.setDatos(txtNota.getText());
        guardadNotas();
        JOptionPane.showMessageDialog(null, "Nota creada");
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        new FrmNotas(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyTyped
        
    }//GEN-LAST:event_txtNotaKeyTyped

    private void txtNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtNota.append(" ");
        }
    }//GEN-LAST:event_txtNotaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables
}
