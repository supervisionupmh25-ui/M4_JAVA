package S11.Uber;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-".repeat(60));
        System.out.println("COTIZACIÓN PARA VIAJE EN UBER");
        System.out.println("-".repeat(60));


        System.out.println("Por favor, ingresa los km del viaje: ");
        double km = scanner.nextDouble();


        ViajeEconomico ve = new ViajeEconomico(km);
        ViajeVip vv = new ViajeVip(km);


        System.out.println("-".repeat(60));
        System.out.println("PRECIOS PARA LOS DISTINTOS VIAJ6");
        System.out.println("-".repeat(60));


        System.out.println("Costo por viaje Economico: --> $" + ve.costoFinal());
        System.out.println("Costo por viaje Vip: --> $" + vv.costoFinal());


        scanner.close();
    }
}
