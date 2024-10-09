package ud1.operadores;
import java.util.Scanner;
public interface E0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();
        System.out.println("El año que viene tendrás "+(edad+1)+" años" );
        sc.close();
    }
}
