package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 6;
        final int SUSPENSO = 4;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        Scanner sc = new Scanner(System.in);
        int nota;
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.printf("Introduzca la nota del alumno (%d/%d): ", i, NUM_ALUMNOS);
            nota = sc.nextInt();
            if (nota > SUSPENSO && nota <= 10) {
                aprobados++;
            } else if (nota == SUSPENSO){
                condicionados++;
            } else if (nota < SUSPENSO && nota >=0){
                suspensos++;
            }
        }
        System.out.printf("Alumnos aprobados: %d%n",aprobados);
        System.out.printf("Alumnos condicionados: %d%n",condicionados);
        System.out.printf("Alumnos suspensos: %d%n",suspensos);

        sc.close();
    }
}
