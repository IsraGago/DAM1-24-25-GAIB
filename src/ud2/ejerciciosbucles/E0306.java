package ud2.ejerciciosbucles;
import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número hasta el que quiere contar: ");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
