package ud1.ejercicios.gaib20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        int numero, diferencia;
        String mensaje;
        final int NUMERO_MULTIPLOS = 7;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el número: ");
        numero = sc.nextInt();
        diferencia = NUMERO_MULTIPLOS - numero % NUMERO_MULTIPLOS;
        sc.close();

        mensaje = numero % NUMERO_MULTIPLOS == 0 ? "El número " + numero + " ya es múltiplo de 7"
                : "Para el siguiente múltiplo de " + NUMERO_MULTIPLOS + " (" + (numero + diferencia) + ")"
                        + " hay que sumar "
                        + diferencia;

        System.out.println(mensaje);

    }
}
