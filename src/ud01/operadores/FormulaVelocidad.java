package ud01.operadores;
import java.util.Scanner;

public class FormulaVelocidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la distancia: ");
        double distancia=sc.nextDouble();

        System.out.print("Introduzca el tiempo: ");
        double tiempo = sc.nextDouble();

        double velocidad = distancia/tiempo;

        System.out.println("La velocidad es de "+velocidad);

        sc.close();
    }
}
