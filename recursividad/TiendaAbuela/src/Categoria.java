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

    public static ArrayList<Producto> servicioBuscarProductos(double valor, ArrayList<Categoria> listaCategorias){
        return buscarProductos(valor, listaCategorias, new ArrayList<>());
    }

    private static ArrayList<Producto> buscarProductos(double valor, ArrayList<Categoria> listaCategorias, ArrayList<Producto> listaProductosFilter){
        listaCategorias.forEach(categoria -> {
            categoria.getListaProductos().forEach(producto -> {
                if(producto.getPrecio() <= valor){
                    listaProductosFilter.add(producto);
                }
            });
            buscarProductos(valor, categoria.getListaSubCategorias(), listaProductosFilter);
        });
        return listaProductosFilter;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
