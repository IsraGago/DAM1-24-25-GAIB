package ud2.ejemplos;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        String mensaje = "";
        System.out.print("Inserte la nota: ");
        nota = sc.nextDouble();
        sc.close();
        if (nota < 0 && nota > 10) {
            mensaje = "La nota tiene un valor invalido";
        } else if (nota == 10) {
            mensaje = "Matrícula de honor";
        } else if (nota >= 9) {
            mensaje = "Sobresaliente";
        } else if (nota >= 7) {
            mensaje = "Notable";
        } else if (nota >= 6) {
            mensaje = "Bien";
        } else if (nota >= 5) {
            mensaje = "Suficiente";
        } else {
            mensaje = "Suspenso";
        }
        System.out.println(mensaje);
    }
}
