package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;
        final int MIN = 1;
        int numero;
        System.out.println("TABLAS DE MULTIPLICAR");

        do {
            System.out.print("Tabla del: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("EL número debe estar comprendido entre 1 y 10 incluidos.");
            }
        } while (numero < 1 || numero > 10);
        sc.close();

        for (int i = MIN; i <= MAX; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);
        }

    }
}
