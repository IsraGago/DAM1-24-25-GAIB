package ud1.ejercicios;

import java.util.Scanner;

public class EP0137_ConversionMoneda {
    public static void main(String[] args) {
        double cantidadOrigen, cantidadDestino, valorMoneda;
        int monedaOrigen;
        String nombreMoneda;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el nombre de su moneda: ");
        nombreMoneda = sc.nextLine();
        System.out.println("Inserte el valor de su moneda comparada con un euro: ");
        valorMoneda = sc.nextDouble();
        System.out.print("Escoga la moneda de origen: " + nombreMoneda + " (1) o euros (2): ");
        monedaOrigen = sc.nextInt();
        System.out.print("Inserte la cantidad de dinero: ");
        cantidadOrigen = sc.nextDouble();
        sc.close();

        cantidadDestino = monedaOrigen == 1 ? cantidadOrigen * valorMoneda : cantidadOrigen / valorMoneda;
        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen, monedaOrigen == 1 ? nombreMoneda : "euros",
                cantidadDestino, monedaOrigen == 1 ? "euros" : nombreMoneda);
    }
}
