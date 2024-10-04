package ud01.ejercicios;

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {
        /*
         * Convertir un número de horas, minutos y segundos introducidos por teclado en un
         * número total de segundos
        */
        int horas,minutos,segundos,segundosTotales;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el número de horas: ");
        horas = sc.nextInt();
        System.out.print("Inserte el número de minutos: ");
        minutos = sc.nextInt();
        System.out.print("Inserte el número de segundos: ");
        segundos = sc.nextInt();

        segundosTotales = (horas*60*60)+(minutos*60)+segundos;

        System.out.println("Los segundos totales son: "+segundosTotales);

        sc.close();
    }
}
