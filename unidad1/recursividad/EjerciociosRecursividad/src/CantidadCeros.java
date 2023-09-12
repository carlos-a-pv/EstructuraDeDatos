public class CantidadCeros {

    /*Realizar un algoritmo recursivo que retorne la cantidad de ceros que se encuentran dentro de un
    arreglo unidimensional de enteros.*/

    public static void main(String[] args) {
        int [] enteros = {0,2,3,4,0,6,7,8,0};
        int cantidadCeros = contarCeros(enteros, 0);
        System.out.println("LA CANTIDAD DE CEROS DEL ARREGLO ES: "+cantidadCeros);
    }

    private static int contarCeros(int[] enteros, int i) {

        if(i == enteros.length){
            return 0;
        }else{
            if(enteros[i] == 0){
                return contarCeros(enteros, i+1)+1;
            }else{
                return contarCeros(enteros, i+1);
            }
        }
    }
}
