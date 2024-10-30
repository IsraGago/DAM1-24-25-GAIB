package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUMNOS = 5;
        int nota;
        boolean haySuspenso = false;

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.printf("Inserte la nota del alumno (%d/%d): ",i,NUM_ALUMNOS);
            nota = sc.nextInt();
            if (nota < 5){
                haySuspenso = true;
            } 
        }
        
        sc.close();
        if (haySuspenso) {
            System.out.println("Hay un alumno suspenso.");
        }
    }
}
