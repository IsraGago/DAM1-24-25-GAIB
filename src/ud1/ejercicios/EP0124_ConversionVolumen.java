package ud1.ejercicios;

import java.util.Scanner;

public class EP0124_ConversionVolumen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GALONES_LITROS = 3.78541;
        double cantidadOrigen, cantidadDestino;
        int medida;

        System.out.print("Escoga el sistema de medida de origen litros (1) galones (2): ");
        medida = sc.nextInt();
        System.out.print("Inserte la cantidad: ");
        cantidadOrigen = sc.nextDouble();

        cantidadDestino = medida == 1 ? cantidadOrigen / GALONES_LITROS : cantidadOrigen * GALONES_LITROS;

        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen, medida == 1 ? "litros" : "galones", cantidadDestino,
                medida == 1 ? "galones" : "litros");

        sc.close();
    }
}
