package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0311_facorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número para calcular su factorial: ");
        int numero = sc.nextInt();
        sc.close();
        int factorial = numero;
 
        for (int i = numero-1; i > 0; i--) {
            factorial *= i ;
        }
        System.out.printf("El factorial de %d es %d",numero,factorial);
    }
}
