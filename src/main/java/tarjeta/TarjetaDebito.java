package tarjeta;

import java.time.LocalDate;
import java.util.Objects;

public class TarjetaDebito extends Tarjeta {
    public CostoBancario asignarCostoBancario(String tipoCuenta) {
        if(Objects.equals(tipoCuenta, "Estandar"))
            return new CostoBancario(Moneda.PESO, 50.0);

        return new CostoBancario(Moneda.PESO, 0.0);
    }

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public TarjetaDebito(String tipoCuenta, String nombreCompleto) {
        this.setNumero("4" + this.generadorNumeroCuenta(tipoCuenta));
        this.setNombreCompleto(nombreCompleto);
        this.setVencimiento(LocalDate.now().plusYears(10));
        this.setCVV(this.generadorNumeros(100, 1000));
        this.setMonto(0.0);
        this.setCostoBancario(this.asignarCostoBancario(tipoCuenta));
    }

    //</editor-fold>
}
