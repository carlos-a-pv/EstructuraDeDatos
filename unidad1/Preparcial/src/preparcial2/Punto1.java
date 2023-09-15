package preparcial2;

import preparcial1.Punto4;

public class Punto1 {

    /*Implementar un algoritmo usando backtracking que permita solucionar el
    siguiente problema: Un mapa de una ciudad se puede representar en forma de matriz
    M[i][j], donde, M[i][j]=1 significa que hay un edificio, pero si M[i][j]= “ ”(vacio) significa
    que es carretera, desarrolle una aplicación que permita dibujar una ruta de un vehículo
    marcando en la posición M[i][j] = 0 por donde va pasando dicho vehículo. El vehículo
    puede arrancar en la posición A (0, 0) y terminar en la posición B (5, 7) definidas por
    parámetro... Ejemplo:*/

    private String [][] mapaCiudad = {
            /*0*/{" "," "," "," "," ","1"," "," "},
            /*1*/{" ","1","1"," ","1","1"," ","1"},
            /*2*/{" "," ","1"," "," "," "," "," "},
            /*3*/{"1"," "," "," "," ","1","1","1"},
            /*4*/{"1"," ","1","1"," ","1","1"," "},
            /*5*/{" "," "," "," "," "," "," "," "},
            /*6*/{"1"," ","1"," ","1","1"," ","1"}
    };

    public static void main(String[] args) {
        Punto1 clase = new Punto1();
        clase.mapaCiudad[5][7] = "B";
        clase.resolver(0,0);
        System.out.println(clase.imprimirLaberinto(0,0));

    }

    public void resolver(int x, int y){
        if(recorer(x,y)){
            mapaCiudad[x][y] = "S";
        }
    }

    private boolean recorer(int x, int y){
        //Validar desbordamiento de la matriz
        if(x == -1 || x > mapaCiudad.length-1 || y == -1 || y > mapaCiudad[x].length-1){
            return false;
        }


        //validar que no se haya llegado al final
        if(mapaCiudad[x][y] == "B"){
            /*System.out.println("\nSolución");
            for (int i = 0; i < mapaCiudad.length; i++) {
                for (int j = 0; j < mapaCiudad[i].length; j++) {
                    System.out.print(mapaCiudad[x][y]+" ");
                }
                System.out.println();
            }*/
            String salida = "";
            for (int h=0; h<mapaCiudad.length; h++) { // recorremos filas
                for (int m=0; m<mapaCiudad[h].length; m++) { // recorremos columnas
                    salida += mapaCiudad[h][m] + " "; // output es nuestra variable que va almacenando los valores a imprimir
                }
                salida += "\n"; // devolvemos esta variable con un salto de línea
            }
            System.out.println("Solución");
            System.out.println(salida);

            return true; // luego, el algoritmo termina

        }


        //validar que ya se pasó el punto, validar edificio(1), o que es un caso fallido
        if(mapaCiudad[x][y] == "0" || mapaCiudad[x][y] == "1" || mapaCiudad[x][y] == "F"){
            return false;
        }

        mapaCiudad[x][y] = "0";
        boolean result;

        //ir derecha
        result = recorer(x,y+1);
        if(result) return true;

        //ir arriba
        result = recorer(x-1,y);
        if(result) return true;

        //ir izquierda
        result = recorer(x,y-1);
        if(result) return true;

        //ir abajo
        result = recorer(x+1,y);
        if(result) return true;


        mapaCiudad[x][y] = "F";
        return false;
    }

    private String imprimirLaberinto(int x, int y) { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
        String salida = "";    // un método toString para arrays bidimensionales, lo programamos a mano
        if( x < mapaCiudad.length ) {
            if(y < mapaCiudad[x].length){
                salida += mapaCiudad[x][y] + " ";
                return salida + imprimirLaberinto(x, y+1);
            }else{
                salida += "\n";
                y = 0;
                return salida + imprimirLaberinto(x+1, y);
            }
        }else{
            return salida;
        }
    }
}
