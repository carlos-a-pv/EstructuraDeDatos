public class EncontrarMayor {

    public static int encontrarMayor(int[] arreglo) {
        return encontrarMayorRecursivo(arreglo, 0, arreglo.length - 1);
    }

    public static int encontrarMayorRecursivo(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) {
            // Caso base: cuando solo hay un elemento en el subarreglo.
            return arreglo[inicio];
        }

        // Dividir el arreglo en dos mitades.
        int mitad = (inicio + fin) / 2;

        // Encontrar el mayor elemento en cada mitad.
        int mayorIzquierda = encontrarMayorRecursivo(arreglo, inicio, mitad);
        int mayorDerecha = encontrarMayorRecursivo(arreglo, mitad + 1, fin);

        // Combinar los resultados para encontrar el mayor en el arreglo completo.
        return Math.max(mayorIzquierda, mayorDerecha);
    }

    public static void main(String[] args) {
        int[] arreglo = {3, 8, 23, 10, 7, 5};
        int mayor = encontrarMayor(arreglo);
        System.out.println("El mayor elemento en el arreglo es: " + mayor);
    }
}
