package ud3.ejerciciosclases;

import java.util.Scanner;

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca las horas: ");
        int horas = sc.nextInt();
        System.out.print("Introduzca los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduzca los segundos: ");
        int segundos = sc.nextInt();
        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();
        sc.close();

        try {
            Hora hora = new Hora(horas, minutos, segundos);
            hora.mostrar();
            for (int i = 0; i <numero; i++) {
                hora.incrementarSegundo();
                hora.mostrar();
            }
        } catch (Exception e) {
            e.toString();
        }
        
    }
}
