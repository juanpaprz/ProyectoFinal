
public class Nodo<T> {
    private T valor;
    Nodo siguiente;
    Nodo previo;

    public Nodo() {
        siguiente = null;
        previo = null;
    }

    public Nodo(T valor) {
        this.valor = valor;
        siguiente = null;
        previo = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}
