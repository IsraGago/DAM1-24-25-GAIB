package ud1.ejercicios;
import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {
        double a,b,c,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Inserte el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Inserte el valor de c: ");
        c = sc.nextDouble();
        System.out.print("Inserte el valor de x: ");
        x = sc.nextDouble();
        sc.close();

        y = a*Math.pow(x, 2) + b*x + c;

        System.out.println("y = "+y);
    
    }
    
}
