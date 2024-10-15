package ud1.ejercicios.gaib20241015;
import java.util.Scanner;

public class KilosALibras {
    public static void main(String[] args) {
        /* Diseña un programa que lea una medida de peso en kilogramos y la devuelva en libras. Una
        libra equivale a 0.453592 kilogramos.*/
        double kg,lb;
        final double KG_LIBRAS = 0.453592;
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte la cantidad de kilogramos que desea pasar a libras: ");
        kg = sc.nextDouble();
        sc.close();
        lb = kg / KG_LIBRAS;

        System.out.printf("%.2f kg son %.2f libras.",kg,lb);        
    }
}
