public class Nodo <E> {

    Nodo nextNode;
    //Nodo<E> nextNode;
    int valueNode;

    public Nodo(int value){
        this.valueNode = value;
        this.nextNode = null;
    }

    public Nodo getNextNode() {
        return nextNode;
    }

    public void setNextNode(Nodo nextNode) {
        this.nextNode = nextNode;
    }

    public int getValueNode() {
        return valueNode;
    }

    public void setValueNode(int valueNode) {
        this.valueNode = valueNode;
    }
}
