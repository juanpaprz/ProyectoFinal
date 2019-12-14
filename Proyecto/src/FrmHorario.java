
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class FrmHorario extends javax.swing.JFrame {

    Usuario us;
    DefaultTableModel defaultmodel;
    
    
    public FrmHorario(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        us=user;
        panel.setVisible(false);
        btnGuardar.setVisible(false);
        btnEditar.setVisible(false);
        TablaDefault();
    }
    
    public void GuardadDatos(TableModel model, String n ){
        ObjectOutputStream guar;
        try {
            String c = us.getNumCtrl()+n;
            guar = new ObjectOutputStream(new FileOutputStream(c));
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 6; j++) {
                    guar.writeObject(model.getValueAt(i, j));
                }
            }
            JOptionPane.showMessageDialog(null, "Horario guardado con éxito");
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
        panel.setVisible(false);
        btnGuardar.setVisible(false);
        btnConsultar.setEnabled(true);
    }
    
    public void ConsultarDatos(TableModel model, String n){
        ObjectInputStream tra;
        try {
            String c=us.getNumCtrl()+n;
            tra = new ObjectInputStream(new FileInputStream(c));
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 6; j++) {
                    Object modelo = tra.readObject();
                    model.setValueAt(modelo, i, j);
                }
            }
            horario.setModel(model);
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha creado horario para este semestre");
        }
        panel.setVisible(true);
        btnEditar.setVisible(true);
    }
    
    public void TablaDefault(){
        int x=0;
        defaultmodel=new DefaultTableModel();
        if(x==0){
            defaultmodel=(DefaultTableModel) horario.getModel();
            x++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JButton();
        boxSem = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        panel = new javax.swing.JScrollPane();
        horario = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jToggleButton1.setText("Atrás");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        boxSem.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        boxSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "1ro", "2do", "3ro", "4to", "5to", "6to", "7mo", "8vo", "9no" }));
        boxSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSemActionPerformed(evt);
            }
        });
        getContentPane().add(boxSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        horario.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:00-8:00", "  ", " ", " ", " ", " "},
                {"8:00-9:00", "  ", " ", " ", " ", " "},
                {"9:00-10:00", "  ", " ", " ", " ", " "},
                {"10:00-11:00", " ", " ", "  ", " ", " "},
                {"11:00-12:00", " ", " ", " ", " ", " "},
                {"12:00-13:00", " ", " ", " ", " ", " "},
                {"13:00-14:00", " ", " ", " ", " ", " "},
                {"14:00-15:00", null, null, null, null, null},
                {"15:00-16:00", null, null, null, null, null},
                {"16:00-17:00", null, null, null, null, null},
                {"17:00-18:00", null, null, null, null, null},
                {"18:00-19:00", null, null, null, null, null},
                {"19:00-20:00", null, null, null, null, null}
            },
            new String [] {
                "Horario", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        panel.setViewportView(horario);

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 560, 250));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semestre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        new FrmMain(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String semestre=boxSem.getSelectedItem().toString();
        String n;
        switch(semestre){
            case "1ro":
                n="1";
                TableModel model1;
                model1=horario.getModel();
                GuardadDatos(model1, n);
                break;
            case "2do":
                n="2";
                TableModel model2;
                model2=horario.getModel();
                GuardadDatos(model2, n);
                break;
            case "3ro":
                n="3";
                TableModel model3;
                model3=horario.getModel();
                GuardadDatos(model3, n);
                break;
            case "4to":
                n="4";
                TableModel model4;
                model4=horario.getModel();
                GuardadDatos(model4, n);
                break;
            case "5to":
                n="5";
                TableModel model5;
                model5=horario.getModel();
                GuardadDatos(model5, n);
                break;
            case "6to":
                n="6";
                TableModel model6;
                model6=horario.getModel();
                GuardadDatos(model6, n);
                break;
            case "7mo":
                n="7";
                TableModel model7;
                model7=horario.getModel();
                GuardadDatos(model7, n);
                break;
            case "8vo":
                n="8";
                TableModel model8;
                model8=horario.getModel();
                GuardadDatos(model8, n);
                break;
            case "9no":
                n="9";
                TableModel model9;
                model9=horario.getModel();
                GuardadDatos(model9, n);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione un semestre");
                break;  
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        panel.setVisible(true);
        horario.setModel(defaultmodel);
        btnGuardar.setVisible(true);
        btnConsultar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String semestre=boxSem.getSelectedItem().toString();
        String n;
        switch(semestre){
            case "1ro":
                DefaultTableModel model1=new DefaultTableModel();
                model1=defaultmodel;
                n="1";
                ConsultarDatos(model1, n);
                break;
            case "2do":
                DefaultTableModel model2=new DefaultTableModel();
                model2=defaultmodel;
                n="2";
                ConsultarDatos(model2, n);
                break;
            case "3ro":
                DefaultTableModel model3=new DefaultTableModel();
                model3=defaultmodel;
                n="3";
                ConsultarDatos(model3, n);
                break;
            case "4to":
                DefaultTableModel model4=new DefaultTableModel();
                model4=defaultmodel;
                n="4";
                ConsultarDatos(model4, n);
                break;
            case "5to":
                DefaultTableModel model5=new DefaultTableModel();
                model5=defaultmodel;
                n="5";
                ConsultarDatos(model5, n);
                break;
            case "6to":
                DefaultTableModel model6=new DefaultTableModel();
                model6=defaultmodel;
                n="6";
                ConsultarDatos(model6, n);
                break;
            case "7mo":
                DefaultTableModel model7=new DefaultTableModel();
                model7=defaultmodel;
                n="7";
                ConsultarDatos(model7, n);
                break;
            case "8vo":
                DefaultTableModel model8=new DefaultTableModel();
                model8=defaultmodel;
                n="8";
                ConsultarDatos(model8, n);
                break;
            case "9no":
                DefaultTableModel model9=new DefaultTableModel();
                model9=defaultmodel;
                n="9";
                ConsultarDatos(model9, n);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione un semestre");
                break;
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
        
    private void boxSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSemActionPerformed
        String semestre=boxSem.getSelectedItem().toString();
        if(semestre.equals("-Seleccionar-")){
            panel.setVisible(false);
            horario.setModel(defaultmodel);
            btnEditar.setVisible(false);
        }
    }//GEN-LAST:event_boxSemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSem;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTable horario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JScrollPane panel;
    // End of variables declaration//GEN-END:variables
}
