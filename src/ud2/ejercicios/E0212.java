package ud2.ejercicios;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String error = "Error con los datos";
        int dia, mes, anho;
        boolean esDiaValido = false, esMesValido = true;

        System.out.print("Introduzca el número del día: ");
        dia = sc.nextInt();
        System.out.print("Introduzca el número del mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca el número del año: ");
        anho = sc.nextInt();
        
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    esDiaValido = true;
                }
            }
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    esDiaValido = true;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    esDiaValido = true;
                }
            }
            default -> {
                esMesValido = false;
            }
        }

        if (esMesValido && esDiaValido) {
            System.out.println("La fecha "+dia+"/"+mes+"/"+anho+" es válida");
        } else {
            System.out.println(error);
        }
    }
}
