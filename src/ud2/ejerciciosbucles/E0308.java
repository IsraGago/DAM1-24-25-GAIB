package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        final int MAX = 10;

        for (int i = 1; i <= MAX; i++) {
            System.out.printf("Introduzca un número para hacer la media (%d/%d): ",i,MAX);
            suma += sc.nextDouble();
        }

        double media =  suma / MAX;
        System.out.printf("La media de los %d números introducidos es: %.2f",MAX,media);

        sc.close();
    }
}
