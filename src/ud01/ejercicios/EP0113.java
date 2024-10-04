package ud01.ejercicios;
import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {
        /*
         * Dado el siguiente polinomio de segundo grado
         * y = ax^2 + bx + c
         * crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y
        */
        double a,b,c,x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el valor de a ");
        a = sc.nextDouble();

        System.out.print("Inserte el valor de b ");
        b = sc.nextDouble();

        System.out.print("Inserte el valor de c ");
        c = sc.nextDouble();

        System.out.print("Inserte el valor de x ");
        x = sc.nextDouble();

        y = a * Math.pow(x, 2)+b*x+c;

        System.out.println("El valor de y es: "+y);

        sc.close();

    }
}
