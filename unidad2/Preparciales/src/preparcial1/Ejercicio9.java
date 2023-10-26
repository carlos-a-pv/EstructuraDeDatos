package preparcial1;

import estructura_base.Lista;
import estructura_base.Nodo;

public class Ejercicio9 {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.addToEnd(1);
        lista.addToEnd(3);
        lista.addToEnd(5);
        lista.addToEnd(4);
        lista.addToEnd(2);
        
        invertirListaRecursividad(lista, 0, new Nodo(0));
    }

    private static void invertirListaRecursividad(Lista<Integer> lista, int i, Nodo nodo) {

        if(i == lista.getSize()){

        }else{
            nodo = lista.getNode(i);
            invertirListaRecursividad(lista, i+1, nodo);
            lista.addToEnd(nodo.getValorNodo());
        }

    }
}
