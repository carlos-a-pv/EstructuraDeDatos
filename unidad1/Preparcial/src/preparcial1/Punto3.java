package preparcial1;

import java.util.ArrayList;

public class Punto3 {

    /*Codificar un método en Java que, recibiendo como argumento una lista de números enteros, devuelva como resultado uno de estos valores::
        0, si el valor del último nodo coincide con el número de nodos de la lista.
        -1, si el valor del último nodo es menor que el número de nodos de la lista.
        +1, si el valor del último nodo es mayor que el número de nodos de la lista.
    OBSERVACIONES:
    Si la lista se recibe vacía el método devolverá el valor 0.
    No se permite utilizar ninguna estructura de datos auxiliar.
    Sólo se permite la realización de un único recorrido en la lista(recursividad).
    Al final de la ejecución del método, la lista deberá permanecer con la estructura y el contenido iniciales.

    EJEMPLOS:
    El valor del último elemento de lista1 (5) coincide con el número de elementos de la lista. El método devuelve 0.
    El valor del último elemento de lista2 (1) es menor que el número de elementos de la lista. El método devuelve -1.
    El valor del último nodo de lista3 (5) es mayor que el número de elementos de la lista. El método devuelve +1.
    Lista 1: 1,2,4,5,5
    Lista 2: 1,3,1
    Lista 3: 7,5,3,5
    El tratamiento (fase de ida) consiste, simplemente, en contar los elementos, para lo que hará falta un argumento entero (num). En la fase de transición (terminación anticipada) se obtiene el resultado que se devolverá en la fase de vuelta.
    */

    public static void main(String[] args) {
        Punto3 clase = new Punto3();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(7);
        listaEnteros.add(5);
        listaEnteros.add(3);
        listaEnteros.add(5);

        System.out.println("El resultado es: "+clase.metodoRecursivo(listaEnteros, 0));
    }

    public int metodoRecursivo(ArrayList<Integer>lista, int num){

        if(num == lista.size()-1){
            if(lista.get(num) > lista.size()){
                return 1;
            } else if (lista.get(num) < lista.size()) {
                return -1;
            }else{
                return 0;
            }
        }
        return metodoRecursivo(lista, num+1);
    }
}
