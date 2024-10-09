package ud1.ejercicios;

import java.util.Scanner;

public class E01_CalculoAreaTerreno {
    public static void main(String[] args) {
        double a,b,c,areaTriangulo,areaRectangulo,areaTotal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el valor de A: ");
        a = sc.nextDouble();
        System.out.print("Inserte el valor de B: ");
        b = sc.nextDouble();
        System.out.print("Inserte el valor de C: ");
        c = sc.nextDouble();
        areaTriangulo = b * (a - c) / 2;
        areaRectangulo = b * c;
        areaTotal = areaRectangulo + areaTriangulo;
        System.out.printf("El área es de %.2f",areaTotal);
        sc.close();
    }
}
