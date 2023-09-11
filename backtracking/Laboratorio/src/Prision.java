public class Prision {

    private String nombre;

    private Piso piso1 = new Piso();

    private EspacioPrision[][] matrizPisoUno =  {
            {new Celda(true), new Celda(true), new Celda(true), new Celda(true), new Celda(true), new Salida()},
            {new Celda(true), new Pasillo(), new Pasillo(), new Pasillo(), new Celda(true), new Pasillo()},
            {new Celda(true), new Pasillo(), new Celda(true), new Pasillo(), new Celda(true), new Pasillo()},
            {new Celda(true), new Pasillo(), new Celda(true), new Pasillo(), new Pasillo(), new Pasillo()},
            {new Entrada(), new Pasillo(), new Celda(true), new Celda(true), new Pasillo(), new Pasillo()},
    };

    EspacioPrision[][] matrizPisoDos= {};
    EspacioPrision[][] matrizPisoTres= {};


    public Prision(String nombre){
        this.nombre = nombre;
    }

    public EspacioPrision[][] verificarPrisionereos() {
        return piso1.recorrerPisoService(matrizPisoUno);
    }

    public Piso getPiso1() {
        return piso1;
    }

    public void setPiso1(Piso piso1) {
        this.piso1 = piso1;
    }

    public String getNombre(){
        return this.nombre;
    }
}
