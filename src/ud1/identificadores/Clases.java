package ud1.identificadores;

import java.time.LocalDate; // Para poder usar la clase LocalDate
import java.time.LocalDateTime; // Para poder usar la clase LocalDateTime
// import java.time.LocalTime;  Para poder usar la clase LocalTime

// import java.time.*; Esto te importa todas las clases de java.time

public class Clases {
    public static void main(String[] args) {
        double aleatorio = Math.random();

        double resultado = Math.pow(5, 3);

        LocalDate.now();

        System.out.println("El resultado de la potencia 5 al cubo es: " + resultado);
        System.out.println("El número aleatorioes " + aleatorio);
        // System.out.println("Hoy es el dia " + LocalDate.now());
        // System.out.println("Hoy es la hora " + LocalTime.now());

        LocalDateTime ahora;
        ahora = LocalDateTime.now();

        // System.out.println("Momento presente "+ahora);

        int dia = ahora.getDayOfMonth();
        int mes = ahora.getMonthValue();
        int anho = ahora.getYear();
        int hora = ahora.getHour();
        int minuto = ahora.getMinute();
        int segundo = ahora.getSecond();

        System.out.println(dia + "/" + mes + "/" + anho + " - " + hora + ":" + minuto + ":" + segundo);

    }

}
