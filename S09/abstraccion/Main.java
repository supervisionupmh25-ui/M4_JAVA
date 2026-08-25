package S09.abstraccion;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=".repeat(80));
        System.out.println("COTIZACIÓN DE ENVÍOS");
        System.out.println("=".repeat(80));


        System.out.println("¿A que ciudad se envía el paquete?");
        String ciudad = scanner.nextLine();


        System.out.println("Ingrese el peso del paquete en KG");
        double peso = scanner.nextDouble();


        EnvioEstandar op1 = new EnvioEstandar(ciudad);
        EnvioExpress op2 = new EnvioExpress(ciudad);


        System.out.println("=".repeat(80));
        System.out.println("Cotización de envío para " + ciudad);
        System.out.println("=".repeat(80));
        System.out.println("Costo del envío Estándar: " + op1.calcularCosto(peso));
        System.out.println("Costo del envío Express: " + op2.calcularCosto(peso));
    }
}
