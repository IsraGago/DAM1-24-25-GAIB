package ud01.ejercicios.parejas;

/**
 * Piloto: Hugo Gomez Alonso 
 * Copiloto: Israel Gago Acuña
**/

import java.util.Scanner;

public class HorasClaseAsistencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int PROGRAMACION = 240, MARCAS = 133, BASES = 187;

        int sesionesProgramacion = PROGRAMACION * 60 / 50;
        int sesionesMarcas = MARCAS * 60 / 50;
        int sesionesBases = BASES * 60 / 50;

        System.out.println("Numero de sesiones de programacion: " + sesionesProgramacion);
        System.out.println(
                "Numero de faltas sin justificar que implican un apercibimiento: " + sesionesProgramacion * 0.06);
        System.out.println(
                "Numero de faltas sin justificar para perdida de evalucion continua: " + sesionesProgramacion * 0.1);
        System.out.println();
        System.out.println("Numero de sesiones de Lenguajes de marcas: " + sesionesMarcas);
        System.out.println(
                "Numero de faltas sin justificar que implican un apercibimiento: " + sesionesMarcas * 0.06);
        System.out.println(
                "Numero de faltas sin justificar para perdida de evalucion continua: " + sesionesMarcas * 0.1);
        System.out.println();
        System.out.println("Numero de sesiones de Bases de Datos: " + sesionesBases);
        System.out.println(
                "Numero de faltas sin justificar que implican un apercibimiento: " + sesionesBases * 0.06);
        System.out.println(
                "Numero de faltas sin justificar para perdida de evalucion continua: " + sesionesBases * 0.1);

        System.out.print("Inserte el numero de faltas de programacion: ");

        int faltas = sc.nextInt();
        sc.close();

        String mensaje = faltas >= sesionesProgramacion * 0.1 ? "Has perdido la evaluacion continua"
                : faltas >= sesionesProgramacion * 0.06 ? "Tu numero de faltas implica un aprecibimiento"
                        : "No hay ningun problema";

        System.out.println(mensaje);
    }
}
