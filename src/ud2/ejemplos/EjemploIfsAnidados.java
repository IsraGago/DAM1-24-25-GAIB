package ud2.ejemplos;

import java.util.Scanner;

public class EjemploIfsAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Introduzca una hora entre 0 y 23: ");
        hora = sc.nextInt();
        sc.close();

        if (hora >= 0 && hora <12) {
            System.out.println("Buenos dias");
        }
        else if (hora >= 12 && hora < 21) {
            System.out.println("Buenas tardes");
        }
        else if (hora >=21 && hora < 24) {
            System.out.println("Buenas noches");
        }
        else{
            System.out.println("Hora inválida");
        }
    }
}