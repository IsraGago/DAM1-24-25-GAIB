package ud2.gaiexamen;

import java.util.InputMismatchException;
import java.util.Scanner;
// AUTOR: Israel Benjamín Gago Acuña

public class MenuDeFiguras {
    static Scanner sc = new Scanner(System.in);

    static int leerIntEntre2Y20(String mensaje) {
        int numero = 0;
        while (numero < 2 || numero > 20) {
            boolean esValorCorrecto = false;
            while (!esValorCorrecto) {
                try {
                    System.out.print(mensaje);
                    numero = sc.nextInt();
                    esValorCorrecto = true;

                } catch (InputMismatchException e) {
                    System.out.println("ERROR: El dato introducido debe ser un entero.");
                    sc.nextLine();
                }
            }

        }
        return numero;
    }

    public static int menu() {
        int contadorErrores = 0;
        int respuesta = -1;
        boolean respuestaValida = false;
        while (!respuestaValida && contadorErrores < 3) {

            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("0. SALIR");
            System.out.print("Escoja una opción: ");
            try {
                respuesta = sc.nextInt();
                sc.nextLine();
                if (respuesta >= 0 && respuesta <= 2) {
                    respuestaValida = true;
                } else {
                    contadorErrores++;
                    System.out.println("ERROR: Opción inválida");
                    System.out.printf("Llevas %d fallos, a los 3 fallos el programa se cerrará %n", contadorErrores);
                    System.out.println("----------------------------------------------------------------------");
                }

            } catch (Exception e) {
                contadorErrores++;
                sc.nextLine();
                System.out.println("ERROR: Opción inválida");
                System.out.printf("Llevas %d fallos, a los 3 fallos el programa se cerrará %n", contadorErrores);
                System.out.println("----------------------------------------------------------------------");
            }
        }
        return respuesta;
    }

    public static void dibujarTriangulo() {
        int numero = 0;

        numero = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20: ");

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void dibujarRectangulo() {
        int base = 0;

        base = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20 para la base: ");

        int altura = 0;
        altura = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20 para la altura: ");

        System.out.println("");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int respuesta;
        do {
            respuesta = menu();
            switch (respuesta) {
                case 1:
                    dibujarTriangulo();
                    break;
                case 2:
                    dibujarRectangulo();
                    break;
                default:
                    break;
            }
            System.out.println("");
        } while (respuesta != 0 && respuesta != -1);
        System.out.println("Gracias por usar el programa, vuelva pronto!!!");
    }
}
