package ud2.gaiexamen;

import java.util.InputMismatchException;
import java.util.Scanner;
// AUTOR: Israel Benjamín Gago Acuña

public class MenuDeFiguras {
    static Scanner sc = new Scanner(System.in);

    static void mensajeFallos(int numFallos) {
        System.out.println("ERROR: Opción inválida");
        System.out.printf("Llevas %d fallo/s, a los 3 fallos el programa se cerrará %n", numFallos);
        System.out.println("----------------------------------------------------------------------");
    }

    static int leerIntEntre2Y20(String mensaje) {
        int numero = 0;
        try {
            System.out.print(mensaje);
            numero = sc.nextInt();
            if (numero < 2 || numero > 20) {
                System.out.println("ERROR: El dato introducido debe ser un entero entre 2 y 20.");
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: El dato introducido debe ser un entero.");
            sc.nextLine();

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
                    mensajeFallos(contadorErrores);
                }

            } catch (Exception e) {
                contadorErrores++;
                sc.nextLine();
                mensajeFallos(contadorErrores);
            }
        }
        return contadorErrores == 3 ? -1 : respuesta;
    }

    public static int dibujarTriangulo() { // retorna -1 si el número es inválido
        int numero = 0;

        numero = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20: ");
        if (numero == 0) {return -1;}

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        return 0;

    }

    public static int dibujarRectangulo() { //  retorna -1 si la base es inválida o -2 si la altura es inválida
        int base = 0;
        base = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20 para la base: ");
        if (base == 0) {return -1;}

        int altura = 0;
        altura = leerIntEntre2Y20("Introduzca un número entero entre 2 y 20 para la altura: ");
        if (altura == 0) {return -2;}

        System.out.println("");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int respuesta;
        do {
            respuesta = menu();
            switch (respuesta) {
                case 1:
                if (dibujarRectangulo() != 0) { // si devuelve 0 significa que todo fue bien
                    respuesta = 0;
                }
                    break;
                case 2:
                if (dibujarRectangulo() != 0) { // si devuelve 0 significa que todo fue bien
                    respuesta = 0;
                };
                    break;
                default:
                    break;
            }
            System.out.println("");
        } while (respuesta != 0 && respuesta != -1);
        System.out.println("Gracias por usar el programa, vuelva pronto!!!");
    }
}
