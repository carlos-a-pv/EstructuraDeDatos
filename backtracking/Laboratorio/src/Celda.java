public class Celda extends EspacioPrision{

    private Prisionero prisionero;
    private boolean estado;

    public Celda(){
        this.estado = true;
    }

    public Prisionero getPrisionero() {
        return prisionero;
    }

    public void setPrisionero(Prisionero prisionero) {
        this.prisionero = prisionero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Celd";
    }
}
