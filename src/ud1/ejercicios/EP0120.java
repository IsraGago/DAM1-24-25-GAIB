package ud1.ejercicios;

import java.util.Scanner;

public class EP0120 {
    public static void main(String[] args) {
        int entradasInfantiles,entradasAdultos;
        double precioTotal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la cantidad de entradas infantiles que desa comprar: ");
        entradasInfantiles= sc.nextInt();
        System.out.print("Inserte la cantidad de entradas para adultos que desa comprar: ");
        entradasAdultos = sc.nextInt();
        sc.close();
        precioTotal = entradasInfantiles * 15.50 + entradasAdultos * 20;
        precioTotal = precioTotal >= 100 ? precioTotal - precioTotal *0.05 : precioTotal;
        System.out.println("El precio total de las entradas es de: "+precioTotal);
    }
}
