package tarjeta;

import java.time.LocalDate;
import java.util.Objects;

public class TarjetaCredito extends Tarjeta {
    private Double porcentajePension;
    private Double porcentajeNomina;

    public CostoBancario asignarCostoBancario(String tipoCuenta) throws Exception {
        if(Objects.equals(tipoCuenta, "Diez"))
            return new CostoBancario(Moneda.DOLAR, 180.0);

        if(Objects.equals(tipoCuenta, "Oro"))
            return new CostoBancario(Moneda.DOLAR, 0.0);

        throw new Exception("Una cuenta Joven/Estandar no puede tener una Tarjeta de Credito.");
    }

    public Double asignarPorcentajePension(String tipoCuenta) throws Exception {
        if(Objects.equals(tipoCuenta, "Diez"))
            return 0.0;

        if(Objects.equals(tipoCuenta, "Oro"))
            return 60.0;

        throw new Exception("Una cuenta Joven/Estandar no puede tener una Tarjeta de Credito.");
    }

    public Double asignarPorcentajeNomina(String tipoCuenta) throws Exception {
        if(Objects.equals(tipoCuenta, "Diez"))
            return 60.0;

        if(Objects.equals(tipoCuenta, "Oro"))
            return 0.0;

        throw new Exception("Una cuenta Joven/Estandar no puede tener una Tarjeta de Credito.");
    }

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public TarjetaCredito(String tipoCuenta, String nombreCompleto) throws Exception {
        this.setNumero("5" + this.generadorNumeroCuenta(tipoCuenta));
        this.setNombreCompleto(nombreCompleto);
        this.setVencimiento(LocalDate.now().plusYears(10));
        this.setCVV(this.generadorNumeros(100, 1000));
        this.setMonto(0.0);
        this.setCostoBancario(this.asignarCostoBancario(tipoCuenta));
        this.setPorcentajePension(this.asignarPorcentajePension(tipoCuenta));
        this.setPorcentajeNomina(this.asignarPorcentajeNomina(tipoCuenta));
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public Double getPorcentajePension() {
        return porcentajePension;
    }

    public void setPorcentajePension(Double porcentajePension) {
        this.porcentajePension = porcentajePension;
    }

    public Double getPorcentajeNomina() {
        return porcentajeNomina;
    }

    public void setPorcentajeNomina(Double porcentajeNomina) {
        this.porcentajeNomina = porcentajeNomina;
    }

    //</editor-fold>
}
