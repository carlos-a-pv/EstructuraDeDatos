import org.w3c.dom.Node;

import javax.print.DocFlavor;

public class Pila<E> {

    //LIFO --> last in fisrt out


    private Nodo<E> firstNode;
    private int size;

    public Pila(){
        this.firstNode = null;
        this.size = 0;
    }

    //apilar --> add to end
    public void apilar(E value){
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


    //desapilar --> pop to end

    public Nodo<E> desapilar() throws Exception {
        Nodo aux = firstNode;
        if(aux == null){
            throw new Exception("La pila esta vacía!");
        }else{
            if(aux.getNextNode() == null){
                return firstNode;
            }else{
                for (int i = 1; i < size-1; i++) {
                    aux = aux.getNextNode();
                }
                Nodo nodoDesapilado = aux.getNextNode();
                aux.setNextNode(null);
                size--;
                return nodoDesapilado;
            }
        }
    }

    public boolean isEmpty(){
        return (size == 0)?true:false;
    }

    public void printPila(){
        Nodo aux = firstNode;

        for (int i = 0; i < size; i++) {
            if(aux.getNextNode() == null){
                System.out.print(aux.getValueNode());
            }else{
                System.out.println(aux.getValueNode());
                aux = aux.getNextNode();
            }

        }
    }

}
