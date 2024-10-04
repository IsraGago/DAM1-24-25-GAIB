package ud01.operadores;
import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un numero: ");
        int numero = sc.nextInt();
        boolean esPar = (numero%2) == 0?true:false;
        System.out.println("Es par: "+esPar);
        sc.close();
    }
}
