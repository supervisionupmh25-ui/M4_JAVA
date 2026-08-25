package S09.abstraccion;

public class EnvioExpress extends Envio {
    // Constructor
    public EnvioExpress(String destino) {
        super(destino);
    }


    // Uso de método abstracto
    @Override
    public double calcularCosto(double peso) {
        // Tarifa: $100 base + $25 por cada kilo  
        return 100.0 + (25.0 * peso);
    }
}
