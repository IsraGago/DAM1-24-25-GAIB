package ud01.identificadores;

import java.time.LocalDate;

public class Constantes {
    public static void main(String[] args) {
        final byte NUM_ALUMNOS_PROGRAMACION = 32;
        final short SESIONES_TOTALES_PROGRAMACION = 288;
        final byte SESIONES_SEMANALES_PROGRAMACION = 9;
        final byte NUMERO_MESES_AÑO = 12;

        System.out.println("Número de alumnos matriculados en el módulo de Programación: "
                + NUM_ALUMNOS_PROGRAMACION);

        System.out.println("Número total de sesiones del módulo de Programación en el curso lectivo: "
                + SESIONES_TOTALES_PROGRAMACION);

        System.out.println("Número de sesiones semanales del módulo de Programación: "
                + SESIONES_SEMANALES_PROGRAMACION);

        System.out.println("Número de meses del año: "
                + NUMERO_MESES_AÑO);

        LocalDate.now();

        // double aleatorio = Math.random();
        
        double resultado = Math.pow(5,3);

        System.out.println(resultado);

    }
}
