package ud1.ejercicios.gaib20241010;
import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        int numero ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el número: ");
        numero = sc.nextInt();
        sc.close();
        System.err.println(numero % 7);

    }
}
