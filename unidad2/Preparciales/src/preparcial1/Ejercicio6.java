package preparcial1;

import estructura_base.Pila;

//Escriba un método que reciba como parámetro una cadena de caracteres y que
//usando una Pila determine si sus paréntesis, llaves y corchetes están balanceados.
//Debe retornar un boolean. Ejemplo: “(6-7)/4]” está mala. “[(1+2)*4]+5” está bien
public class Ejercicio6 {

    public static void main(String[] args) throws Exception {
        String cadena = "[(1+2)*4]+5"; //--> ((

        boolean result = verificarExpresion(cadena);

        if(result){
            System.out.println(String.format("La expresion '%s' esta bien", cadena));
        }else{
            System.out.println(String.format("La expresion '%s' esta mal", cadena));
        }
    }


    private static boolean verificarExpresion(String cadena) throws Exception {

        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }
        int parentesis = 0;
        int corchetes = 0;
        int llaves = 0;

        int longitudPila = pila.getSize();
        for (int i = 0; i < longitudPila; i++) {
            char caracterLeido = pila.pop();

            if(caracterLeido == '(' || caracterLeido == ')'){
                parentesis++;
            }else if(caracterLeido == '[' || caracterLeido == ']') {
                corchetes++;
            }else if(caracterLeido == '{' || caracterLeido == '}') {
                llaves++;
            }
        }
        return (parentesis % 2 != 0 || llaves % 2 != 0|| corchetes % 2 != 0)?false:true;
    }
}
