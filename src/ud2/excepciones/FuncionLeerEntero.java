package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionLeerEntero {
    static Scanner sc = new Scanner(System.in);
    static int leerEntero(){
        boolean esValorCorrecto = false;
        int numero = 0;
        while (!esValorCorrecto) {
            try {
                System.out.print("Introduzca un número entero: ");
                numero = sc.nextInt();
                esValorCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: el valor introducido no es un entero.");
                sc.nextLine();
            }
        }
        return numero;
    }
    public static void main(String[] args) {
        System.out.println(leerEntero());
    }
}
