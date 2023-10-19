package ejercicios;

import estructura_base.Pila;

//Eliminar un elemento de la pila dado su valor.
public class Ejercicio5 {

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        Pila<Integer> newPila = eliminarValorDePila( pila,2);
        newPila.printPila();
    }

    private static Pila<Integer> eliminarValorDePila(Pila<Integer> pila, int num) {

        Pila<Integer> newPila = new Pila<>();
        int longitudPila = pila.getSize();

        for (int i = 0; i < longitudPila; i++) {
            try{
                int elem = pila.pop();
                if(elem != num){
                    newPila.push(elem);
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return newPila;
    }
}
