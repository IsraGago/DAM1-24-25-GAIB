package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {
    static Scanner sc = new Scanner(System.in);
    static void pagarConEfectivo(double cantidadEfectivo, double importeAPagar) {
        final int CENTIMOS = 100;
        int cambio = (int) Math.round((cantidadEfectivo - importeAPagar) * CENTIMOS);
        if (importeAPagar > 0) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.printf("El importe a devolver son: %.2f euros%n", cantidadEfectivo - importeAPagar);
            
            cambio = calcularCambio(cambio, 50 * CENTIMOS, "billetes de 50 euros");
            cambio = calcularCambio(cambio, 20 * CENTIMOS, "billetes de 20 euros");
            cambio = calcularCambio(cambio, 10 * CENTIMOS, "billetes de 10 euros");
            cambio = calcularCambio(cambio, 5 * CENTIMOS, "billetes de 5 euros");

            cambio = calcularCambio(cambio, 2 * CENTIMOS, "monedas de 2 euros");
            cambio = calcularCambio(cambio, 1 * CENTIMOS, "monedas de 1 euros");
            
            cambio = calcularCambio(cambio, 50 , "monedas de 50 céntimos");
            cambio = calcularCambio(cambio, 20 , "monedas de 20 céntimos");
            cambio = calcularCambio(cambio, 10 , "monedas de 10 céntimos");
            cambio = calcularCambio(cambio, 5 , "monedas de 5 céntimos");
            cambio = calcularCambio(cambio, 2 , "monedas de 2 céntimos");
            cambio = calcularCambio(cambio, 1 , "monedas de 1 céntimos");


        } else {
            System.out.println("Importe justo, no sobra dinero.");
        }

    }
    static int calcularCambio(int cambio, int valor, String mensaje){
        if (cambio == 1) {
            return 1;
        }
        int cantidad = cambio / valor;
        cambio = cambio % valor;
        imprimirCantidadDinero(mensaje, cantidad);
        return cambio;

    }

    static void imprimirCantidadDinero(String mensaje,int cantidad){
        if (cantidad > 0) {
            System.out.printf("Cantidad de "+mensaje+": %d%n", cantidad);
        }
    }

    static double leerDouble(String mensaje) {
        double numero = 0.0;
        boolean esValorCorrecto = false;
        while (!esValorCorrecto) {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                sc.nextLine();
                esValorCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: El dato introducido debe ser de tipo double.");
                // System.out.println(e.toString());
                sc.nextLine();
            }
        }
        return numero;
    }

    static int leerInt(String mensaje) {
        int numero = 0;
        boolean esValorCorrecto = false;
        while (!esValorCorrecto) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                esValorCorrecto = true;

            } catch (InputMismatchException e) {
                System.out.println("ERROR: El dato introducido debe ser un entero.");
                // System.out.println(e.toString());
                sc.nextLine();
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        double importe, importeTotal = 0;
        int cantidad;
        int contadorProductos = 1;

        do {
            importe = leerDouble("Introduzca el importe del producto ("+contadorProductos+") (0 para salir): ");
            if (importe > 0) {
                contadorProductos++;
                cantidad = leerInt("Introduzca la cantidad del producto: ");
                if (importe > 0 && cantidad > 0) {
                    importeTotal += importe * cantidad;
                } else {
                    System.out.println("La cantidad no puede ser menor o igual a 0.");
                }
            }

        } while (importe != 0);

        System.out.printf("El importe total de la compra es %.2f%n", importeTotal);
        int respuesta =leerInt("Desea pagar con efectivo (1) o tarjeta (2): ");
        while (respuesta != 1 && respuesta != 2) {
            respuesta = leerInt("Desea pagar con efectivo (1) o tarjeta (2): ");
        }

        switch (respuesta) {
            case 1:
                double cantidadEfectivo = leerDouble("Introduzca la cantidad de efectivo: ");
                while (cantidadEfectivo < importeTotal) {
                    System.out.println("La cantidad en efectivo debe ser igual o mayor que el importe total");
                    cantidadEfectivo = leerDouble("Introduzca la cantidad de efectivo: ");
                }
                pagarConEfectivo(cantidadEfectivo, importeTotal);
                break;
            case 2:
                break;
            default:
                System.out.println("La respuesta debe ser 1 para pagar con efectivo o 2 para pagar con tarjeta");
                break;

        }

        System.out.println("Gracias por su compra, vuelva pronto!!");

    }
}
