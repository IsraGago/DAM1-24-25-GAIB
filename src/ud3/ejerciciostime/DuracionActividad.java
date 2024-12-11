package ud3.ejerciciostime;

import java.time.Duration;
import java.time.LocalTime;

public class DuracionActividad {
    public static void main(String[] args) {
        final long MINS = 60;
        final long HORAS = 60 * 60;
        LocalTime horaInicio = LocalTime.of(8, 10, 0);
        LocalTime horaFinal = LocalTime.of(14, 30, 0);
        Duration duracion = Duration.between(horaInicio, horaFinal);

        long horas = duracion.getSeconds() / HORAS;
        long resto = duracion.getSeconds() % HORAS;
        long minutos = resto / MINS;
        long segundos = resto % MINS;
        
        

        System.out.println(duracion.getSeconds()+ " Segundos totales.");
        System.out.println(horas+" horas");
        System.out.println(minutos+" minutos");
        System.out.println(segundos+ " segundos");
    }
}
