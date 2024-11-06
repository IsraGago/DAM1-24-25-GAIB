package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0314_Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorPrimos = 0;
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        boolean esPrimo;

        for (int i = 1; i <= numero; i++) {
            esPrimo = true;
            if (i != 1) {
                for (int j = 1; j <= i; j++) {
                    if(i % j == 0){
                        if (i != j && i != 1){
                            esPrimo = false;
                            // continue;
                        }
                    }
                }
                String mensaje = esPrimo ? i + " - primo" : i + " - NO primo";
                System.out.println(mensaje);
            } else {
                System.out.println(i + " - primo");
                contadorPrimos++;
            }
        }
        System.out.printf("entre 1 y %d hay %d primos.", numero, contadorPrimos);

        sc.close();
    }
}