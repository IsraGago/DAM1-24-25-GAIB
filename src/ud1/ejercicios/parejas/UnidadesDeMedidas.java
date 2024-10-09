package ud1.ejercicios.parejas;
/**
 * Piloto: Hugo Gomez Alonso 
 * Copiloto: Israel Gago Acuña
**/

import java.util.Scanner;

public class UnidadesDeMedidas {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        double hectareas, camposFutbol, canchasBaloncesto, pistasTenis, parqueRetiro;

        System.out.print("Introduzca el numero de hectareas: ");
        hectareas = sc.nextDouble();
        sc.close();

        camposFutbol = (hectareas * 10000) / (105.0 * 70.0);

        canchasBaloncesto = (hectareas * 10000) / (28.0 * 15.0);

        pistasTenis = (hectareas * 10000) / (23.77 * 10.97);

        parqueRetiro = (hectareas * 10000) / (125.0 * 10000.0);

        System.out.printf("%.2f hectareas son: %.2f campos de futbol %n", hectareas, camposFutbol );
        System.out.printf("%.2f hectareas son: %.2f canchas de baloncesto %n", hectareas, canchasBaloncesto );
        System.out.printf("%.2f hectareas son: %.2f pistas de tenis %n", hectareas, pistasTenis );
        System.out.printf("%.2f hectareas son: %.2f parque del retiro %n", hectareas, parqueRetiro );
    }
}
