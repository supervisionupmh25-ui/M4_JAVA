package S11.Uber;


public class ViajeVip extends Viaje {
    // Constructor de la clase que heredamos
    public ViajeVip(double distancia){
        super(distancia);
    }


    // Sobreescritura del método abstracto
    @Override
    public double costoFinal() {
        double total = (distancia * 25.0) + 50.00;
        return Math.round(total * 100.0) / 100.0;
    }
}
