package ejercicios;

import estructura_base.Cola;

//Escriba un método que tenga como parámetro dos colas del mismo tipo. Devuelva cierto si las dos colas son idénticas
public class Ejercicio10 {
    public static void main(String[] args) {
        Cola<Integer> cola1 = new Cola<>();

        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(4);

        Cola<Integer> cola2 = new Cola<>();
        cola2.encolar(1);
        cola2.encolar(2);
        cola2.encolar(4);

        boolean result = verificarIgualdadColas(cola1, cola2);
        if(result){
            System.out.println("Las cosas SON iguales");
        }else{
            System.out.println("Las colas NO SON iguales");
        }

    }

    private static boolean verificarIgualdadColas(Cola<Integer> cola1, Cola<Integer> cola2) {
        boolean bandera = false;
        if(cola1.tamanio != cola2.tamanio){
            return bandera;
        }else{
            int longitudCola = cola1.getTamano();
            for (int i = 0; i < longitudCola; i++) {
                int elem1 = cola1.desencolar();
                int elem2 = cola2.desencolar();

                if(elem1 != elem2){
                    bandera = false;
                    break;
                }else{
                    bandera = true;
                }
            }
        }
        return bandera;
    }
}
