package ud2.ejerciciosbucles;

import java.util.Scanner;
import java.util.Random;

public class E0305 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       int a,b,resultado,respuesta,puntos = 0;

       System.out.println("JUEGO DE SUMAR NÚMEROS");
       System.out.println("RESPONDE LAS OPERACIONES ARITMETICAS HASTA QUE FALLES");
       do {
           a = random.nextInt(1, 100);
           b = random.nextInt(1, 100);
           resultado = a + b;
           System.out.printf("%d + %d = ", a, b);
           respuesta = sc.nextInt();
           if (respuesta == resultado) {
            puntos++;
            System.out.println("Correcto!!!");
            System.out.println("----------------------------");
           }
       } while (respuesta == resultado);
       System.out.println("Has perdido...");
       System.out.println("Puntuación: "+puntos);
       sc.close();

    }
}
