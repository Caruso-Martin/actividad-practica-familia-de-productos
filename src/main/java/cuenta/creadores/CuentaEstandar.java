package cuenta.creadores;

import cuenta.Cuenta;
import tarjeta.TarjetaDebito;

public class CuentaEstandar extends Cuenta {
    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public CuentaEstandar(String nombreCompleto) {
        this.setPorcentajeInteres(0.5);
        this.setTarjetaDebito(new TarjetaDebito("Estandar", nombreCompleto));
        this.setRegalo(null);
    }

    //</editor-fold>
}