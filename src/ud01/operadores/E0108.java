package ud01.operadores;
import java.util.Scanner;

public class E0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        boolean esMayorDeEdad=edad>=18?true:false;
        System.out.println("¿Eres mayor de edad? "+esMayorDeEdad);
        sc.close();
    }
}
