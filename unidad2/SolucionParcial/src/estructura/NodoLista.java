package estructura;

public class NodoLista {

    int dato;
    NodoLista sig;

    public NodoLista(int x, NodoLista n){
        dato = x;
        sig = n;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }
}
