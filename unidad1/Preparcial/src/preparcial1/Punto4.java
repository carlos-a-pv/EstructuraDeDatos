package preparcial1;

public class Punto4 {

    /*Desarrollar un método recursivo usando divide y vencerás para obtener la cantidad de ceros en un arreglo de tamaño n. */

    private int[] m = {1,2,3,4,5} ;

    public static void main(String[] args) {
        Punto4 clase = new Punto4();
        System.out.println(clase.obtenerCeros(clase.m, 0, clase.m.length-1, 0));
    }

    private int obtenerCeros(int[] m, int inicio, int fin, int cantidadCeros) {
        if (inicio == fin) {
            // Caso base: cuando solo hay un elemento en el subarreglo.
            if(m[inicio] == 0){
                cantidadCeros++;
            }
            return cantidadCeros;
        }

        // Dividir el arreglo en dos mitades.
        int mitad = (inicio + fin) / 2;

        // Encontrar el mayor elemento en cada mitad.
        int parteIzquierda = obtenerCeros(m, inicio, mitad, cantidadCeros);
        int parteDerecha = obtenerCeros(m, mitad + 1, fin, cantidadCeros);

        return parteIzquierda + parteDerecha;
    }
}
