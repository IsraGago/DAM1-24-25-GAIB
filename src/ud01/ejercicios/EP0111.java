package ud01.ejercicios;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        double baseImponible,iva,importeIva,importeTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULAR EL IVA");
        System.out.print("Inserte la base imponible: ");
        baseImponible = sc.nextDouble();
        System.out.print("Inserte el IVA (sin escribir el %, solo el número): ");
        iva = sc.nextDouble();
        sc.close();

        importeIva = baseImponible * iva / 100;
        importeTotal = baseImponible + importeIva;

        System.out.println("El importe del iva es de "+importeIva+" euros." );
        System.out.println("El importe total es de "+importeTotal+" euros");

    }
}
