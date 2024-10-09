package ud1.operadores;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
            double fahrenheit,celsius;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese los grados Fahrenheit: ");
            fahrenheit=sc.nextDouble();
            sc.close();
            celsius = 5/9.0 * (fahrenheit-32); // 9.0 para que java vea que no es un int
            System.out.println(fahrenheit+" grados Fahrenheit equivalen a "+celsius+" grados Celsius");
    }
}
