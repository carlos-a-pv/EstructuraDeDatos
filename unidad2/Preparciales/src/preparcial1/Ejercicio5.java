package preparcial1;

import estructura_base.Cola;
import estructura_base.Pila;

//Escriba un método que lea un número entero positivo e imprima su representación
//binaria, use pilas o colas. El método debe retornar un entero.
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 61;
        
        int numeroBinario = convertirABinario(numero);
        System.out.println(String.format("El numero en binario de %s es: %s" ,numero, numeroBinario));
        //61 --> 1 1 1 1 0 1
        //91 --> 1 0 1 1 0 1 1
        //8 --> 1 0 0 0
    }

    private static int convertirABinario(int numero) {
        Pila<Integer> pila = new Pila<>();
        while (numero != 0){
            pila.push(numero%2);
            numero = numero / 2;
        }
        String valorBinanario = "";
        while(!pila.isEmpty()){
            try{
                valorBinanario += String.valueOf(pila.pop());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        return Integer.parseInt(valorBinanario);
    }
}
