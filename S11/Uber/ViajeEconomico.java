package S11.Uber;

public class ViajeEconomico extends Viaje {
    // Constructor de la clase que heredamos
    public ViajeEconomico(double distancia){
        super(distancia);
    }


    // Sobreescritura del método abstracto
    @Override
    public double costoFinal() {
        double total = distancia * 15.0;
        return Math.round(total * 100.0) / 100.0;
    }
}
