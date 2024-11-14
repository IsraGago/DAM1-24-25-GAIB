package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoDatoEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduzca un número entero: ");
            int a = sc.nextInt();
            System.out.println(a);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: El valor introducido no es un entero.");
            System.out.println(e.toString());
        }
        
        sc.close();
    }
}
