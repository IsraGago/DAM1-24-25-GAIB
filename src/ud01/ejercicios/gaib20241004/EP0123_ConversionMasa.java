package ud01.ejercicios.gaib20241004;

import java.util.Scanner;

public class EP0123_ConversionMasa {
    public static void main(String[] args) {
        String medida;
        double masa, resultado;
        System.out.println("CONVERSIÓN DE MEDIDAS DE MASA");
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué unidad de medida de origen desea utilizar kilogramos o libras? (k/l) ");
        medida = sc.nextLine();
        System.out.print("Inserte la cantidad de masa: ");
        masa = sc.nextDouble();

        /*
         * EVALUO SI LA MEDIDA ORIGINAL ESTÁ EN KILOGRAMOS, SI LO ESTÁ PASA LA MASA
         * LIBRAS Y SI NO LO ESTÁ QUIERE DECIR QUE LA MEDDIDA ORIGINAL ESTÁ EN LIBRAS,
         * POR TANTO LO PASO A KILOGRAMOS
         */
        resultado = medida == "k" ? masa * 453.592 : masa * 453.592 / 1000;
        System.out.println(resultado);

        sc.close();
    }
}
