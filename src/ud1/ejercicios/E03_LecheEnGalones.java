package ud1.ejercicios;

import java.util.Scanner;

public class E03_LecheEnGalones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double LITROS_GALON = 3.785;
        double litros,galones;

        System.out.print("Inserte los litros de leche que desa pasar a galones: ");
        litros = sc.nextDouble();
        sc.close();
        galones =  litros / LITROS_GALON;
        System.out.printf("%.2f litros de leche son %.2f galones.",litros,galones);
    }
}
