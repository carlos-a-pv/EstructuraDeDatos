import java.util.ArrayList;

public class Prision {

    private String nombre;
    private ArrayList<Celda> listaCeldas;
    private ArrayList<Pasillo> listaPasillos;

    private String[][]  pisoUno = {{"C","C","C","C","C","S"},
                                   {"C","P","P","P","C","P"},
                                   {"C","P","C","P","C","P"},
                                   {"C","O","C","P","P","P"},
                                   {"E","P","C","C","P","P"}};

    public Prision(String nombre){
        this.nombre = nombre;
        listaCeldas = new ArrayList<>();
        listaPasillos = new ArrayList<>();
    }
}
