package ud2.ejemplos;

import java.util.Scanner;

public class ParImpar {
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
