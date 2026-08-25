package S09.abstraccion;

public class EnvioEstandar extends Envio {
    // Constructor
    public EnvioEstandar(String destino){
        super(destino);
    }


    // Uso de método abstracto
    @Override
    public double calcularCosto(double peso) {
        // Tarifa: $50 base + $10 por cada kilo  
        return 50.0 + (10.0 * peso);
    }
}
