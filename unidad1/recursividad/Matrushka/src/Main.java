public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        imprimir(0);
        System.out.println();
        imprimir2(0);
    }
    public static void imprimir(int x){
        if(x <= 5){
            System.out.print(x + " ");
            imprimir(x+1);
        }
    }
    public static void imprimir2(int x){
        if (x == 5){
            System.out.print(x);
        }else{
            System.out.print(x + " ");
            imprimir2(x+1);
        }
    }
}