package ud2.ejercicios;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short anho;
        boolean esBisiensto;
        String mensaje = "";

        System.out.print("Inserte el número de un año: ");
        anho = sc.nextShort();
        sc.close();

        esBisiensto = (anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0;

        if (esBisiensto) {
            mensaje = "El año " + anho + " es bisiesto ";
        } else {
            mensaje = "El año " + anho + " no es bisiesto ";
        }
        System.out.println(mensaje);
    }
}
