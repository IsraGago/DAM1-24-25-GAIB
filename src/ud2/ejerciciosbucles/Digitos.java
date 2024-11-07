package ud2.ejerciciosbucles;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = sc.nextInt();
        int numCifras = 0;
        int temp = numero;
        while (temp > 0) {
            temp /= 10;
            numCifras++;
        }
        for (int i = 0; i < numCifras; i++) {

        }
        sc.close();
    }
}
