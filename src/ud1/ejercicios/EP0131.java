package ud1.ejercicios;

import java.util.Scanner;

public class EP0131 {
    public static void main(String[] args) {
        double metros,centimetros;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la cantidad de metros: ");
        metros = sc.nextDouble();

        centimetros = metros * 100;

        System.out.printf("La cantidad de centimeteros es %.0f",Math.floor(centimetros));

        sc.close(); 
    }
}
