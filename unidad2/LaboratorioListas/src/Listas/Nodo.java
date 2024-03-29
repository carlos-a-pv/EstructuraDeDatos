package Listas;

public class Nodo <E> {


    Nodo<E> nextNode;
    E valueNode;

    public Nodo(E value){
        this.valueNode = value;
        this.nextNode = null;
    }

    public Nodo getNextNode() {
        return nextNode;
    }

    public void setNextNode(Nodo nextNode) {
        this.nextNode = nextNode;
    }

    public E getValueNode() {
        return valueNode;
    }

    public void setValueNode(E valueNode) {
        this.valueNode = valueNode;
    }
}
