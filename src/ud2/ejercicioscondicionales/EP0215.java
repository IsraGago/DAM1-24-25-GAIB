package ud2.ejercicioscondicionales;
import java.util.Scanner;

public class EP0215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura del triángulo: ");
        double altura = sc.nextDouble();
        if(base > 0 && altura > 0){
            double area = base * altura / 2;
            System.out.println("El area del triángulo es "+area);
        } else {
            System.out.println("La base y la altura del triangulo deben ser positivas.");
        }
        sc.close();
    }
}
