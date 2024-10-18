package ud2.ejercicios;

import java.util.Scanner;

public class E0201_parImpar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número entero: ");
        num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}
