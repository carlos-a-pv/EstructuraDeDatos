import estructura.Lista;
import estructura.NodoLista;

public class Ejercicio1 {

    public static void main(String[] args) {
        insertarCeros();
    }

    public static void insertarCeros(){
        Lista lista = new Lista();
        lista.addToEnd(1);
        lista.addToEnd(2);
        lista.addToEnd(3);
        lista.addToEnd(2);
        lista.addToEnd(-6);
        lista.addToEnd(1);
        lista.printList();
        int suma  = insertarCeros(lista.getInicio(), 0);
        System.out.println();
        System.out.println("suma: "+suma);
        lista.setSize(lista.getSize()+suma);
        lista.printList();
    }

    public static int insertarCeros(NodoLista nodo, int suma){
        if(nodo == null){
            return suma;
        }else{
            suma = insertarCeros(nodo.getSig(), suma+nodo.getDato());
            if(suma == nodo.getDato()){
                NodoLista nodoAux = nodo.getSig();
                NodoLista nodoNuevo = new NodoLista(0, nodoAux);
                nodo.setSig(nodoNuevo);
            }
        }
        return suma;
    }

}
