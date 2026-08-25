package S09.interfaz;

public class PayPal implements ProcesadorPago {
    private String correo;


    public PayPal(String correo) {
        this.correo = correo;
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("Conectando con PayPal... Cobro de $" + monto + " a " + correo + " completado.");
    }
}
