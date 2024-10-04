package ud01.operadores;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        /*
         * Este programa solicita al usuario el importe en euros que desea invertir
         * el número de años que durará la inversión y, usando la formula del interés
         * compuesto
         * y para un valor fijo de interés (5%) a pagar una vez al año, calcula el
         * importe final que
         * tendrá el usuario
         */
        Scanner sc = new Scanner(System.in);
        double importeInicial, importeFinal;
        int anhos;
        final double INTERES = 0.05;
        final int NUM_PAGOS = 1;

        // entrada de datos
        System.out.print("Importe a invertir (euros): ");
        importeInicial = sc.nextDouble();
        System.out.print("Duración de la inversión (años): ");
        anhos = sc.nextInt();
        sc.close();

        // proceso
        double base = 1 + INTERES / NUM_PAGOS;
        double exponente = NUM_PAGOS * anhos;
        importeFinal = importeInicial * Math.pow(base, exponente);
        // importeFinal = importeInicial * Math.pow((1 + INTERES/NUM_PAGOS),NUM_PAGOS*anhos);

        // salida de datos
        System.out.println("El importe final es de " + importeFinal + " euros");

    }
}
