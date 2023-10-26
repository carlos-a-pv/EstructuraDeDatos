package estructura_base;

public class PilaCola<E> {
    Pila<E> pila;
    Cola<E> cola;

    public PilaCola(Pila<E> pila, Cola<E> cola) {
        this.pila = pila;
        this.cola = cola;
    }

    public Pila<E> getPila() {
        return pila;
    }

    public void setPila(Pila<E> pila) {
        this.pila = pila;
    }

    public Cola<E> getCola() {
        return cola;
    }

    public void setCola(Cola<E> cola) {
        this.cola = cola;
    }
}
