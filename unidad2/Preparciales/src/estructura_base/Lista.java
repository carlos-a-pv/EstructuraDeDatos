package estructura_base;
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
            newNode.setSiguienteNodo(firstNode);
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
                if(aux.getSiguienteNodo() == null){
                    aux.setSiguienteNodo(newNode);

                }else{
                    aux = aux.getSiguienteNodo();
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
            if(aux.getSiguienteNodo() == null){
                System.out.print(aux.getValorNodo());
            }else{
                System.out.print(aux.getValorNodo()+",");
                aux = aux.getSiguienteNodo();
            }

        }
    }
    public boolean isEmpty(){
        return (size == 0 || firstNode == null)?true:false;

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
                    aux = aux.getSiguienteNodo();
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
                temporalNode = temporalNode.getSiguienteNodo();
                cont++;
            }
        }
        if(temporalNode != null)
            return temporalNode.getValorNodo();
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
                aux = aux.getSiguienteNodo();
            }
            Nodo nextNode = aux.getSiguienteNodo().getSiguienteNodo();
            aux.getSiguienteNodo().setValorNodo(null);
            aux.setSiguienteNodo(nextNode);
        }else{
            throw new RuntimeException("Índice no válido");
        }

        size--;
    }

    public void recorrerLista(){
        for(Nodo aux = firstNode; aux != null; aux = aux.getSiguienteNodo()){

        }
    }

    public void recorrerRecursivamenteLista(Nodo aux)   {
        if( aux == null){
            System.out.println("terminó");
        }else{
            recorrerRecursivamenteLista(aux.getSiguienteNodo());
        }
    }

    //13. calcular maxima distancia recursivamente
    public int calcularMaximaDistancia(Nodo i, int clave, int dist, int cont, int maxDist){
        if(i == null){
            return maxDist;
        }else{
            if(i.getValorNodo().equals(clave)){
                cont++;
            }
            if(cont == 1){
                return calcularMaximaDistancia(i.getSiguienteNodo(), clave, dist+1, cont, maxDist);
            }else if(cont == 2){
                cont = 1;
                if(dist > maxDist){
                    maxDist = dist;
                }
                dist = 0;
                return calcularMaximaDistancia(i.getSiguienteNodo(), clave, dist+1, cont, maxDist);
            }else{
                return  calcularMaximaDistancia(i.getSiguienteNodo(), clave, dist, cont, maxDist);
            }
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Lista<E> agregarLista(int i, Lista<E> lista) {
        if (lista.isEmpty()) {
            throw new RuntimeException("La lista esta vacía");
        }else{
            if(i == 0){
                Nodo aux = lista.firstNode;
                while(aux.getSiguienteNodo() != null){
                    aux = aux.getSiguienteNodo();
                }
                aux.setSiguienteNodo(this.firstNode);
            }
            return lista;
        }
    }
}
