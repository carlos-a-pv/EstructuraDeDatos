package preparcial1;

import estructura_base.ListaDoble;
import estructura_base.NodoDoble;

//Escriba el método void agregarEnOrden(int dato, ListaDoble<Integer> lista) que
//permita agregar valores enteros de manera ordenada a la lista que se pasa como
//parámetro. Los datos se deben agregar en la lista ascendentemente.
public class Ejercicio7 {

    public static void main(String[] args) {

        ListaDoble<Integer> listaDoble = new ListaDoble<>();
        listaDoble.agregarfinal(30);
        listaDoble.agregarfinal(20);
        listaDoble.agregarfinal(3);

        listaDoble.imprimirLista();
        
        listaDoble = agregarEnOrden(10, listaDoble);
        listaDoble = agregarEnOrden(5, listaDoble);
        listaDoble = agregarEnOrden(25, listaDoble);
        listaDoble = agregarEnOrden(31, listaDoble);
        listaDoble = agregarEnOrden(80, listaDoble);
        listaDoble = agregarEnOrden(1, listaDoble);
        listaDoble = agregarEnOrden(0, listaDoble);
        listaDoble.imprimirLista();
    }

    private static ListaDoble<Integer> agregarEnOrden(int elem, ListaDoble<Integer> listaDoble) {

        NodoDoble<Integer> aux = listaDoble.getNodoPrimero();
        NodoDoble<Integer> nodoNuevo = new NodoDoble<>(elem);

        if(elem > listaDoble.getNodoUltimo().getValorNodo()){
            NodoDoble<Integer> aux2 = listaDoble.getNodoUltimo();
            listaDoble.setNodoUltimo(nodoNuevo);
            nodoNuevo.setAnteriorNodo(aux2);
            aux2.setSiguienteNodo(nodoNuevo);
        } else if (elem < listaDoble.getNodoPrimero().getValorNodo()) {
            NodoDoble<Integer> aux2 = listaDoble.getNodoPrimero();
            listaDoble.setNodoPrimero(nodoNuevo);
            nodoNuevo.setSiguienteNodo(aux2);
            aux2.setAnteriorNodo(nodoNuevo);
        }else{
            while(!listaDoble.estaVacia()){
                if(aux.getValorNodo() > elem){
                    break;
                }
                aux = aux.getSiguienteNodo();
            }
            NodoDoble<Integer> nodoAnterior = aux.getAnteriorNodo();
            nodoNuevo.setSiguienteNodo(aux);
            aux.setAnteriorNodo(nodoNuevo);
            nodoAnterior.setSiguienteNodo(nodoNuevo);
            nodoNuevo.setAnteriorNodo(nodoAnterior);
        }
        return listaDoble;
    }
}
