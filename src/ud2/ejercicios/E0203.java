package ud2.ejercicios;

import java.util.Scanner;

public class E0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Introduce el primer número entero: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Los números son iguales");
        }

        sc.close();
    }
}
