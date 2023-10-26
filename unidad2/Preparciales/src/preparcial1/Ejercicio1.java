package preparcial1;

import estructura_base.Lista;
import estructura_base.Pila;

//Cree un método que reciba como parámetro una ListaSimple y retorne la misma Lista,
//pero invertida, use Pilas.
public class Ejercicio1 {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.addToEnd(1);
        lista.addToEnd(2);
        lista.addToEnd(3);
        lista.addToEnd(4);
        lista.printList();
        Lista listaInvertida = invertirLista(lista);
        System.out.println();
        listaInvertida.printList();
    }

    private static Lista invertirLista(Lista<Integer> lista) {
        Pila<Integer> pila = new Pila();
        for (int i = 0; i < lista.getSize(); i++) {
            pila.push((Integer) lista.getNode(i).getValorNodo());
        }
        lista.setSize(0);
        int longitudPíla = pila.getSize();
        for (int i = 0; i < longitudPíla; i++) {
            try{
                lista.addToEnd(pila.pop());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return lista;
    }
}
