import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hospital {

    private Habitacion hab1 = new Habitacion("d", false);
    private Habitacion hab2 = new Habitacion("c", "357");
    private Habitacion hab3 = new Habitacion("c", "777");
    private Habitacion hab4 = new Habitacion("c", "987");


    private Habitacion[][] matrizHospital = {
            {hab2, new Habitacion("c"), new Habitacion("c"), new Habitacion("c"), hab1, new Habitacion("c")},
            {new Habitacion("c"), new Habitacion("-"), hab3, new Habitacion("-"), new Habitacion("-"), new Habitacion("d")},
            {new Habitacion("c"), new Habitacion("-"), new Habitacion("-"), new Habitacion("c"), new Habitacion("-"), new Habitacion("c")},
            {new Habitacion("-"), new Habitacion("c"), new Habitacion("c"), new Habitacion("c"), new Habitacion("c"),new Habitacion("c")}
    };

    //punto1
    public boolean resolverLaberinto(int x, int y){
        if(x == -1 || x > matrizHospital.length-1 || y == -1 || y > matrizHospital[x].length-1){
            return false;
        }

        if(matrizHospital[x][y].getTipo().equals("c") || matrizHospital[x][y].getTipo().equals("0") || matrizHospital[x][y].getTipo().equals("f")){
            return false;
        }

        if(matrizHospital[x][y].isEstado() == false){
            matrizHospital[x][y].setTipo("C");
            return true;
        }

        matrizHospital[x][y].setTipo("0");
        boolean resultado;

        //ir izquierda
        resultado = resolverLaberinto(x, y-1);
        if(resultado) return true;

        //ir diagonal derecha superior
        resultado = resolverLaberinto(x-1, y+1);
        if(resultado) return true;

        //ir diagnoal derecha inferior
        resultado = resolverLaberinto(x+1, y+1);
        if(resultado) return true;

        //ir diagonal izquierda inferior
        resultado = resolverLaberinto(x+1, y-1);
        if(resultado) return true;

        //ir diagonal izquierda superior
        resultado = resolverLaberinto(x-1, y-1);
        if(resultado) return true;

        //ir derecha
        resultado = resolverLaberinto(x, y+1);
        if(resultado) return true;

        //ir arriba
        resultado = resolverLaberinto(x-1, y);
        if(resultado) return true;

        //ir abajo
        resultado = resolverLaberinto(x+1, y);
        if(resultado) return true;

        matrizHospital[x][y].setTipo("f");
        return false;
    }
    private void imprimirHospital() {
        for (int i = 0; i < matrizHospital.length; i++) {
            for (int j = 0; j <matrizHospital[i].length ; j++) {
                System.out.print(matrizHospital[i][j].getTipo()+" ");
            }
            System.out.println();
        }
    }

    //punto 2

    //punto 3
    public boolean verificarTerminacionCedula(int i, int j, int num){
        char numeroFinal = matrizHospital[i][j].getId().charAt(matrizHospital[i][j].getId().length()-1);

        if(i == matrizHospital.length-1 && j == matrizHospital[i].length-1){
            if(numeroFinal == '7') num++;

            if(num >= 3){
                return true;
            }
            return false;
        }else{
            if(numeroFinal == '7') num++;

            if(j == matrizHospital[i].length-1){
                i++;
                j=0;
            }else{
                j++;
            }
            return verificarTerminacionCedula(i,j,num);
        }
    }


    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.resolverLaberinto(3,0);
        //System.out.println("Este es el recorrido que debe hacer el auxiliar (donde hay '0') es por donde puede transitar: ");
        //hospital.imprimirHospital();

        System.out.println("\n"+hospital.verificarTerminacionCedula(0,0,0));

        //punto4
        Set<String> hs = new HashSet<>();
        hs.add("Computer");
        hs.add("Programming");
        hs.add("Computer");
        hs.add("Networks");
        hs.add("Network");
        hs.add("Security");

        Set<String> ts = new TreeSet<String>(hs);
        System.out.println(ts);
    }



}
