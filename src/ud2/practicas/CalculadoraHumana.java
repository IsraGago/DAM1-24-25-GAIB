package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 201;
    static final int MIN = 1;
    static final int NUM_OPERACIONES_MAXIMAS = 7;
    static final int NUM_FALLOS_MAXIMOS = 10;
    static Random rd = new Random();

    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int obtenerOperando2Division(int operando1) {

        if (!esPrimo(operando1)) {

            int operando2 = rd.nextInt(MIN, MAX);
            while (operando1 % operando2 != 0 || operando2 == 1 || operando1 == operando2) {
                operando2 = rd.nextInt(MIN, MAX);
            }
            return operando2;
        }
        return -1;
    }

    static int obtenerOperando2Suma(int operando1) {
        int operando2 = rd.nextInt(MIN, MAX);
        while (operando2 + operando1 > MAX - 1) {
            operando2 = rd.nextInt(MIN, MAX);
        }
        return operando2;
    }

    static int obtenerOperando2Resta(int operando1) {
        int operando2 = rd.nextInt(MIN, MAX);
        while (operando1 - operando2 < MIN) {
            operando2 = rd.nextInt(MIN, MAX);
            // System.out.println(operando2);
        }
        return operando2;
    }

    static int obtenerOperando2Multiplicacion(int operando1) {
        int operando2 = rd.nextInt(MIN, MAX);
        while (operando1 * operando2 > MAX - 1 || operando2 == 1) {
            operando2 = rd.nextInt(MIN, MAX);
        }
        return operando2;
    }

    static char operadorAleatorio(int operando1) {
        int max = operando1 > MAX - 1 ? 4 : 5 ;
        switch (rd.nextInt(1, max)) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '/';
            case 4:
                return '*';
        }
        return ' ';
    }
    static int leerInt(){
        int numero = 0;
        boolean esValido = false;
        while (!esValido) {
            try {
                numero = sc.nextInt();
                sc.nextLine();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: el valor introducido debe ser un entero.");
                sc.nextLine();
            }
        }
    
        return numero;
    }
    public static void main(String[] args) {
        int numFallos = 0;
        int numAciertos = 0;
        int resultado = 0, respuesta = -1;
        int operando1, operando2 = 0;
        char operador = ' ';

        System.out.println("LA CALCULADORA HUMANA");

        while (numAciertos < NUM_OPERACIONES_MAXIMAS && numFallos < NUM_FALLOS_MAXIMOS) {

            operando1 = numAciertos == 0 ? rd.nextInt(MIN, MAX + 1) : resultado;
            operador = operadorAleatorio(operando1);

            switch (operador) {
                case '+':
                    operando2 = obtenerOperando2Suma(operando1);
                    resultado = operando1 + operando2;
                    break;
                case '-':
                    operando2 = obtenerOperando2Resta(operando1);
                    resultado = operando1 - operando2;
                    break;
                case '*':
                    operando2 = obtenerOperando2Multiplicacion(operando1);
                    resultado = operando1 * operando2;
                    break;
                case '/':
                    operando2 = obtenerOperando2Division(operando1);
                    resultado = operando1 / operando2;
                    break;
            }

            System.out.printf("%d %c %d = ", operando1, operador, operando2);
            respuesta = leerInt();            

            if (respuesta == resultado) {
                numAciertos++;
                System.out.printf("¡Correcto! Aciertos: %d%n", numAciertos);
            } else {
                numFallos++;
                System.out.printf("Incorrecto. Fallos: %d%n", numFallos);
            }
        }

        if (numAciertos == NUM_OPERACIONES_MAXIMAS) {
            System.out.println("¡Felicidades! Has completado todas las operaciones correctamente.");
        } else {
            System.out.println("Límite de fallos alcanzado. Fin del juego.");
        }
    }
}
