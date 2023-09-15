import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Definir un HashMap
        HashMap datos = new HashMap();

        Set<Integer> setNumbers = new HashSet<>();


        // Insertar valores "key"-"value" al HashMap
        datos.put("Laura", "667895789");
        datos.put("Pepe", "645895756");
        datos.put("Abelardo", "55895711");
        datos.put("Daniel", "667111788");
        datos.put("Arturo", "667598623");

        // Definir Iterator para extraer o imprimir valores
        for(Iterator it = datos.keySet().iterator(); it.hasNext();) {
            String s = (String) it.next();
            String s1 = (String)datos.get(s);
            System.out.println("Alumno: "+s + " - " + "Telefono: "+s1);
        }

    }
}