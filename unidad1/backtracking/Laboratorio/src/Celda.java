public class Celda extends EspacioPrision{

    private Prisionero prisionero;
    private boolean estado;
    private boolean visistado;

    public Celda(boolean estado){
        this.estado = estado;
        this.visistado = false;
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

    public boolean isVisistado() {
        return visistado;
    }

    public void setVisistado(boolean visistado) {
        this.visistado = visistado;
    }

    @Override
    public String toString() {
        return "Celd";
    }
}
