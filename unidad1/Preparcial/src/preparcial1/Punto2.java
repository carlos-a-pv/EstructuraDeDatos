package preparcial1;

public class Punto2 {

    /*Dada una secuencia  en un arreglo de cadenas:
            String secuencia[] = {“AEDRTYU”,
                                 ”FYUIHVG”,
                                 ”AYUIHNM”,
                          ”IPUIHOL”};
      realizar el o los métodos necesarios para saber si en dicha secuencia existen 4
      caracteres repetidos en la diagonal principal, haciendo uso de recursividad.(no ciclos),
       la secuencia puede ser de cualquier tamaño*/

    private String[] secuencia = {
            "AEDRTYU",
            "FAUIHVG",
            "AYAIHNM",
            "IPUAHOL" };

    public static void main(String[] args) {
        Punto2 clase = new Punto2();
        String diagonalPrincipal = clase.devolverDiagonalPrincipal(clase.secuencia, 0);
        boolean resultado = clase.validarElementosRepetidosDiagonalPrincipal( diagonalPrincipal);

        if(resultado){
            System.out.println("SI existen 4 caracteres repetidos en la diagonal principal");
        }else{
            System.out.println("NO existen 4 caracteres repetidos en la diagonal principal");
        }
    }

    private  boolean validarElementosRepetidosDiagonalPrincipal(String diagonalPrincipal) {
        boolean resultado = true;
        for (int i = 0; i < diagonalPrincipal.length()-2; i++) {
            if(diagonalPrincipal.charAt(i) != diagonalPrincipal.charAt(i+1)){
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public String devolverDiagonalPrincipal(String[] sec, int i){
        if(i == sec.length){
            return "";
        }else{
            return recorrerPalabra(sec[i], i, 0) + devolverDiagonalPrincipal(sec, i+1);
        }
    }

    private char recorrerPalabra(String s, int i, int j) {
        if(j == s.length()-1){
            return ' ';
        }
        if(j == i){
            return s.charAt(j);
        }
        return recorrerPalabra(s,i,j+1);
    }
}
