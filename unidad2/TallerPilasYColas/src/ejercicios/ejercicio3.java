package ejercicios;

import estructura_base.Pila;

public class ejercicio3 {
    //Concatenar dos pilas.
    public static void main(String[] args) {
        Pila pila1 = new Pila();
        Pila pila2 = new Pila();
        pila1.push(3);
        pila1.push(2);
        pila1.push(1); //---> 1,2,3

        pila2.push(6);
        pila2.push(5);
        pila2.push(4); //---> 4,5,6

        Pila pila3 = concatenarPilas(pila1, pila2); //--> 4,5,6,1,2,3
        pila3.printPila();
    }

    private static Pila concatenarPilas(Pila pila1, Pila pila2) {

        Pila pilaConcatenada = pila1;
        Pila auxPila = new Pila();
        int longitudPila = pila2.getSize();

        for (int i = 0; i < longitudPila; i++) {
            try{
                auxPila.push(pila2.pop());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < longitudPila; i++) {
            try{
                pilaConcatenada.push(auxPila.pop());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }

        return pilaConcatenada;
    }
}
