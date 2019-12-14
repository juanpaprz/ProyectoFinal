
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class FechasHorarios {

    String dia;
    DefaultTableModel modelo;
    Usuario us;
    String[] titulo=new String[2];
    String[] filas=new String[13];
    
    public FechasHorarios(Usuario user) {
        us=user;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }
    
    public void LeerHorarios(int a, int b, int c, int d, int e, int f, int g, int h, int j, int k, int l, int m, int n){
        String archivo=us.getNumCtrl()+us.getSemestre();
        titulo[0]="Hora";
        ObjectInputStream tra;
        try {
            tra = new ObjectInputStream(new FileInputStream(archivo));
            int x=0;
            modelo=new DefaultTableModel(null, titulo);
            for (int i = 0; i < 13; i++) {
                filas[i]="";
                modelo.addRow(filas);
            }
            for (int i = 0; i < 78; i++) {
                if(i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h||i==j||i==k||i==l||i==m||i==n){
                    modelo.setValueAt(tra.readObject(), x, 1);
                    x++;
                }else{
                    tra.readObject();
                }
            }
            modelo.setValueAt("7:00-8:00", 0, 0);
            modelo.setValueAt("8:00-9:00", 1, 0);
            modelo.setValueAt("9:00-10:00", 2, 0);
            modelo.setValueAt("10:00-11:00", 3, 0);
            modelo.setValueAt("11:00-12:00", 4, 0);
            modelo.setValueAt("12:00-13:00", 5, 0);
            modelo.setValueAt("13:00-14:00", 6, 0);
            modelo.setValueAt("14:00-15:00", 7, 0);
            modelo.setValueAt("15:00-16:00", 8, 0);
            modelo.setValueAt("16:00-17:00", 9, 0);
            modelo.setValueAt("17:00-18:00", 10, 0);
            modelo.setValueAt("18:00-19:00", 11, 0);
            modelo.setValueAt("19:00-20:00", 12, 0);
        }catch (IOException | ClassNotFoundException ex) {
        }
    }

    public void setModelo(String dia) {
        int a, b, c, d, e, f, g, h, j, k, l, m, n;
        switch(dia){
            case "Lunes":
                titulo[1]=dia;
                a=1;
                b=7;
                c=13;
                d=19;
                e=25;
                f=31;
                g=37;
                h=43;
                j=49;
                k=55;
                l=61;
                m=67;
                n=73;
                LeerHorarios(a, b, c, d, e, f, g, h, j, k, l, m, n);
                break;
            case "Martes":
                titulo[1]=dia;
                a=2;
                b=8;
                c=14;
                d=20;
                e=26;
                f=32;
                g=38;
                h=44;
                j=50;
                k=56;
                l=62;
                m=68;
                n=74;
                LeerHorarios(a, b, c, d, e, f, g, h, j, k, l, m, n);
                break;
            case "Miércoles":
                titulo[1]=dia;
                a=3;
                b=9;
                c=15;
                d=21;
                e=27;
                f=33;
                g=39;
                h=45;
                j=51;
                k=57;
                l=63;
                m=69;
                n=75;
                LeerHorarios(a, b, c, d, e, f, g, h, j, k, l, m, n);
                break;
            case "Jueves":
                titulo[1]=dia;
                a=4;
                b=10;
                c=16;
                d=22;
                e=28;
                f=34;
                g=40;
                h=46;
                j=52;
                k=58;
                l=64;
                m=70;
                n=76;
                LeerHorarios(a, b, c, d, e, f, g, h, j, k, l, m, n);
                break;
            case "Viernes":
                titulo[1]=dia;
                a=5;
                b=11;
                c=17;
                d=23;
                e=29;
                f=35;
                g=41;
                h=47;
                j=53;
                k=59;
                l=65;
                m=71;
                n=77;
                LeerHorarios(a, b, c, d, e, f, g, h, j, k, l, m, n);
                break;
            default:
                JOptionPane.showMessageDialog(null, "no hay clases");
                break;
        }
    }
    
}
