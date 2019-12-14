
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;


public class FrmEdit extends javax.swing.JFrame {

    String datos;
    Usuario us;
    
    public FrmEdit(Usuario user) {
        initComponents();
        us=user;
        this.setLocationRelativeTo(null);
        setDatos();
    }
    
    public String getCarrera(String carrera) throws Exception{
        if (carrera.equals("-Seleccionar-")) {
            throw new Exception();
        } else {
            return carrera;
        }
    }
    
    public void setDatos(){
        String nombre=us.getNombre();
        if(!nombre.equals("")){
            txtNombre.setText(us.getNombre());
            spnEdad.setValue(Integer.parseInt(us.getEdad()));
            txtCorreo.setText(us.getCorreo());
            boxCarrera.setSelectedItem(us.getCarrera());
            spnSemestre.setValue(Integer.parseInt(us.getSemestre()));
        }
    }
    
    public void GuardarDatosUsuario(){
        datos=us.getNumCtrl()+"D";
        ObjectOutputStream guar; 
        String nombre=us.getNombre();
        String edad=us.getEdad();
        String correo=us.getCorreo();
        String carrera=us.getCarrera();
        String semestre=us.getSemestre();
        try {
            guar = new ObjectOutputStream(new FileOutputStream(datos));
            guar.writeObject(nombre);
            guar.writeObject(edad);
            guar.writeObject(correo);
            guar.writeObject(carrera);
            guar.writeObject(semestre);
            this.dispose();
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error. "+ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        boxCarrera = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        spnEdad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spnSemestre = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semestre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 220, -1));

        boxCarrera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Arquitectura", "IDI", "IGE", "ISC", "IngInd", "IngInf", "LA" }));
        getContentPane().add(boxCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 220, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        spnEdad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnEdad.setModel(new javax.swing.SpinnerNumberModel(16, 16, 30, 1));
        getContentPane().add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carrera:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        spnSemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        getContentPane().add(spnSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{    
            String nombre=txtNombre.getText();
            String edad=spnEdad.getValue().toString();
            String correo=txtCorreo.getText();
            String carrera=boxCarrera.getSelectedItem().toString();
            String semestre=spnSemestre.getValue().toString();
            us.setDatos(nombre, edad, correo, getCarrera(carrera), semestre);
            GuardarDatosUsuario();
            new FrmMain(us).setVisible(true);
            this.dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error. Faltan datos.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCarrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnSemestre;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
