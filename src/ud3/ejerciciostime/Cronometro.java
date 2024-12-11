package ud3.ejerciciostime;

import java.time.LocalTime;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SEGUNDOS = 60;

        System.out.print("Pulse cualquier tecla para iniciar el cronómetro...");
        sc.nextLine();
        LocalTime horaInicio = LocalTime.now();
        int segundosTotalesInicio = horaInicio.getHour() * SEGUNDOS * SEGUNDOS + horaInicio.getMinute() * SEGUNDOS + horaInicio.getSecond();

        System.out.print("Pulse cualquier tecla para parar el cronómetro...");
        sc.nextLine();
        LocalTime horaFinal = LocalTime.now();
        int segundosTotalesFinal = horaFinal.getHour() * SEGUNDOS * SEGUNDOS + horaFinal.getMinute() * SEGUNDOS + horaFinal.getSecond();


        System.out.println("El cronómetro marca: " + (segundosTotalesFinal - segundosTotalesInicio) + " segundos");
        sc.close();
    }
}
