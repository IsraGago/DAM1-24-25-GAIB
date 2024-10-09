package ud1.ejercicios.gaib20241004;

import java.util.Scanner;

public class EP0123_ConversionMasa {
    public static void main(String[] args) {
        String medida;
        double masa, resultado;
        final double GRAMOS_LIBRA = 453.592;
        final double KILOS_LIBRAS = 1000 / GRAMOS_LIBRA;
        final double LIBRAS_KILOS =  GRAMOS_LIBRA / 1000;
        System.out.println("CONVERSIÓN DE MEDIDAS DE MASA");
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué unidad de medida de origen desea utilizar kilogramos o libras? (k/l) ");
        medida = sc.nextLine();
        System.out.print("Inserte la cantidad de masa: ");
        masa = sc.nextDouble();

        resultado = medida.equalsIgnoreCase("k") ? masa * KILOS_LIBRAS : masa * LIBRAS_KILOS;
        medida = medida.equalsIgnoreCase("k")?"libras":"kilogramos";
        // System.out.println("La conversión es de: "+resultado+" "+medida);
        System.out.printf("La conversión es de %.3f %s %n",resultado,medida);
        sc.close();
    }
}
