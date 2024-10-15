package ud1.ejercicios;

import java.util.Scanner;

public class EP0128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Inserte un número entero para asignarle un valor a A: ");
        a = sc.nextInt();
        System.out.print("Inserte un número entero para asignarle un valor a B: ");
        b = sc.nextInt();
        sc.close();

        System.out.println(a == b); ;


    }
}
