
import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmMain extends javax.swing.JFrame {

    Usuario us;
    String datos;
    FechasHorarios hor;
    String[] titulo=new String[1];
    
    public FrmMain(Usuario user) {
        initComponents();
        this.setLocationRelativeTo(null);
        lblNumCtrl.setText(user.getNumCtrl());
        us=user;
        LeerDatosUsuario();
        MostarDatosUsuario();
        CrearHorario();
    }
    
    public void LeerDatosUsuario(){
        datos=us.getNumCtrl()+"D";
        ObjectInputStream tra;
        try {
            tra = new ObjectInputStream(new FileInputStream(datos));
            Object nombre = tra.readObject();
            Object edad = tra.readObject();
            Object correo = tra.readObject();
            Object carrera = tra.readObject();
            Object semestre = tra.readObject();
            us.setDatos(nombre.toString(), edad.toString(), correo.toString(), carrera.toString(),semestre.toString());
        }catch (IOException | ClassNotFoundException ex) {
        }
    }
    
    public void MostarDatosUsuario(){
        datos=us.getNumCtrl()+"D";
        ObjectInputStream tra;
        try {
            tra = new ObjectInputStream(new FileInputStream(datos));
            Object nombre = tra.readObject();
            Object edad = tra.readObject();
            Object correo = tra.readObject();
            Object carrera = tra.readObject();
            Object semestre = tra.readObject();
            lblNombre.setText(nombre.toString());
            lblEdad.setText(edad.toString());
            lblCorreo.setText(correo.toString());
            lblCarrera.setText(carrera.toString());
            lblSemestre.setText(semestre.toString());
        }catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No olvides editar tu perfil para agregar tus datos indispensables", "IMPORTANTE", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public static String Fecha(){
        String[] dias={"Domingo","Lunes","Martes", "Miércoles","Jueves","Viernes","Sábado"};
        Date hoy=new Date();
        int numeroDia=0;
        Calendar cal= Calendar.getInstance();
        cal.setTime(hoy);
        numeroDia=cal.get(Calendar.DAY_OF_WEEK);
        String dia=dias[numeroDia - 1];
        return dia;
    }
    
    public boolean doArchivoExist(){
        if(!us.getSemestre().equals("")){
            ObjectInputStream buscar;
            String archi=us.getNumCtrl()+us.getSemestre();
            try{
                buscar=new ObjectInputStream(new FileInputStream(archi));
                return true;
            }catch(Exception e){
                return false;
            }
        }else{
            return false;
        }
    }
    
    public void CrearHorario(){
        if(doArchivoExist()){
            if(Fecha().equals("Domingo")||Fecha().equals("Sabado")){
                panelH.setVisible(false);
            }else{
                if(us.getSemestre().equals("")){
                    panelH.setVisible(false);
                }else{
                    hor=new FechasHorarios(us);
                    hor.setModelo(Fecha());
                    horario.setModel(hor.getModelo());
                }
            }
        } else {
            panelH.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNumCtrl = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSemestre = new javax.swing.JLabel();
        panelH = new javax.swing.JScrollPane();
        horario = new javax.swing.JTable();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semestre:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblNumCtrl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNumCtrl.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNumCtrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Horario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Notas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Recordatorio");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Cerrar sesión");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número de control:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo:");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 110, -1, -1));

        lblCarrera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCarrera.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        lblEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEdit.setForeground(new java.awt.Color(255, 255, 255));
        lblEdit.setText("Editar perfil");
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditMouseExited(evt);
            }
        });
        getContentPane().add(lblEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Carrera:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblSemestre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSemestre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        horario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        horario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        panelH.setViewportView(horario);

        getContentPane().add(panelH, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 270, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VtqUhJ.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new FrmLog().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new FrmHorario(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrmRecordatorio(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new FrmNotas(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        new FrmEdit(us).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblEditMouseClicked

    private void lblEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseEntered
        lblEdit.setForeground(Color.blue);
    }//GEN-LAST:event_lblEditMouseEntered

    private void lblEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseExited
        lblEdit.setForeground(Color.white);
    }//GEN-LAST:event_lblEditMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable horario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumCtrl;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JScrollPane panelH;
    // End of variables declaration//GEN-END:variables
}
