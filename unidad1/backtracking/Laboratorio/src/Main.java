public class Main {
    public static void main(String[] args) {

        Prision prision = new Prision("CARCEL ESTRUCTURA DE DATOS");
        EspacioPrision[][] matrizPisoUno = prision.verificarPrisionereos();

        System.out.println(prision.getNombre()+"\n");

        for (int i = 0; i < matrizPisoUno.length; i++) {
            for (int j = 0; j < matrizPisoUno[i].length; j++) {
                System.out.print(matrizPisoUno[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println("\nEl total de prisioneros es: "+prision.getPiso1().getNumeroPrisioneros());
        System.out.println("Los prisioneros contados que hay son: "+prision.getPiso1().getCuentaPrisioneros());
        if(prision.getPiso1().getCuentaPrisioneros() == prision.getPiso1().getNumeroPrisioneros()){
            System.out.println("ESTÁN TODOS LOS PRISIONEROS");
        }else{
            System.out.println("FALTA PRISIONEROS!!!");
        }

    }
}