package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0212_DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero de 8 dígitos: ");
        int numero = sc.nextInt();
        char letra;
        String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
        sc.close();

        letra = letras.charAt(numero % 23);
        String dni = numero+""+letra;
        System.out.println("Su DNI completo es: "+dni);

    }
}
