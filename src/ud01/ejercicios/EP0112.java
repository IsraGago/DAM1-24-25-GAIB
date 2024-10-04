package ud01.ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
        double area,base,altura;
        System.out.println("CALCULAR EL ÁREA DE UN TRÍANGULO");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la base del triángulo: ");
        base=sc.nextDouble();
        System.out.print("Inserte la altura del triángulo: ");
        altura=sc.nextDouble();
        sc.close();
        area = base * altura / 2 ;
        System.out.println("El área del triángulo es: "+area);
    }
}
