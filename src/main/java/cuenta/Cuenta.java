package cuenta;

import tarjeta.TarjetaDebito;

public abstract class Cuenta {
    private Double porcentajeInteres;
    private TarjetaDebito tarjetaDebito;
    private Regalo regalo;

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public Double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(Double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Regalo getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo regalo) {
        this.regalo = regalo;
    }


    //</editor-fold>
}
