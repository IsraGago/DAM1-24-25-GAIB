package ud01.ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
        /*
         * Crea un programa que pida la base y la altura de un triángulo y muestre su área
         * Área Triángulo = (base * altura) / 2
        */
        Scanner sc = new Scanner(System.in);
        double base,altura,area;
        System.out.print("Inserte la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("Inserte la altura del triangulo: ");
        altura = sc.nextDouble();
        sc.close();


        area = (base * altura) / 2;

        System.out.println("El area es de: "+area);

    }
}
