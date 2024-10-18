package ud2.ejercicios;

import java.util.Scanner;

public class E0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, resultadoPositivo, resultadoNegativo, discriminante;
        System.out.print("Inserte el valor de A: ");
        a = sc.nextDouble();
        System.out.print("Inserte el valor de B: ");
        b = sc.nextDouble();
        System.out.print("Inserte el valor de C: ");
        c = sc.nextDouble();
        sc.close();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante > 0) {

            resultadoPositivo = (-b + Math.sqrt(discriminante)) / (2 * a);
            resultadoNegativo = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Los resultados de esta ecuación de segundo grado son los siguientes: ");
            System.out.println("x = " + resultadoPositivo);
            System.out.println("x = " + resultadoNegativo);

        } else {
            System.out.println("No existen soluciones con números reales");
        }

    }
}
