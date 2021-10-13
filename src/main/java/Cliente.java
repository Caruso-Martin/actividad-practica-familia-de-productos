import cuenta.Cuenta;

public class Cliente {
    private String nombreCompleto;
    private Cuenta cuenta;

    public void crearCuenta(String nombreCompleto, Integer edad, Boolean tieneNomina, Boolean tienePension) throws Exception {
        CuentaFactory cuentaFactory = new CuentaFactory();
        this.cuenta = cuentaFactory.crearCuenta(nombreCompleto, edad, tieneNomina, tienePension);
    }

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    //</editor-fold>
}
