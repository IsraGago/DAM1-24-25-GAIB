package ud1.ejercicios;

import java.util.Scanner;

public class E05_Sueldo {
    public static void main(String[] args) {
        double horasDiarias,pagoPorHora,horasSemanales,sueldoSemanal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte su número de horas laborales diarias: ");
        horasDiarias = sc.nextDouble();
        horasSemanales = horasDiarias * 5;
        System.out.print("Inserte cuanto le pagan por hora: ");
        pagoPorHora = sc.nextDouble();
        sueldoSemanal = pagoPorHora * horasSemanales;
        System.out.printf("Su sueldo semanal es de %.2f euros",sueldoSemanal);
        sc.close();
    }
}
