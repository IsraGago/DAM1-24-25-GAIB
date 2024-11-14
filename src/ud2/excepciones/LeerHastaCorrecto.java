package ud2.excepciones;

import java.util.Scanner;

public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valorCorrecto = false;
        while (!valorCorrecto) {
            System.out.print("Introduzca un número entero: ");
            try {
                int a = sc.nextInt();
                sc.close();
                valorCorrecto = true;
                System.out.println("El valor introducido es " + a);
            } catch (Exception e) {
                System.out.println("ERROR: el valor introducido no es un entero.");
                sc.nextLine(); // si no quitas el valor del buffer se ejecuta el bucle infinitamente.
            }
        }

    }
}
