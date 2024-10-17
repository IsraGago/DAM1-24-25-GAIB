package ud2.ejercicios;

import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anho;
        String mensaje = "";
        System.out.print("Inserte el número de un año: ");
        anho = sc.nextInt();
        sc.close();
        if ((anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0) {
            mensaje = "El año " + anho + " es bisiesto ";
        } else {
            mensaje = "El año " + anho + " no es bisiesto ";
        }
        System.out.println(mensaje);
    }
}
