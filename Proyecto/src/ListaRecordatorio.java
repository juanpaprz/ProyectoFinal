
public class ListaRecordatorio {
    
    private String titulo;
    private String fecha;
    private String hora;

    public ListaRecordatorio() {
        
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getDatos(){
        return titulo+" | "+fecha+" | "+hora;
    }
    
    public void setDatos(String titulo, String fecha, String hora){
        this.titulo=titulo;
        this.fecha=fecha;
        this.hora=hora;
    }
    
}
