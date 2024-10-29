package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxAltura = 0;
        int codAlturaMaxima = 0, codigo = 0;
        System.out.printf("Inserte la altura del arbol (%d) en centímetros (-1 para salir): ", codigo);
        double altura = sc.nextDouble();

        while (altura != -1) {
            codigo++;
            System.out.printf("Inserte la altura del arbol (%d) (-1 para salir): ", codigo);
            altura = sc.nextDouble();
            if (altura > maxAltura) {
                maxAltura = altura;
                codAlturaMaxima = codigo;
            }
        }
        sc.close();
        System.out.printf("El código del arbol mas alto es %d con %.2f cm de altura.", codAlturaMaxima, maxAltura);
    }
}
