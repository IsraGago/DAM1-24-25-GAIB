package ud1.ejercicios;

import java.util.Scanner;

public class EP0126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero,resultado;

        System.out.print("Inserte un número real para calcular su raíz cuadrada:");
        numero = sc.nextDouble();
        sc.close();

        resultado = Math.sqrt(numero);

        System.out.printf("La raíz cuadrada de %.2f es %.2f %n",numero,resultado);
    }
}
