package tarjeta;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public abstract class Tarjeta {
    private String numero;
    private String nombreCompleto;
    private LocalDate vencimiento;
    private Integer CVV;
    private Double monto;
    private CostoBancario costoBancario;

    public Integer generadorNumeros(Integer minimo, Integer maximo) {
        Random random = new Random();
        return random.ints(minimo, maximo)
                .findFirst()
                .getAsInt();
    }

    public String generadorNumeroCuenta(String tipoCuenta) {
        String prefijo = "0";

        if(Objects.equals(tipoCuenta, "Joven"))
            prefijo = "500";

        if(Objects.equals(tipoCuenta, "Diez"))
            prefijo = "600";

        if(Objects.equals(tipoCuenta, "Oro"))
            prefijo = "700";

        if(Objects.equals(tipoCuenta, "Estandar"))
            prefijo = "800";

        return prefijo + this.generadorNumeros(1000, 10000).toString() + this.generadorNumeros(1000, 10000).toString() + this.generadorNumeros(1000, 10000).toString();
    }

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getCVV() {
        return CVV;
    }

    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public CostoBancario getCostoBancario() {
        return costoBancario;
    }

    public void setCostoBancario(CostoBancario costoBancario) {
        this.costoBancario = costoBancario;
    }

    //</editor-fold>
}
