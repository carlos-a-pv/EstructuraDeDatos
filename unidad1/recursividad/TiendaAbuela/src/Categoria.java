import java.util.ArrayList;

public class Categoria {

    private String nombre;
    private ArrayList<Categoria> listaSubCategorias;
    private ArrayList<Producto> listaProductos;

    public Categoria(String nombre){
        this.nombre = nombre;
        listaProductos = new ArrayList<>();
        listaSubCategorias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Categoria> getListaSubCategorias() {
        return listaSubCategorias;
    }

    public void setListaSubCategorias(ArrayList<Categoria> listaSubCategorias) {
        this.listaSubCategorias = listaSubCategorias;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public ArrayList<Producto> buscarProductos(double valor){
        ArrayList<Producto> aux = new ArrayList<>();

        getListaProductos().forEach(producto -> {
            if(producto.getPrecio() <= valor){
                aux.add(producto);
            }
        });

        getListaSubCategorias().forEach(subCategoria -> {
            aux.addAll(subCategoria.buscarProductos(valor));
        });

        return aux;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
