package preparcial3.Punto1;

public class Salon extends EspacioBloque{

    private String numeroSalon;
    private Estado estado;

    public Salon(String numeroSalon){
        this.numeroSalon = numeroSalon;
    }
    public String getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(String numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Salo";
    }
}
