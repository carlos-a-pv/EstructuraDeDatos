package ejercicios;

import estructura_base.Pila;

//Escribir un método que, dada una expresión postfija, retorne el resultado de evaluar dicha expresión. "78+32+/" = 3.
public class Ejercicio8 {
    public static void main(String[] args) {
        int value = evaluarExpresion("78+32+/");
        System.out.println(String.format("el valor de es expresion es: %s",value));
    }

    private static int evaluarExpresion(String expresion) {
        Pila<String> pila = new Pila<>();
        for (int i = 0; i < expresion.length(); i++) {
            String caracterLeido = String.valueOf(expresion.charAt(i));

            if(caracterLeido.equals("1") || caracterLeido.equals("2") || caracterLeido.equals("3") || caracterLeido.equals("4") || caracterLeido.equals("5")
                || caracterLeido.equals("6") || caracterLeido.equals("7") || caracterLeido.equals("8") || caracterLeido.equals("9")  || caracterLeido.equals("0")){
                pila.push(caracterLeido);
            }
            if(caracterLeido.equals("+") || caracterLeido.equals("-") || caracterLeido.equals("*") || caracterLeido.equals("/") || caracterLeido.equals("˄")){
                try{
                    int op2 = Integer.parseInt(pila.pop());
                    int op1 = Integer.parseInt(pila.pop());
                    int operacion;
                    if( caracterLeido.equals("+")){
                        operacion = op1 + op2;
                    }else if(caracterLeido.equals("-")){
                        operacion = op1 - op2;
                    }else if(caracterLeido.equals("*")) {
                        operacion = op1 * op2;
                    }else if(caracterLeido.equals("/")){
                        operacion = op1 / op2;
                    }else{
                        operacion = (int) Math.pow(op1, op2);
                    }

                    pila.push(String.valueOf(operacion));
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
        }
        try{
            return Integer.parseInt(pila.pop());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
