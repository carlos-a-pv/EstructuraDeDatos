public class Habitacion {

    private String id;
    private String numeroHabitacion;
    private boolean estado;
    private String tipo;

    public Habitacion(String tipo){
        this.tipo = tipo;
        this.estado = true;
        this.id = "123";
    }

    public Habitacion(String tipo, boolean estado){
        this.tipo = tipo;
        this.estado = estado;
        this.id = "123";
    }

    public Habitacion(String tipo, String id){
        this.tipo = tipo;
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
