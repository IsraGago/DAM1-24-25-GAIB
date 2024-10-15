package ud1.ejercicios;

import java.util.Scanner;

public class EP0135_ConversionPresion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int medidaOrigen,medidaDestino;
        double cantidadOrigen,cantidadDestino;
        final double ATMOSFERA_PASCAL = 101325 ;
        final double ATMOSFERA_MERCURIO = 760 ;

        System.out.print("Inserte la medida de origen: pascales(1), atmósferas(2) o milímetros de mercurio(3): ");
        medidaOrigen = sc.nextInt();
        System.out.print("Inserte la presión: ");
        cantidadOrigen = sc.nextInt();
        System.out.print("Inserte la medida de destino: pascales(1), atmósferas(2) o milímetros de mercurio(3): ");
        medidaDestino = sc.nextInt();

        cantidadDestino = medidaOrigen == 2 ? cantidadOrigen : medidaOrigen == 1? cantidadOrigen / ATMOSFERA_PASCAL : cantidadOrigen / ATMOSFERA_MERCURIO;
        cantidadDestino = medidaDestino == 2 ? cantidadDestino : medidaDestino == 1 ? cantidadDestino *  ATMOSFERA_PASCAL : cantidadDestino * ATMOSFERA_MERCURIO;

        System.out.printf("%.2f %s son %.2f %s", cantidadOrigen,
        medidaOrigen == 1 ? "pascales" : medidaOrigen == 2 ? "atmósferas" : "milímetros de mercurio", cantidadDestino,
        medidaDestino == 1 ? "pascales" : medidaDestino == 2 ? "atmósferas" : "milímetros de mercurio");

        sc.close();
    }
}
