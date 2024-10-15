package ud1.ejercicios;

import java.util.Scanner;

public class EP0134_ConversionEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int medidaOrigen,medidaDestino;
        double cantidadOrigen,cantidadDestino;
        final double CALORIAS_JULIOS = 4.184;
        final double KILOVATIOS_JULIOS = 3600000;

        System.out.print("Inserte la medida de origen julios (1), calorias (2), kilovatios-hora(3): ");
        medidaOrigen = sc.nextInt();
        System.out.print("Inserte la cantidad: ");
        cantidadOrigen = sc.nextDouble();
        System.out.print("Inserte la medida de destino julios (1), calorias (2), kilovatios-hora(3): ");
        medidaDestino = sc.nextInt();

        cantidadDestino = medidaOrigen == 1 ? cantidadOrigen : medidaOrigen == 2 ? cantidadOrigen * CALORIAS_JULIOS : cantidadOrigen * KILOVATIOS_JULIOS;
        cantidadDestino = medidaDestino == 1 ? cantidadDestino : medidaDestino == 2 ? cantidadDestino / CALORIAS_JULIOS : cantidadDestino / KILOVATIOS_JULIOS;

        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen,
                medidaOrigen == 1 ? "julios" : medidaOrigen == 2 ? "calorias" : "kilovatios-hora", cantidadDestino,
                medidaDestino == 1 ? "julios" : medidaDestino == 2 ? "calorias" : "kilovatios-hora");


        sc.close();
    }
}
