package ud2.ejercicios;

import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, numAlumnos = 0, numAlumnosMayores = 0, sumaEdades = 0;
        double mediaEdad;

        System.out.print("Inserte la edad del alumno: ");
        edad = sc.nextInt();

        while (edad >= 0) {
            numAlumnos++;
            if (edad >= 18) {
                numAlumnosMayores++;
            }
            sumaEdades += edad;
            System.out.print("Inserte la edad del alumno (-1 para salir): ");
            edad = sc.nextInt();
        }
        sc.close();
        mediaEdad = sumaEdades / numAlumnos;

        System.out.printf("La media de edad del centro educativo es: %.2f %n",mediaEdad);
        System.out.println("El número de alumnos es: "+numAlumnos);
        System.out.printf("De los cuales %d son mayores de edad",numAlumnosMayores);
    }
}
