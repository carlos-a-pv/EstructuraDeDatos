package ejercicios;

import estructura_base.Cola;
import estructura_base.Pila;
import estructura_base.PilaCola;

//Se tiene una pila de enteros positivos. Con las operaciones básicas de pilas y colas escribir un fragmento de código
//para poner todos los elementos que son par de la pila en la cola.
public class Ejercicio4 {

    public static void main(String[] args) {
        Pila<Integer> enteros = new Pila<>();
        enteros.push(10);
        enteros.push(9);
        enteros.push(8);
        enteros.push(7);
        enteros.push(6);
        enteros.push(5);
        enteros.push(4);
        enteros.push(3);
        enteros.push(2);
        enteros.push(1);
        PilaCola<Integer> pilaCola = ponerParesDePilaALaCola(enteros);
        pilaCola.getPila().printPila();
        System.out.println();
        pilaCola.getCola().imprimir();
    }

    private static PilaCola<Integer> ponerParesDePilaALaCola(Pila<Integer> enteros) {
        Cola<Integer> colaPares = new Cola<>();
        Pila<Integer> pilaImpares = new Pila<>();
        int longitudPila = enteros.getSize();

        for (int i = 0; i < longitudPila; i++) {
            try{
                int elem = enteros.pop();

                if(elem % 2 == 0){
                    colaPares.encolar(elem);
                }else{
                    pilaImpares.push(elem);
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

        PilaCola<Integer> pilaCola = new PilaCola<>(pilaImpares, colaPares);
        return pilaCola;
    }

}
