package preparcial1;

public class Punto1 {

    private String [][] pisoFacultad = {
            /*0*/{" ","","","","","1","",""},
            /*1*/{"","1","1","","1","1","","1"},
            /*2*/{"","","1","","","","",""},
            /*3*/{"1","","","","","1","1",""},
            /*4*/{"1","","1","1","","1","1",""},
            /*5*/{"","","","",""," ","",""},
            /*6*/{"1","","1","","1","1","","1"}
    };

    public static void main(String[] args) {
        Punto1 facultad = new Punto1();
        facultad.pisoFacultad[6][6] = "X"; //
        facultad.resolver(0,0);
        System.out.println(facultad.imprimirLaberinto(0,0));
    }
    public void resolver(int x, int y){
        if(recorer(x,y)){
            pisoFacultad[x][y] = "S";
        }
    }

    private boolean recorer(int x, int y){
        //Validar desbordamiento de la matriz
        if(x == -1 || x > pisoFacultad.length-1 || y == -1 || y > pisoFacultad[x].length-1){
            return false;
        }

        //Validar el punto objetivo del laberinto
        if(pisoFacultad[x][y] == "X"){
            return true;
        }

        //Validar caso fallido o mismo punto o un salon
        if(pisoFacultad[x][y] == "V" || pisoFacultad[x][y] == "F" || pisoFacultad[x][y] == "1"){
            return false;
        }

        pisoFacultad[x][y] = "V";
        boolean result;

        //ir hacia abajo
        result = recorer(x+1, y);
        if (result) return true;

        //ir hacia izquierda
        result = recorer(x, y-1);
        if (result) return true;

        //ir hacia arriba
        result =  recorer(x-1, y);
        if (result) return true;

        //ir hacia derecha
        result = recorer(x,y+1);
        if (result) return true;

        pisoFacultad[x][y] = "F";
        return false;
    }

    private String imprimirLaberinto(int x, int y) { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
        String salida = "";    // un método toString para arrays bidimensionales, lo programamos a mano
        if( x < pisoFacultad.length ) {
            if(y < pisoFacultad[x].length){
                salida += pisoFacultad[x][y] + " ";
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
