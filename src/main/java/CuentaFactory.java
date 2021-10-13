import cuenta.*;
import cuenta.creadores.*;

public class CuentaFactory {
    public Cuenta crearCuenta(String nombreCompleto, Integer edad, Boolean tieneNomina, Boolean tienePension) throws Exception {
        if(edad > 0 && edad <= 25)
            return new CuentaJoven(nombreCompleto);
        if(edad > 25 && edad <= 65 && tieneNomina)
            return new CuentaDiez(nombreCompleto);
        if(edad > 65 && tienePension)
            return new CuentaOro(nombreCompleto);

        return new CuentaEstandar(nombreCompleto);
    }
}
