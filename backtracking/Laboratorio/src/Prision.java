import java.util.ArrayList;

public class Prision {

    private String nombre;
    private ArrayList<Celda> listaCeldas;
    private ArrayList<Pasillo> listaPasillos;

    public Prision(String nombre){
        this.nombre = nombre;
        listaCeldas = new ArrayList<>();
        listaPasillos = new ArrayList<>();
    }
}
