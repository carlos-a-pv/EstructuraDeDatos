import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Tienda miTienda = new Tienda("MI TIENDA", "123");
        miTienda.iniciarTiendaPrueba();
        miTienda.buscarProducto(200).forEach(producto -> {
            System.out.print(producto.getNombre()+"|");
        });
   }
}