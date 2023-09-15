public class Piso {

    private boolean recorridoCompleto = false;

    private int numeroPrisioneros  = 14;
    private int cuentaPrisioneros;

    private EspacioPrision[][] matrizPisoUno;

    public EspacioPrision[][]   recorrerPisoService(EspacioPrision[][] matriz){
        this.matrizPisoUno = matriz;
        recorrerPiso(4,0);
        return matrizPisoUno;
    }

    boolean recorrerPiso(int x, int y){
        if(x == -1 || x > matrizPisoUno.length-1 || y == -1 || y > matrizPisoUno[x].length-1){
            return false;
        }

        EspacioPrision ubicacionActual = matrizPisoUno[x][y];

        if(ubicacionActual instanceof Salida){
            return true;
        }
        if(ubicacionActual == null){
            return false;
        }
        if(ubicacionActual instanceof Celda){
            verificarCelda((Celda)ubicacionActual);
            return false;
        }
        boolean result;
        matrizPisoUno[x][y] = null;

        //ir hacia ARRIBA
        result=recorrerPiso(x-1, y);
        if (result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        //ir diagonal derecha arriba
        result=recorrerPiso(x-1, y+1);
        if(result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        //ir hacia la DERECHA
        result=recorrerPiso(x, y+1);
        if(result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        //ir diagonal derecha abajo
        result=recorrerPiso(x+1,y+1);
        if (result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        result=recorrerPiso(x+1, y); //ir hacia ABAJO
        if (result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        //ir diagonal izquierda abajo
        result=recorrerPiso(x+1, y-1);
        if(result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        result=recorrerPiso(x, y-1); //ir hacia la IZQUIERDA
        if (result) {
            if(recorridoCompleto == true){
                return true;
            }
            return false;
        }

        //ir diagonal izquierda arriba
        result=recorrerPiso(x-1, y-1);
        if(result) {
            recorridoCompleto = true;
            return true;
        }

        return false;
    }

    private void verificarCelda(Celda celda){
        if(!celda.isVisistado()){
            if(celda.isEstado()){
                cuentaPrisioneros++;
                celda.setVisistado(true);
            }
        }
    }

    public int getNumeroPrisioneros() {
        return numeroPrisioneros;
    }

    public void setNumeroPrisioneros(int numeroPrisioneros) {
        this.numeroPrisioneros = numeroPrisioneros;
    }

    public int getCuentaPrisioneros() {
        return cuentaPrisioneros;
    }

    public void setCuentaPrisioneros(int cuentaPrisioneros) {
        this.cuentaPrisioneros = cuentaPrisioneros;
    }
}
