package S09.interfaz;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        TarjetaCredito tdc = new TarjetaCredito("5598");
        PayPal pp = new PayPal("carlos.correo@gmail.com");


        System.out.println("Ingrese el total de su carrito de compras: ");
        double total = scanner.nextDouble();


        System.out.println("=== Intentando cobro con Tarjeta ===");
        tdc.procesarPago(total);


        System.out.println("=== Intentando cobro con PayPal ===");
        pp.procesarPago(total);


        scanner.close();
    }
}
