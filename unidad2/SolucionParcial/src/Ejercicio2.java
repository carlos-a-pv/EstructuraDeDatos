import estructura.Cola;
import estructura.Nodo;
import estructura.Pila;

public class Ejercicio2 {
    public static void main(String[] args) {
        Pila<Integer> pilaEnteros = new Pila<>();
        pilaEnteros.push(1);
        pilaEnteros.push(2);
        pilaEnteros.push(10);
        pilaEnteros.push(3);
        pilaEnteros.push(7);
        pilaEnteros.push(5);
        Cola<Integer> colaNumerosPrimos = new Cola<>();
        Pila<Integer> pilaEnterosSinPrimos = new Pila<>();

        Nodo aux = pilaEnteros.getPeek();

        //con ciclo while
        /*while(aux != null){
            int valor = (int) aux.getValorNodo();
            if(verificarNumeroPrimo(valor)){
                colaNumerosPrimos.encolar(valor);
            }else{
                pilaEnterosSinPrimos.push(valor);
            }
            aux = aux.getSiguienteNodo();
        }*/

        //con ciclo for
        int longitudPila = pilaEnteros.getSize();
        for (int i = 0; i < longitudPila; i++) {
            try{
                int valor  = pilaEnteros.pop();
                if(verificarNumeroPrimo(valor)){
                    colaNumerosPrimos.encolar(valor);
                }else{
                    pilaEnterosSinPrimos.push(valor);
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }

        }

        pilaEnterosSinPrimos.printPila();
        System.out.println();
        colaNumerosPrimos.imprimir();
    }

    private static boolean verificarNumeroPrimo(int valor) {
        int i = valor;
        int divisores = 0;
        while (i != 0){
            if(valor % i == 0){
                divisores++;
            }
            i--;
        }
        return (divisores == 2)?true:false;
    }
}
