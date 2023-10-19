public class Cola<E> {

    //FIFO --> first in first out

    private Nodo<E> firstNode;
    private int size;

    public Cola(){
        this.firstNode = null;
        this.size = 0;
    }

    //metodo encolar
    public void encolar(E value){
        Nodo newNode =  new Nodo(value);
        Nodo aux = firstNode;

        if(isEmpty()){
            firstNode = newNode;
        }else{
            for (int i = 0; i < size; i++) {
                if(aux.getNextNode() == null){
                    aux.setNextNode(newNode);

                }else{
                    aux = aux.getNextNode();
                }
            }
        }
        size++;
    }

    //metodo desencolar
    public Nodo<E> desencolar() throws Exception {
        if(firstNode != null){
            Nodo nodoDesencolado = firstNode;
            firstNode = firstNode.nextNode;
            size--;
            return nodoDesencolado;
        }else{
            throw new Exception("LA COLA ESTA VACIA");
        }
    }

    public boolean isEmpty(){
        return (size == 0)?true:false;
    }

    public void printCola(){
        Nodo aux = firstNode;

        for (int i = 0; i < size; i++) {
            if(aux.getNextNode() == null){
                System.out.print(aux.getValueNode());
            }else{
                System.out.print(aux.getValueNode()+",");
                aux = aux.getNextNode();
            }

        }
    }
}
