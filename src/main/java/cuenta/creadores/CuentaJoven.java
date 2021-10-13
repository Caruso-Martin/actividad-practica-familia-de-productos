package cuenta.creadores;

import cuenta.Cuenta;
import cuenta.Regalo;
import tarjeta.TarjetaDebito;

public class CuentaJoven extends Cuenta {
    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public CuentaJoven(String nombreCompleto) {
        this.setPorcentajeInteres(2.0);
        this.setTarjetaDebito(new TarjetaDebito("Joven", nombreCompleto));
        this.setRegalo(Regalo.CDMUSICA);
    }
    //</editor-fold>
}
