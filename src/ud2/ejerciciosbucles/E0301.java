package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Es un número par");
            } else {
                System.out.println("NO es un número par");
            }
            if (numero > 0) {
                System.out.println("Es un número positivo");
            } else {
                System.out.println("Es un número negativo");
            }
            System.out.println("Su cuadrado es: " + Math.pow(numero, 2));

            System.out.println("---------------------");
            System.out.println("Introduzca un número");
            numero = sc.nextInt();
        }
        sc.close();
    }
}
