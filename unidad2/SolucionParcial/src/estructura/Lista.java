package estructura;

public class Lista {
    NodoLista inicio;
    int size;

    public Lista(){
        inicio = null;
    }

    public NodoLista getInicio() {
        return inicio;
    }

    public void setInicio(NodoLista inicio) {
        this.inicio = inicio;
    }

    //Add to end of the list
    public void addToEnd(int value){
        NodoLista newNode =  new NodoLista(value, null);
        NodoLista aux = inicio;

        if(isEmpty()){
            inicio = newNode;
        }else{
            for (int i = 0; i < size; i++) {
                if(aux.getSig() == null){
                    aux.setSig(newNode);

                }else{
                    aux = aux.getSig();
                }
            }
        }
        size++;
    }

    public boolean isEmpty(){
        return (size == 0)?true:false;
    }

    public void printList(){
        NodoLista aux = inicio;

        while (aux != null){
            System.out.print(aux.getDato()+",");
            aux = aux.getSig();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
