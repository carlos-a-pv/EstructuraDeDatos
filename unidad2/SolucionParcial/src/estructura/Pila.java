package estructura;

public class Pila<E> {

    //LIFO --> last in fisrt out


    private Nodo<E> peek;
    private int size;

    public Pila(){
        this.peek = null;
        this.size = 0;
    }

    //apilar --> add to end
    public void push(E value){
        Nodo<E> nodo = new Nodo<>(value);
        nodo.setSiguienteNodo(peek);
        peek = nodo;

        size++;
        /*Nodo newNode =  new Nodo(value);
        Nodo aux = peek;

        if(isEmpty()){
            peek = newNode;
        }else{
            for (int i = 0; i < size; i++) {
                if(aux.getNextNode() == null){
                    aux.setNextNode(newNode);
                }else{
                    aux = aux.getNextNode();
                }
            }
        }
        size++;*/
    }


    //desapilar --> pop to end

    public E pop() throws Exception {
        if(isEmpty()) {
            throw new RuntimeException("La Pila está vacía");
        }
        E dato = peek.getValorNodo();
        peek = peek.getSiguienteNodo();
        size--;
        return dato;
    }

    public boolean isEmpty(){
        return (size == 0)?true:false;
    }

    public void printPila(){
        Nodo aux = peek;

        for (int i = 0; i < size; i++) {
            if(aux.getSiguienteNodo() == null){
                System.out.print(aux.getValorNodo());
            }else{
                System.out.print(aux.getValorNodo()+"\t");
                aux = aux.getSiguienteNodo();
            }

        }
    }

    public Nodo<E> getPeek() {
        return peek;
    }

    public void setPeek(Nodo<E> peek) {
        this.peek = peek;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
