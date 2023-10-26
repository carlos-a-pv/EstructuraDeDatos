package preparcial1;

import estructura_base.Lista;

//Implementar el método agregarLista(int indice, Lista lista). El método debe agregar
//una nueva lista en la posición que se pasa como parámetro.(la lista debe tener un
//elemento)
public class Ejercicio4 {
    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<>();
        lista1.addToEnd(1);
        lista1.addToEnd(2);
        lista1.addToEnd(3);
        lista1.addToEnd(4);

        Lista<Integer> lista2 = new Lista<>();
        lista2.addToEnd(9);
        lista2.addToEnd(0);
        Lista newList =  lista1.agregarLista(0,lista2);

        newList.printList();


    }
}
