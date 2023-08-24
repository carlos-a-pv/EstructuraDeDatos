import java.util.ArrayList;

public class Tienda {

    private String nombre;
    private String nit;
    private ArrayList<Categoria> listaCategorias;

    public Tienda(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        listaCategorias = new ArrayList<>();
    }

    public void iniciarTiendaPrueba(){

        Categoria aseo =   new Categoria("ASEO");
        Categoria granos =   new Categoria("GRANOS");
        Categoria lacteo =   new Categoria("LACTEO");

        aseo.getListaProductos().add(new Producto("jabon", 500));
        aseo.getListaProductos().add(new Producto("crema de dientes", 500));
        aseo.getListaProductos().add(new Producto("detergente", 500));

        granos.getListaProductos().add(new Producto("arroz", 500));
        granos.getListaProductos().add(new Producto("frijoles", 100));
        granos.getListaProductos().add(new Producto("lentejas", 100));

        lacteo.getListaProductos().add(new Producto("leche", 500));
        lacteo.getListaProductos().add(new Producto("queso", 400));
        lacteo.getListaProductos().add(new Producto("jamon", 80));

        Categoria yogurt = new Categoria("YOGURT");

        yogurt.getListaProductos().add(new Producto("yogurt de fresa", 100));
        yogurt.getListaProductos().add(new Producto("yogurt de mora", 90));
        yogurt.getListaProductos().add(new Producto("yogurt de melocoton", 500));


        lacteo.getListaSubCategorias().add(yogurt);

        listaCategorias.add(aseo);
        listaCategorias.add(granos);
        listaCategorias.add(lacteo);
    }

    private ArrayList<Producto> buscarProductos(double precio, ArrayList<Categoria> listaCategorias, ArrayList<Producto> listaProductosFilter){

        listaCategorias.forEach(categoria -> {
            categoria.getListaProductos().forEach(producto -> {
                if(producto.getPrecio() <= precio){
                    listaProductosFilter.add(producto);
                }
            });
            buscarProductos(precio, categoria.getListaSubCategorias(), listaProductosFilter);
        });

        return listaProductosFilter;
    }

    public ArrayList<Producto> servicioBuscarProductos(double precio){
        return buscarProductos(precio, getListaCategorias(), new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
}
