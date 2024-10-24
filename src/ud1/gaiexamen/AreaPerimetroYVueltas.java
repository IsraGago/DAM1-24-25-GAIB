package ud1.gaiexamen;
// Autor: Israel Benjamín Gago Acuña

import java.util.Scanner;

public class AreaPerimetroYVueltas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo, ancho, areaCiruclo, areaRectangulo, areaTotal,
                perimetroCirculo, // perimetroRectangulo,
                perimetroTotal, metrosExtra;
        int vueltas;
        final double DISTANCIA_MARATON = 21097;

        System.out.print("Inserte el largo de la pista: ");
        largo = sc.nextDouble();
        System.out.print("Inserte el ancho de la pista: ");
        ancho = sc.nextDouble();

        areaCiruclo = Math.PI * Math.pow(ancho / 2, 2);
        areaRectangulo = (largo - ancho) * ancho;
        areaTotal = areaRectangulo + areaCiruclo;

        perimetroCirculo = 2 * Math.PI * ancho / 2;
        // perimetroRectangulo = (largo - ancho) * 2 + ancho * 2;
        // perimetroTotal = perimetroCirculo + perimetroRectangulo;
        perimetroTotal = perimetroCirculo + (largo - ancho) * 2;

        vueltas = (int) (DISTANCIA_MARATON / perimetroTotal);
        metrosExtra = (DISTANCIA_MARATON % perimetroTotal);

        System.out.println("El área de la figura es de " + String.format("%.2f", areaTotal));
        System.out.println("El perimetro de la figura es de " + String.format("%.2f", perimetroTotal));
        System.out.println("Para completar la media maratón hay que dar " + vueltas + " vueltas a la pista y correr "
                + String.format("%.0f", Math.ceil(metrosExtra)) + " metros");

        sc.close();
    }
}
