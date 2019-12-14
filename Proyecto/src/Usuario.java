
public class Usuario {
    
    String numCtrl;
    String contraseña;
    String nombre;
    String edad;
    String correo;
    String carrera;
    String semestre;

    public Usuario(String numCtrl, String contraseña) {
        this.numCtrl = numCtrl;
        this.contraseña = contraseña;
        this.nombre="";
        this.edad="";
        this.correo="";
        this.carrera="";
        this.semestre="";
    }

    public Usuario() {
        this.nombre="";
        this.edad="";
        this.correo="";
        this.carrera="";
        this.semestre="";
    }
    
    public String getNumCtrl() {
        return numCtrl;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNumCtrl(String numCtrl) {
        this.numCtrl = numCtrl;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public void setDatos(String nombre, String edad, String correo, String carrera, String semestre){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
}
