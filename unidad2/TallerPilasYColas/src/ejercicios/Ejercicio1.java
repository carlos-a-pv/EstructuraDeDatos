package ejercicios;

import estructura_base.Pila;


public class Ejercicio1 {

    //Usando pilas, cree un método que verifique si una cadena de caracteres es palíndroma.

    public static void main(String[] args){

        String palabra = "";
        boolean result = verificarPalindromo(palabra);
        if(result){
            System.out.println(String.format("La palaba: '%s' ES palindromo",palabra));
        }else{
            System.out.println(String.format("La palabra: '%s' NO ES palindromo", palabra));
        }
    }

    private static boolean verificarPalindromo(String palabra) {
        Pila<Character> pila = new Pila<>();
        String palabraAlreves = "";

    if(palabra.length() == 0){
            return false;
        }
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        int longitudPila = pila.getSize();
        try {
            for (int j = 0; j < longitudPila; j++) {
                palabraAlreves += pila.pop();
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return palabraAlreves.equals(palabra)?true:false;
    }
}
