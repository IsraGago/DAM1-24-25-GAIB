
package ud3.ejerciciostime;

import java.time.LocalDate;
import java.util.Scanner;

public class TiempoHastaCumple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (formato: YYYY-MM-DD):");
        String fechaNacimientoInput = sc.nextLine();

        try {
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoInput);
            LocalDate hoy = LocalDate.now();

            LocalDate proximoCumple = fechaNacimiento.withYear(hoy.getYear());

            // Si el cumpleaños de este año ya pasó, mover al próximo año
            if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
                proximoCumple = proximoCumple.plusYears(1);
            }

            // Calcular la diferencia en días
            int diasRestantes = 0;
            LocalDate temp = hoy;

            while (temp.isBefore(proximoCumple)) {
                diasRestantes++;
                temp = temp.plusDays(1);
            }

            // Convertir los días restantes a horas y minutos
            int horasRestantes = diasRestantes * 24;
            int minutosRestantes = horasRestantes * 60;

            // Mostrar el resultado
            System.out.println("Faltan " + diasRestantes + " días, " +
                    horasRestantes + " horas y " +
                    minutosRestantes + " minutos para tu próximo cumpleaños.");
        } catch (Exception e) {
            System.out.println("Error: Asegúrate de introducir la fecha en el formato correcto (YYYY-MM-DD).");
        }

        sc.close();
    }
}
    
