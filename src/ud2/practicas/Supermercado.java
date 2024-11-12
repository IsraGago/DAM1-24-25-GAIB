package ud2.practicas;

import java.util.Scanner;

public class Supermercado {
    static void pagarConEfectivo(double cantidadEfectivo, double importeAPagar) {
        final int CENTIMOS = 100;
        int cambio = (int) Math.round((cantidadEfectivo - importeAPagar) * CENTIMOS);
        if (importeAPagar > 0) {
            System.out.printf("El importe a devolver son: %.2f%n", cantidadEfectivo-importeAPagar);
            int billetes50 = cambio / (50 * CENTIMOS);
            cambio = cambio % (50 * CENTIMOS);

            int billetes20 = cambio / (20 * CENTIMOS);
            cambio = cambio % (20 * CENTIMOS);

            int billetes10 = cambio / (10 * CENTIMOS);
            cambio = cambio % (10 * CENTIMOS);

            int billetes5 = cambio / (5 * CENTIMOS);
            cambio = cambio % (5 * CENTIMOS);

            int euros2 = cambio / (2 * CENTIMOS);
            cambio = cambio % (2 * CENTIMOS);

            int euros1 = cambio / (1 * CENTIMOS);
            cambio = cambio % (1 * CENTIMOS);

            int centimos50 = cambio / 50;
            cambio = cambio % 50;

            int centimos20 = cambio / 20;
            cambio = cambio % 20;

            int centimos10 = cambio / 10;
            cambio = cambio % 10;

            int centimos5 = cambio / 5;
            cambio = cambio % 5;

            int centimos2 = cambio / 2;
            cambio = cambio % 2;

            int centimos1 = cambio;

            System.out.printf("cantidad de billetes de 50 euros: %d%n", billetes50);
            System.out.printf("cantidad de billetes de 20 euros: %d%n", billetes20);
            System.out.printf("cantidad de billetes de 10 euros: %d%n", billetes10);
            System.out.printf("cantidad de billetes de 5 euros: %d%n", billetes5);
            System.out.printf("cantidad de monedas de 2 euros: %d%n", euros2);
            System.out.printf("cantidad de monedas de 1 euro: %d%n", euros1);
            System.out.printf("cantidad de monedas de 50 centimos: %d%n", centimos50);
            System.out.printf("cantidad de monedas de 20 centimos: %d%n", centimos20);
            System.out.printf("cantidad de monedas de 10 centimos: %d%n", centimos10);
            System.out.printf("cantidad de monedas de 5 centimos: %d%n", centimos5);
            System.out.printf("cantidad de monedas de 2 centimos: %d%n", centimos2);
            System.out.printf("cantidad de monedas de 1 centimos: %d%n", centimos1);
        } else {
            System.out.println("Importe justo, no sobra dinero.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe, importeTotal = 0;
        int cantidad;

        do {
            System.out.print("Introduzca el importe del producto (0 para salir): ");
            importe = sc.nextDouble();
            if (importe > 0) {
                System.out.print("Introduzca la cantidad del producto: ");
                cantidad = sc.nextInt();
                if (importe > 0 && cantidad > 0) {
                    importeTotal += importe * cantidad;
                } else {
                    System.out.println("La cantidad no puede ser menor o igual a 0.");
                }
            }

        } while (importe != 0);

        System.out.printf("El importe total de la compra es %.2f%n", importeTotal);
        System.out.print("Desea pagar con efectivo (1) o tarjeta (2): ");
        int respuesta = sc.nextInt();
        while (respuesta != 1 && respuesta != 2) {
            System.out.print("Desea pagar con efectivo (1) o tarjeta (2): ");
            respuesta = sc.nextInt();
        }

        switch (respuesta) {
            case 1:
                System.out.print("Introduzca la cantidad de efectivo: ");
                double cantidadEfectivo = sc.nextDouble();
                while (cantidadEfectivo < importeTotal) {
                    System.out.println("La cantidad en efectivo debe ser igual o mayor que el importe total");
                    System.out.print("Introduzca la cantidad de efectivo: ");
                    cantidadEfectivo = sc.nextDouble();
                }
                pagarConEfectivo(cantidadEfectivo, importeTotal);
                break;
            case 2:
                break;
            default:
                System.out.println("La respuesta debe ser 1 para pagar con efectivo o 2 para pagar con tarjeta");
                break;

        }

        sc.close();
        System.out.println("Gracias por su compra, vuelva pronto!!");

    }
}
