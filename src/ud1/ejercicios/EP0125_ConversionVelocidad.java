package ud1.ejercicios;

import java.util.Scanner;

public class EP0125_ConversionVelocidad {
    public static void main(String[] args) {
        int medidaDestino, medidaOrigen;
        double cantidadOrigen, cantidadDestino;
        final double KM_MS = 0.27778;
        final double MPS_KM = 1.60934;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la unidad de medida de origen km/h (1) m/s (2) mph (3): ");
        medidaOrigen = sc.nextInt();
        System.out.print("Inserte la velocidad: ");
        cantidadOrigen = sc.nextDouble();
        System.out.print("Inserte la unidad de medida de destino km/h (1) m/s (2) mph (3): ");
        medidaDestino = sc.nextInt();
        sc.close();


        cantidadDestino = medidaOrigen == 1 ? cantidadOrigen
                : medidaOrigen == 2 ? cantidadOrigen / KM_MS : cantidadOrigen * MPS_KM;
        cantidadDestino = medidaDestino == 1 ? cantidadDestino
                : medidaDestino == 2 ? cantidadDestino * KM_MS : cantidadDestino / MPS_KM;

        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen,
                medidaOrigen == 1 ? "km/h" : medidaOrigen == 2 ? "m/s" : "mph", cantidadDestino,
                medidaDestino == 1 ? "km/h" : medidaDestino == 2 ? "m/s" : "mph");
    }
}
