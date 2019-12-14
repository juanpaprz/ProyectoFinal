
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FrmNewRec extends javax.swing.JFrame{

    Usuario us;
    String c;
    ListaRecordatorio list=new ListaRecordatorio();
    ListaDoble<String> record=new ListaDoble<String>();
    
    public FrmNewRec(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        us=user;
        c=us.getNumCtrl()+"r";
        genArray();
    }
    
    public void genArray(){
         ObjectInputStream tra;
        try{
            tra = new ObjectInputStream(new FileInputStream(c));
            while (!tra.equals(null)) {
                Object arrayCont = tra.readObject();
                record.add(arrayCont.toString());
            }
        }catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void guardadRecords(){
        ObjectOutputStream guar;
        record.add(list.getDatos());
        try{
            guar = new ObjectOutputStream(new FileOutputStream(c));
            for (int i = 0; i < record.size(); i++) {
                try {
                    guar.writeObject(record.getAt(i));
                } catch (Exception ex) {
                    Logger.getLogger(FrmNewRec.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
    }
    
    public int arraySize(){
        return record.size();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        año = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        minuto = new javax.swing.JSpinner();
        hora = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Título:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 40, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Crear recordatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 220, -1, -1));

        año.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024" }));
        getContentPane().add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, -1));

        dia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 110, -1, -1));

        mes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" }));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        minuto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        getContentPane().add(minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title=titulo.getText();
        String date=dia.getSelectedItem().toString()+"/"+mes.getSelectedItem().toString()+"/"+año.getSelectedItem().toString();
        String h=hora.getValue().toString();
        String m=minuto.getValue().toString();
        if(h.length()==1){
            h="0"+h;
        }
        if(m.length()==1){
            m="0"+m;
        }
        String hour=h+":"+m;
        list.setDatos(title, date, hour);
        guardadRecords();
        JOptionPane.showMessageDialog(null, "Recordatorio creado");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        
    }//GEN-LAST:event_mesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JSpinner hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JSpinner minuto;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
