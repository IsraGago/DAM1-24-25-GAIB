package ud01.operadores;
import java.time.LocalDateTime;
import java.util.Scanner;
public interface E0104 {
    public static void main(String[] args) {
        int anhoActual = LocalDateTime.now().getYear();
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu año de nacimiento? ");
        int anhoNacimiento = sc.nextInt();
        sc.close();

        int edad = anhoActual-anhoNacimiento;
        System.out.println("Si ya has cumplido años este año tienes "+edad+" años");
    }
}
