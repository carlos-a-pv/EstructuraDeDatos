public class Main {
    public static void main(String[] args) {

        /*Cola<Integer> miPrimeraCola = new Cola<>();

        miPrimeraCola.encolar(1);
        miPrimeraCola.encolar(2);
        miPrimeraCola.encolar(3);
        miPrimeraCola.encolar(4);

        miPrimeraCola.printCola();
        try {
            System.out.println("\n\nEste fue el nodo desencolado: "+miPrimeraCola.desencolar().getValueNode());
            System.out.println("\n\nEste fue el nodo desencolado: "+miPrimeraCola.desencolar().getValueNode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        miPrimeraCola.printCola();*/

        Pila<String> miPrimeraPila = new Pila<>();

        //miPrimeraPila.apilar("m");
        //miPrimeraPila.apilar("a");
        //miPrimeraPila.apilar("c");

        miPrimeraPila.printPila();
        System.out.println("\n");

        try {
            System.out.println(miPrimeraPila.desapilar().getValueNode());
            System.out.println(miPrimeraPila.desapilar().getValueNode());
            System.out.println(miPrimeraPila.desapilar().getValueNode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
