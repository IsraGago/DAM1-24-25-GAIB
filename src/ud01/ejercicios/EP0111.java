package ud01.ejercicios;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        /*
         * Un economista te ha encargado un programa para realizar cálculos con el IVA. La
         * aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
         * el importe correspondiente al IVA y al total.
         * 
        */
        double baseImponible,importeIVA,importeTotal,iva;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserte la base imponible: ");
        baseImponible=sc.nextDouble();
        System.out.print("Inserte el IVA: ");
        iva=sc.nextDouble();

        importeIVA = baseImponible * iva/100;
        importeTotal = baseImponible + importeIVA;

        System.out.println("El importe correspondiente al IVA es de "+importeIVA);
        System.out.println("El importe total es de "+importeTotal);

        sc.close();
    }
}
