package preparcial3.Punto1;

public class BloqueIngenieria {

    private EspacioBloque[][] bloque = {
            {new Salon("001"), new Salon("002"), new Salon("003"), new Auditorio(), new Banio()},
            {new Pasillo(), new Pasillo(), new Pasillo(), new Salon("004"), new Pasillo()},
            {new Salon("005"), new Pasillo(), new Salon("006"), new Pasillo(), new Salon("007")},
            {new Auditorio(), new Pasillo(), new Pasillo(), new Pasillo(), new Salon("008")},
            {new Salon("009"), new Salon("010"), new Salon("011"), new Pasillo(), new Pasillo()}
    };

    public boolean recorrerBloque(int x, int y, String numeroSalon){

        if(x == -1 || x > bloque.length-1 || y == -1 || y > bloque[x].length-1) return false;

        if(bloque[x][y] == null) return false;

        if(bloque[x][y] instanceof Salon && ((Salon) bloque[x][y]).getNumeroSalon().equals(numeroSalon)) return true;

        if(bloque[x][y] instanceof Salon || bloque[x][y] instanceof Auditorio || bloque[x][y] instanceof Banio) return false;

        bloque[x][y] = null;
        boolean resultado;

        resultado = recorrerBloque(x, y-1, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x-1, y, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x, y+1, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x+1, y, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x-1, y+1, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x-1,y-1, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x+1, y-1, numeroSalon);
        if(resultado) return true;

        resultado = recorrerBloque(x+1, y+1, numeroSalon);
        if(resultado) return true;

        return false;

    }

    public static void main(String[] args) {
        BloqueIngenieria bloque = new BloqueIngenieria();
        System.out.println("BLOQUE DE INGENIERIA\n");
        if(bloque.recorrerBloque(4,4, "001") == false){
            System.out.println("NO SE PUDO RESOLVER EL PROBLEMA");
        }else{

        }
        for (int i = 0; i < bloque.bloque.length; i++) {
            for (int j = 0; j < bloque.bloque[i].length; j++) {
                System.out.print(bloque.bloque[i][j]+"|");
            }
            System.out.println();
        }
    }


}
