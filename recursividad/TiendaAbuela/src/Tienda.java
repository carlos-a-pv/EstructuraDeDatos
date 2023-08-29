import java.util.ArrayList;

public class Tienda {

    private String nombre;
    private String nit;
    private static ArrayList<Categoria> listaCategorias;

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
        aseo.getListaProductos().add(new Producto("detergente", 100));

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

    public static ArrayList<Producto> buscarProducto(double valor) {
        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaCategorias.forEach(categoria -> {
            listaProductos.addAll(categoria.buscarProductos(valor));
        });
        return listaProductos;
    }
}
