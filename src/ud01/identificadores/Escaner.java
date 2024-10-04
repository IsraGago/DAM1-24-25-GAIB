package ud01.identificadores;

import java.time.LocalDateTime;
import java.util.Scanner; // Para poder usar la clase Scanner

public class Escaner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cómo te llamas? ");
        String nombre = sc.nextLine();

        String nombreFormateado="";

        for (String palabra : nombre.split(" ")) {
            nombreFormateado += palabra.substring(0, 1).toUpperCase()+palabra.substring(1,palabra.length())+" ";

        }
        nombreFormateado=nombreFormateado.substring(0,nombreFormateado.length()-1);

        System.out.println("Hola " + nombreFormateado + ", estamos aprendiendo a progamar.");
        System.out.print("En que año naciste? ");

        int anhoNacimiento = sc.nextInt();
        int anhoActual = LocalDateTime.now().getYear();
        int edad = anhoActual - anhoNacimiento;

        System.out.println("Cuantos años tienes " + (edad - 1) + " o " + edad + "?");

        int respuesta = sc.nextInt();

        if (edad == respuesta) {
            System.out.println("Conque ya ha sido tu cumpleaños! felicidades por tus " + edad + " años!");
        } 
        else if (edad - 1 == respuesta) {
            System.out.println("Conque aún no ha sido tu cumpleaños, felicidades adelantadas!");
        } 
        else if (respuesta != edad && respuesta != edad - 1) {
            System.out.println("Eso es imposible, si tu año de nacimiento es " + anhoNacimiento + " solo puedes tener "
                    + (edad - 1) + " o " + edad + " años");
        }

        sc.close();

    }
}
