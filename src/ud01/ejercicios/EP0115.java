package ud01.ejercicios;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        int segundosTotales, horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte los segundos totales: ");
        segundosTotales = sc.nextInt();
        sc.close();
        horas = segundosTotales / 3600;
        segundosTotales = segundosTotales % 3600;
        minutos = segundosTotales / 60;
        segundosTotales = segundosTotales % 60;
        segundos = segundosTotales;
        System.out.println(horas + " horas " + minutos + " minutos y " + segundos + " segundos.");
    }
}
