package ud2.ejercicios;

import java.util.Scanner;

public class E0210 {
    public static void main(String[] args) {
        String mensaje = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la nota del alumno: ");
        int nota = sc.nextInt();
        sc.close();

        switch (nota) {
            case 0, 1, 2, 3, 4 -> mensaje = "Suspenso";
            case 5 -> mensaje = "Suficiente";
            case 6 -> mensaje = "Bien";
            case 7, 8 -> mensaje = "Notable";
            case 9, 10 -> mensaje = "Sobresaliente";
            default -> mensaje = "Nota invalida";
        }
        System.out.println(mensaje);
    }
}
