package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    static final int MAX = 200;
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
            while (operando1 % operando2 != 0 || operando2 == 1) {
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

    static char operadorAleatorio() {
        switch (rd.nextInt(1, 5)) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFallos = 0;
        int numAciertos = 0;
        int resultado = 0, respuesta = 0;
        int operando1, operando2 = 0;
        char operador = ' ';

        System.out.println("LA CALCULADORA HUMANA");

        while (numAciertos < NUM_OPERACIONES_MAXIMAS && numFallos < NUM_FALLOS_MAXIMOS) {
            operador = operadorAleatorio();

            operando1 = numAciertos == 0 ? rd.nextInt(MIN, MAX + 1) : resultado;

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
            respuesta = sc.nextInt();

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

        sc.close();
    }
}
