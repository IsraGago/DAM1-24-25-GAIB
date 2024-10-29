package ud2.ejerciciosbucles;
import java.util.Random;
import java.util.Scanner;

public class E0303_NumeroSecreto {
    public static void main(String[] args) {
        int numSecreto = new Random().nextInt(1,100);
        Scanner sc = new Scanner(System.in);
        String operador;
        System.out.println("ADIVINA EL NÚMERO SECRETO");
        System.out.print("Intoduzca un número: ");
        int numero = sc.nextInt();
        while (numSecreto != numero || numero == -1) {
            operador = numero > numSecreto ? "mayor": "menor";
            System.out.println("------------------------------------------------------------------");
            System.out.println("El número que has introducido es "+operador+" que el número secreto.");
            System.out.print("Intoduzca un número (-1 para salir): ");
            numero = sc.nextInt();
        }
        if (numSecreto == numero) {
            System.out.println("Has adivinado el número secreto!!!");
        } else {
            System.out.println("El número secreto era"+numSecreto);
        }
        sc.close();
    }
}
