public class Piso {

    private EspacioPrision[][] matrizPisoUno =  {
            {new Celda(), new Celda(), new Celda(), new Celda(), new Celda(), new Salida()},
            {new Celda(), new Pasillo(), new Pasillo(), new Pasillo(), new Celda(), new Pasillo()},
            {new Celda(), new Pasillo(), new Celda(), new Pasillo(), new Celda(), new Pasillo()},
            {new Celda(), new Pasillo(), new Celda(), new Pasillo(), new Pasillo(), new Pasillo()},
            {new Entrada(), new Pasillo(), new Celda(), new Celda(), new Pasillo(), new Pasillo()},
            };

    private int numeroPrisioneros  = 10;
    private int cuentaPrisioneros;

    private boolean recorrerPiso(int x, int y){
        if(x == -1 || x > matrizPisoUno.length-1 || y == -1 || y > matrizPisoUno[x].length-1){
            return false;
        }

        EspacioPrision ubicacionActual = matrizPisoUno[x][y];

        if(ubicacionActual instanceof  Celda){
            verificarCelda((Celda) ubicacionActual);
            return false;
        }

        if(ubicacionActual instanceof Salida){
            return true;
        }
        if(ubicacionActual == null){
            return false;
        }

        boolean result;
        matrizPisoUno[x][y] = null;

        result=recorrerPiso(x-1, y); //ir hacia ARRIBA
        if (result) return true;

        result=recorrerPiso(x, y+1); //ir hacia la DERECHA
        if (result)return true;

        result=recorrerPiso(x+1, y); //ir hacia ABAJO
        if (result) return true;

        result=recorrerPiso(x, y-1); //ir hacia la IZQUIERDA
        if (result) return true;


        return false;
    }

    private void verificarCelda(Celda celda){
        if(celda.isEstado()){
            cuentaPrisioneros++;
        }
    }




    public static void main(String[] args) {
        Piso piso = new Piso();
        piso.recorrerPiso(4,0);

        System.out.println("Los primeros que hay son: "+piso.cuentaPrisioneros);

        for (int i = 0; i < piso.matrizPisoUno.length; i++) {
            for (int j = 0; j < piso.matrizPisoUno[i].length; j++) {
                System.out.print(piso.matrizPisoUno[i][j]+"|");
            }
            System.out.println();
        }
    }
}
