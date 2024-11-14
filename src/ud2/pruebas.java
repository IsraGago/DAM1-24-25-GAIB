package ud2;

import java.util.Scanner;

public class pruebas {
        static Scanner sc = new Scanner(System.in);
        static int leerInt(String mensaje) {
        int numero = 0;
        boolean esValorCorrecto = false;
        while (!esValorCorrecto) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                esValorCorrecto = true;

            } catch (Exception e) {
                System.out.println("ERROR: El dato introducido debe ser un entero.");
                // System.out.println(e.toString());
            }
        }
        sc.close();
        return numero;
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
            } catch (Exception e) {
                System.out.println("ERROR: El dato introducido debe ser de tipo double.");
                // System.out.println(e.toString());
                sc.nextLine();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        double importe = leerDouble("Introduzca el importe de su producto: "); 
        int cantidad = leerInt("Introduzca la cantidad de productos que desea comprar: ");
        double precio = importe * cantidad;
        System.out.println(precio);
    }
}
