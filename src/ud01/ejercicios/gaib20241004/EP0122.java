package ud01.ejercicios.gaib20241004;

import java.util.Scanner;
// import java.util.Locale;

public class EP0122 {
    public static void main(String[] args) {
        // SI VAS A PONER UN GRADO CON DECIMALES TIENES QUE HACERLO CON ESTE FORMATO 33,8 NO 33.8
        double farenheit,celsius;
        Scanner sc = new Scanner(System.in);
        // sc.useLocale(Locale.US);
        System.out.println("CONVERTIR DE GRADOS FARENHEIT A CELSIUS");
        System.out.print("Ingrese los grados Fahrenheit: ");
        farenheit = sc.nextDouble();
        sc.close();
        celsius = 5/9.0 * (farenheit-32);
        // System.out.println(farenheit+" grados Farenheit son "+celsius+" grados Celsius.");
        System.out.printf(farenheit+" grados Farenheit son %.2f grados Celsius",celsius);
    }
}
