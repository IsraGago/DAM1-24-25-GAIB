package ud1.ejercicios;

import java.util.Scanner;

public class EP0136_ConversionMonedaPolaca {
    public static void main(String[] args) {
        final double ESLOTI_EURO = 0.23;
        double cantidadOrigen,cantidadDestino;
        int monedaOrigen;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escoga la moneda de origen: esloti (1) o euros (2): ");
        monedaOrigen = sc.nextInt();
        System.out.print("Inserte la cantidad de dinero: ");
        cantidadOrigen = sc.nextDouble();
        sc.close();

        cantidadDestino = monedaOrigen == 1 ? cantidadOrigen * ESLOTI_EURO : cantidadOrigen / ESLOTI_EURO ;
        System.out.printf("%.2f %s son %.2f %s",cantidadOrigen,monedaOrigen == 1 ? "eslotis" : "euros",cantidadDestino,monedaOrigen == 1 ? "euros" : "eslotis");
    }
}
