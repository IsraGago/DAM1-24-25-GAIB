package ud2.ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;

public class EP0217_JuegoSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = new Random().nextInt(0, 99);
        int numero2 = new Random().nextInt(0, 99);
        int resultado = numero1 + numero2;
        
        System.out.println("JUEGO DE LA SUMA");
        System.out.print(numero1 + " + " + numero2 + " = ");
        int respuesta = sc.nextInt();
        sc.close();

        if (respuesta == resultado) {
            System.out.println("Respuesta correcta!!");
        } else {
            System.out.println("Has fallado...");
            System.out.println("La respueta correcta es");
            System.out.println(numero1 + " + " + numero2 + " = " + resultado);

        }

    }
}
