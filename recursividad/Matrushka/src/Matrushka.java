public class Matrushka {
    public static void main(String[] args) {
        recorrerMatrushka(5);
    }

    public static void recorrerMatrushka(int n){
        if(n == 0){
            System.out.println("Abriendo última muñeca");
            System.out.println("Cerradno última muñeca");
        }else{
            System.out.println("Abriendo muñeca: "+n);
            recorrerMatrushka(n-1);
            System.out.println("Cerrando muñeca "+n);
        }
    }
}
