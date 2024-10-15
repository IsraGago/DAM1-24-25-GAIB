package ud1.ejercicios.gaib20241015;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        // Escribe un programa que lea 3 números por teclado e indique si están
        // ordenados o no, de
        // menor a mayor, y de mayor a menor.
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Inserte el segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Inserte el tercer número: ");
        n3 = sc.nextInt();

        System.out.println(n1 > n2 && n2 > n3 ? "Los números están ordenados de mayor a menor"
                : n3 > n2 && n2 > n1 ? "Los números están ordenados de menor a mayor"
                        : "Los números están desordenados");

        sc.close();
    }
}
