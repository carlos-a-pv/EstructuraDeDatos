import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class SumaElementosMatriz {

    /*. Realizar un método que retorne la suma de los elementos de un arreglo bidimensional de enteros.*/

    public static void main(String[] args) {
        int [][] matriz = {
                {1,1,1},
                {1,1,10}};
        
        int sumaElementos = sumarElementos(matriz, 0, 0);
        int sumaElementos2 = sumarElementos2(matriz, 0, 0);

        System.out.println("\nLA SUMA DE LOS ELEMENTOS DE LA MATRIZ ES: "+sumaElementos);
        System.out.println("\nLA SUMA DE LOS ELEMENTOS DE LA MATRIZ ES: "+sumaElementos2);
    }

    private static int sumarElementos(int[][] matriz, int i, int j) {
        if (i == matriz.length-1 && j == matriz[i].length-1){
            return matriz[i][j];
        }else {
            if (j == matriz[i].length - 1) {
                return sumarElementos(matriz, i + 1, 0) + matriz[i][j];
            }
            return sumarElementos(matriz, i, j + 1) + matriz[i][j];
        }
    }

    private static int sumarElementos2(int [][] matriz, int i, int j){
        if(i == matriz.length-1 && j == matriz[i].length-1){
            return matriz[i][j];
        }
        if(j == matriz[i].length-1){
            return  matriz[i][j] + sumarElementos(matriz, i+1, 0) ;
        }
        return  matriz[i][j] + sumarElementos(matriz, i, j+1);
    }
}
