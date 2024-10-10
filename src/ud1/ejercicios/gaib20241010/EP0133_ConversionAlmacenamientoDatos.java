package ud1.ejercicios.gaib20241010;

import java.util.Scanner;

public class EP0133_ConversionAlmacenamientoDatos {
    public static void main(String[] args) {
        double medidaOrigen, medidaDestino, cantidad, resultado;
        final double KB = 1024;
        String medidaDestinoImprimir;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la medida de origen (1 = KB, 2 = MB, 3 GB): ");
        medidaOrigen = sc.nextInt();
        System.out.print("Inserte la cantidad que desea convertir: ");
        cantidad = sc.nextInt();
        System.out.print("Inserte la medida de destino (1 = KB, 2 = MB, 3 GB): ");
        medidaDestino = sc.nextInt();
        sc.close();

        cantidad = medidaOrigen == 1 ? cantidad : medidaOrigen == 2 ? cantidad * KB : cantidad * KB * KB;
        resultado = medidaDestino == 1 ? cantidad : medidaDestino == 2 ? cantidad / KB : cantidad / KB / KB;
        medidaDestinoImprimir = medidaDestino == 1 ? "KB" : medidaDestino == 2 ? "MB" : "GB";

        System.out.printf("Son %.2f %s %n ", resultado, medidaDestinoImprimir);

    }
}
