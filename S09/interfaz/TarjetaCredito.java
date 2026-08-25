package S09.interfaz;

public class TarjetaCredito implements ProcesadorPago {
    private String terminacion;


    public TarjetaCredito(String terminacion) {
        this.terminacion = terminacion;
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $" + monto + " a la tarjeta con terminación "+ terminacion);
    }
}

