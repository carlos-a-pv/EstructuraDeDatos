
package ejercicios;

import estructura_base.Lista;
import estructura_base.Pila;

public class Ejercicio2 {

    //Obtener una secuencia aleatoria de 10 números, guardarlos en una Lista enlazada simple  y ponerlos en una pila.
    //Imprimir la secuencia original y a continuación, imprimir la pila extrayendo los elementos.

    public static void main(String[] args) {
        long numeroAleatorio = obtenerSecuenciaNumerosAleatorio();
        Lista<Integer> lista =  guardarEnListaSimple(numeroAleatorio);
        Pila pila = guardarListaEnPila(lista);
        System.out.println("\n" +numeroAleatorio+"\n");
        lista.printList();
        System.out.println();
        int longitudPila = pila.getSize();
        try{
            for (int i = 0; i < longitudPila; i++) {
                System.out.print(pila.pop()+",");
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static Pila<Integer> guardarListaEnPila(Lista<Integer> lista) {
        Pila<Integer> pila = new Pila<>();
        for (int i = 0; i < lista.getSize(); i++) {
            pila.push((Integer) lista.getNode(i).getValorNodo());
        }
        return pila;
    }

    private static Lista<Integer> guardarEnListaSimple(long numeroAleatorio) {
        Lista<Integer> lista = new Lista<>();
        String strNum = String.valueOf(numeroAleatorio);

        for (int i = 0; i < strNum.length(); i++) {
            lista.addToEnd(Integer.valueOf(strNum.charAt(i)));
        }
        return lista;
    }

    private static long obtenerSecuenciaNumerosAleatorio(){
        String secuencia = "";
        for (int i = 0; i < 10; i++) {
            int num = (int) Math.round(Math.random()*9);
            secuencia += String.valueOf(num);
        }

        return Long.valueOf(secuencia);
    }

}
