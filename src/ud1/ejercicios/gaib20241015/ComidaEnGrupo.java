package ud1.ejercicios.gaib20241015;

import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersonas;
        double importeTotal, resutlado;

        System.out.print("Número de personas: ");
        numPersonas = sc.nextInt();
        System.out.print("Importe total de la comida: ");
        importeTotal = sc.nextDouble();
        sc.close();

        resutlado = (double) importeTotal / numPersonas;

        System.out.printf("Cantidad a pagar por comensal: %.2f euros", resutlado);
    }
}
