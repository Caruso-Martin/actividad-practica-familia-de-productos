package tarjeta;

public class CostoBancario {
    private Moneda moneda;
    private Double valor;

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public CostoBancario(Moneda moneda, Double valor) {
        this.moneda = moneda;
        this.valor = valor;
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //</editor-fold>
}
