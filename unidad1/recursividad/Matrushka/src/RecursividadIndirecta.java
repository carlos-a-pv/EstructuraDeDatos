public class RecursividadIndirecta {
    public static void main(String[] args) {
        System.out.println("RECURSIVIDAD CRUZADA");
        System.out.println(par(23));
    }

    public static int par(int n){
        if(n==0) return 1;
        return impar(n-1);
    }

    public static int impar(int n){
        if( n==0) return 0;
        return par(n-1);
    }
}
