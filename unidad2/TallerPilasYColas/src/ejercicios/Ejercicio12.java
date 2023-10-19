package ejercicios;

import estructura_base.Lista;

//Construir una función que sume los elementos de una lista de enteros recursivamente.
public class Ejercicio12 {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.addToEnd(1);
        lista.addToEnd(2);
        lista.addToEnd(3);
        lista.addToEnd(4);
        lista.addToEnd(5);

        int suma = sumarElementosRecursivo(lista, 0);
        System.out.println("El resultado de operacion es: "+suma);
    }

    private static int sumarElementosRecursivo(Lista<Integer> lista, int i) {
        if(i == lista.getSize()){
            return 0;
        }else{
            return sumarElementosRecursivo(lista, i+1) + (int) lista.getNode(i).getValorNodo();
        }
    }
}
