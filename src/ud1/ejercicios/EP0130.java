package ud1.ejercicios;

import java.util.Scanner;

public class EP0130 {
    public static void main(String[] args) {
         int numero, diferencia, multiplo;
        String mensaje;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el número: ");
        numero = sc.nextInt();
        System.out.print("Inserte el múltiplo: ");
        multiplo = sc.nextInt();
        
        diferencia = multiplo - numero % multiplo;
        sc.close();

        mensaje = numero % multiplo == 0 ? "El número " + numero + " ya es múltiplo de 7"
                : "Para el siguiente múltiplo de " + multiplo + " (" + (numero + diferencia) + ")"
                        + " hay que sumar "
                        + diferencia;

        System.out.println(mensaje);
    }
}
