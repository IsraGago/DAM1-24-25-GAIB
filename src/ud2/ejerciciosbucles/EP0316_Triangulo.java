package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0316_Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            
            for (int j = 0; j <= i; j++) {
                if (j < numero / 2) {
                    for (int j2 = numero/2; j2 > j; j2--) {
                        System.out.print(" ");
                    }
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
