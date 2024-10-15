package ud1.ejercicios;

import java.util.Scanner;

public class EP0132_ConversionArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int medidaOrigen,medidaDestino;
        double cantidadOrigen,cantidadDestino;
        final double HECTAREAS_METROS = 10000;
        final double METROS_PIES = 10.7639;

        System.out.print("Escoja la medida de origen: metros cuadrados (1), hectáreas (2) o pies cuadrados(3): ");
        medidaOrigen=sc.nextInt();
        System.out.print("Inserte el area: ");
        cantidadOrigen = sc.nextDouble();
        System.out.println("Escoja la medida de destino: metros cuadrados (1), hectáreas (2) o pies cuadrados(3): ");
        medidaDestino = sc.nextInt();
        sc.close();

        cantidadDestino = medidaOrigen == 1 ? cantidadOrigen : medidaOrigen == 2 ? cantidadOrigen * HECTAREAS_METROS : cantidadOrigen / METROS_PIES;
        cantidadDestino = medidaDestino == 1 ? cantidadDestino : medidaDestino == 2 ? cantidadDestino / HECTAREAS_METROS : cantidadDestino * METROS_PIES;

        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen,
                medidaOrigen == 1 ? "metros cuadrados" : medidaOrigen == 2 ? "hectáreas" : "pies cuadrados", cantidadDestino,
                medidaDestino == 1 ? "metros cuadrados" : medidaDestino == 2 ? "hectáreas" : "pies cuadrados");
    }
}
