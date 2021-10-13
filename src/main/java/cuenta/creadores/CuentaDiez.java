package cuenta.creadores;

import cuenta.Cuenta;
import cuenta.Regalo;
import tarjeta.TarjetaCredito;
import tarjeta.TarjetaDebito;

public class CuentaDiez extends Cuenta {
    private TarjetaCredito tarjetaCredito;
    private Double porcentajeDescubierto;

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public CuentaDiez(String nombreCompleto) throws Exception {
        this.setPorcentajeInteres(1.5);
        this.setTarjetaDebito(new TarjetaDebito("Diez", nombreCompleto));
        this.setTarjetaCredito(new TarjetaCredito("Diez", nombreCompleto));
        this.setRegalo(Regalo.REPRODUCTORCD);
        this.setPorcentajeDescubierto(50.0);
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Double getPorcentajeDescubierto() {
        return porcentajeDescubierto;
    }

    public void setPorcentajeDescubierto(Double porcentajeDescubierto) {
        this.porcentajeDescubierto = porcentajeDescubierto;
    }

    //</editor-fold>
}
