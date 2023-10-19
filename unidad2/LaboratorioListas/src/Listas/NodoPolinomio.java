package Listas;

public class NodoPolinomio<T> {

    private NodoPolinomio<T> nextNode;
    private T coeficiente;
    private T exponente;

    public NodoPolinomio(T value1, T value2){
        this.coeficiente = value1;
        this.exponente = value2;
        this.nextNode = null;
    }

    public NodoPolinomio<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodoPolinomio<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(T coeficiente) {
        this.coeficiente = coeficiente;
    }

    public T getExponente() {
        return exponente;
    }

    public void setExponente(T exponente) {
        this.exponente = exponente;
    }
}
