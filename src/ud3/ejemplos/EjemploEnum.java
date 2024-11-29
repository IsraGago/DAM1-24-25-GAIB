package ud3.ejemplos;

import java.util.Scanner;

public class EjemploEnum {
    public static void main(String[] args) {
        DiaDeLaSemana hoy;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el día de la semana: ");
        try {
            hoy =  DiaDeLaSemana.valueOf(sc.nextLine().toUpperCase());
            if (hoy == DiaDeLaSemana.VIERNES) {
                System.out.println("Por fin es Viernes!!!");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Día invalido.");
        }
        sc.close();

        
    }
}
