package Listas;

public class ListaPolinomio<E> {

    private NodoPolinomio<E> firstNode;
    private int size;


    public ListaPolinomio(){
        this.firstNode = null;
        this.size = 0;
    }
    //Add to start of the list
    public void addToStart(E value, E value2){
        NodoPolinomio newNode = new NodoPolinomio(value, value2);

        if(isEmpty()){
            firstNode = newNode;
        }else{
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
        size++;
    }
    //Add to end of the list
    public void addToEnd(NodoPolinomio value){
        NodoPolinomio newNode =  new NodoPolinomio(value.getCoeficiente(), value.getExponente());
        NodoPolinomio aux = firstNode;

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

    //add to specific position of the list
    public void addToSpecificPosition(int value, int position){

    }

    //print the elements of the list

    public boolean isEmpty(){
        return (size == 0)?true:false;

        /*if(size == 0){
            return true;
        }else{
            return false;
        }*/
    }


    private boolean isIndexValid(int i) {
        if( i >= 0 && i <= size ) {
            return true;
        }
        throw new RuntimeException("Índice no válido");
    }

    public int getSize(){
        return this.size;
    }



    /*public void recorrerLista(){
        for(Nodo aux = firstNode; aux != null; aux = aux.getNextNode()){

        }
    }*/

    public void recorrerRecursivamenteLista(Nodo aux) {
        if( aux == null){
            System.out.println("terminó");
        }else{
            recorrerRecursivamenteLista(aux.getNextNode());
        }
    }

    public void printList() {

        NodoPolinomio aux = firstNode;

        while(aux != null){
            System.out.print(aux.getCoeficiente()+"|"+aux.getExponente()+"-> ");
            aux = aux.getNextNode();
        }
    }

    public NodoPolinomio<E> getNode(int i) {
        if(i == 0){
            return firstNode;
        }else{
            int cont = 0;
            NodoPolinomio aux = firstNode;
            if(isIndexValid(i)){
                while (cont != i){
                    aux = aux.getNextNode();
                    cont++;
                }
            }
            return aux;
        }
    }
}
