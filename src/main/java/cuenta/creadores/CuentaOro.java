package cuenta.creadores;

import cuenta.Cuenta;
import cuenta.Regalo;
import tarjeta.TarjetaCredito;
import tarjeta.TarjetaDebito;

public class CuentaOro extends Cuenta {
    private TarjetaCredito tarjetaCredito;

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public CuentaOro(String nombreCompleto) throws Exception {
        this.setPorcentajeInteres(1.5);
        this.setTarjetaDebito(new TarjetaDebito("Oro", nombreCompleto));
        this.setTarjetaCredito(new TarjetaCredito("Oro", nombreCompleto));
        this.setRegalo(Regalo.SEGURO);
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    //</editor-fold>
}
