package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0314_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPrimos = 0;
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i++) { 
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                contadorPrimos++;
                System.out.println(i + " - primo.");
            } else {
                System.out.println(i + " - NO primo.");
            }
        }

        System.out.printf("entre 1 y %d hay %d primos.", numero, contadorPrimos);

        sc.close();
    }
    
}