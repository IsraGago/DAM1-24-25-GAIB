package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Itroduzca un número para calcular su valor absoluto: ");
        int numero = sc.nextInt();
        int absoluto = numero > 0 ? numero : numero-numero-numero;
        System.out.println("El valor absoluto de "+numero+" es "+absoluto);
        sc.close();
    }
}
