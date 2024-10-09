package ud01.ejercicios.parejas;

import java.util.Scanner;
// PILOTO : ISRAEL GAGO
// COPILOTO : HUGO GÓMEZ

public class RecetasEIngredientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double personasOriginal, kilos, agua, azucar, cucharadasDeLimon, pielesDeNaranja, ramasDeCanela, personas;
        String urlReceta;
        urlReceta = "https://www.recetasderechupete.com/compota-de-manzana-casera/12509/";
        personasOriginal = 6;
        kilos = 1.5;
        agua = 330;
        azucar = 120;
        cucharadasDeLimon = 1;
        pielesDeNaranja = 1;
        ramasDeCanela = 1;

        System.out.println("RECETA DE COMPOTA DE MANZANA");
        System.out.println(urlReceta);
        System.out.printf("Las medidas de esta receta están pensadas para %.0f personas %n", personasOriginal);
        System.out.println("Ingredientes: ");
        System.out.println("Kilos de manzana: " + kilos);
        System.out.println("Mililitros de agua: " + agua);
        System.out.println("Gramos de azucar: " + azucar);
        System.out.println("Cucharaditas de limón: " + cucharadasDeLimon);
        System.out.println("Pieles de naranja (sin lo blanco): " + pielesDeNaranja);
        System.out.println("Ramas de canela: " + ramasDeCanela);

        System.out.println();
        System.out.print("¿Para cúantas personas quieres hacer la receta? ");
        personas = sc.nextDouble();

        System.out.println();
        System.out.printf("Para %.0f personas las medidas son las siguientes: %n", personas);
        System.out.printf("Kilos de manzana: %.2f %n", kilos / personasOriginal * personas);
        System.out.printf("Mililitros de agua: %.2f %n", agua / personasOriginal * personas);
        System.out.printf("Gramos de azucar: %.2f %n", azucar / personasOriginal * personas);
        // System.out.printf("Cucharaditas de limón: %.2f
        // %n",cucharadasDeLimon/6*personas);
        // System.out.printf("Pieles de naranja (sin lo blanco): %.2f
        // %n",pielesDeNaranja/6*personas);
        // System.out.printf("Ramas de canela: %.2f %n",ramasDeCanela/6*personas);

        sc.close();

    }
}
