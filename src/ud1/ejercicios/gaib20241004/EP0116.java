package ud1.ejercicios.gaib20241004;

import java.util.Scanner;

public class EP0116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double milimetros,centimetros,metros,sumaCentimetros;
        System.out.println("SUMA DE LONGITUDES");
        System.out.print("Inserte una medida en milímetros (sólo el número): ");
        milimetros=sc.nextDouble();
        System.out.print("Inserte una medida en centímetros (sólo el número): ");
        centimetros=sc.nextDouble();
        System.out.print("Inserte una medida en metros (sólo el número): ");
        metros=sc.nextDouble();
        sc.close();

        sumaCentimetros = milimetros/10 + metros*100 + centimetros ;

        System.out.println("La suma de las tres longitudes es de: "+sumaCentimetros+"cm");

        

    }
}
