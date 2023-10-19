package Listas;

public class Lista<E> {

    private Nodo<E> firstNode;
    private int size;


    public Lista(){
        this.firstNode = null;
        this.size = 0;
    }
    //Add to start of the list
    public void addToStart(E value){
        Nodo newNode = new Nodo(value);

        if(isEmpty()){
            firstNode = newNode;
        }else{
            newNode.setNextNode(firstNode);
            firstNode = newNode;
        }
        size++;
    }
    //Add to end of the list
    public void addToEnd(E value){
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

    //add to specific position of the list
    public void addToSpecificPosition(int value, int position){

    }

    //print the elements of the list
    public void printList(){
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
    public boolean isEmpty(){
        return (size == 0)?true:false;

        /*if(size == 0){
            return true;
        }else{
            return false;
        }*/
    }

    public Nodo getNode(int i){
        if(i == 0){
            return firstNode;
        }else{
            Nodo aux = null;
            int cont = 0;

            if(isIndexValid(i)){
                aux = firstNode;
                while (cont < i){
                    aux = aux.getNextNode();
                    cont++;
                }
            }
            if(aux != null){
                return aux;
            }else{
                return null;
            }
        }
    }

    public E getValueNode(int index) {

        Nodo<E> temporalNode = null;
        int cont = 0;

        if(isIndexValid(index)) {
            temporalNode = firstNode;
            while (cont < index) {
                temporalNode = temporalNode.getNextNode();
                cont++;
            }
        }
        if(temporalNode != null)
            return temporalNode.getValueNode();
        else
            return null;
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

    public void remove(int index) {
        if(isIndexValid(index)){
            Nodo aux = firstNode;
            for (int i = 0; i < index-1; i++) {
                aux = aux.getNextNode();
            }
            Nodo nextNode = aux.getNextNode().getNextNode();
            aux.getNextNode().setNextNode(null);
            aux.setNextNode(nextNode);
        }else{
            throw new RuntimeException("Índice no válido");
        }

        size--;
    }

    public void recorrerLista(){
        for(Nodo aux = firstNode; aux != null; aux = aux.getNextNode()){

        }
    }

    public void recorrerRecursivamenteLista(Nodo aux)   {
        if( aux == null){
            System.out.println("terminó");
        }else{
            recorrerRecursivamenteLista(aux.getNextNode());
        }
    }

    //13. calcular maxima distancia recursivamente
    public int calcularMaximaDistancia(Nodo i, int clave, int dist, int cont, int maxDist){
        if(i == null){
            return maxDist;
        }else{
            if(i.getValueNode().equals(clave)){
                cont++;
            }
            if(cont == 1){
                return calcularMaximaDistancia(i.getNextNode(), clave, dist+1, cont, maxDist);
            }else if(cont == 2){
                cont = 1;
                if(dist > maxDist){
                    maxDist = dist;
                }
                dist = 0;
                return calcularMaximaDistancia(i.getNextNode(), clave, dist+1, cont, maxDist);
            }else{
                return  calcularMaximaDistancia(i.getNextNode(), clave, dist, cont, maxDist);
            }
        }
    }
}

