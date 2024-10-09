package ud1.ejercicios;

import java.util.Scanner;

public class E02_CalculoAreaTerreno2 {
    public static void main(String[] args) {
        double radio,hipotenusa,areaCirculo,areaTriangulo,areaTotal,cateto;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el valor del radio: ");
        radio = sc.nextDouble();
        System.out.print("Inserte el valor de la hipotenusa: ");
        hipotenusa = sc.nextDouble();
        sc.close();
        areaCirculo = Math.PI * Math.pow(radio, 2) / 2;
        // areaTriangulo = Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(radio, 2) * radio / 2 * 2);
        cateto = Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(radio, 2));
        areaTriangulo = cateto * radio / 2 * 2;
        areaTotal = areaCirculo + areaTriangulo;
        System.out.printf("El area es de %.2f",areaTotal);
        
    }
}
