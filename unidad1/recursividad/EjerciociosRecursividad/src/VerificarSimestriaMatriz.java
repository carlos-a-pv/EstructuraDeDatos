public class VerificarSimestriaMatriz {

    /*Realizar un método que verifica si una matriz es simétrica o no lo es.*/

    public static void main(String[] args) {

        int[][] m = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        boolean verificacion = verificarSimetriaMatriz2(m, 0, 0);
        if(verificacion){
            System.out.println("la matriz ES simetrica");
        }else{
            System.out.println("la matriz NO es simetrica");
        }

    }

    private static boolean verificarSimetriaMatriz2(int[][]matriz, int i, int j){
        // Verificar si hemos llegado al final de la matriz
        if (i == matriz.length - 1 && j == matriz[i].length - 1) {
            return true; // La matriz es simétrica si llegamos al final sin problemas
        }

        // Verificar si los elementos en las posiciones (i, j) y (j, i) son iguales
        if (matriz[i][j] != matriz[j][i]) {
            return false; // No son iguales, la matriz no es simétrica
        }

        // Moverse a la siguiente posición de la matriz
        if (j < matriz[i].length - 1) {
            // Moverse horizontalmente
            return verificarSimetriaMatriz2(matriz, i, j + 1);
        } else {
            // Moverse a la siguiente fila
            return verificarSimetriaMatriz2(matriz, i + 1, 0);
        }
    }


}
