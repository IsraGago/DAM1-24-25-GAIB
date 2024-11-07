package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0214_FormatearNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número entero entre 0 y 99: ");
        int numero = sc.nextInt();
        String salida = "";
        String numeroString = numero + "";
        if (numero >= 0 && numero < 100) {
            if (numero > 9 && numero < 21) {
                switch (numeroString) {
                    case "10" -> salida = "diez";
                    case "11" -> salida = "once";
                    case "12" -> salida = "doce";
                    case "13" -> salida = "trece";
                    case "14" -> salida = "catorce";
                    case "15" -> salida = "quince";
                    case "16" -> salida = "dieciseis";
                    case "17" -> salida = "diecisiete";
                    case "18" -> salida = "dieciocho";
                    case "19" -> salida = "diecinueve";
                    case "20" -> salida = "veinte";
                    case "30" -> salida = "treinta";
                    case "40" -> salida = "cuarenta";
                    case "50" -> salida = "cincuenta";
                    case "60" -> salida = "sesenta";
                    case "70" -> salida = "setenta";
                    case "80" -> salida = "ochenta";
                    case "90" -> salida = "noventa";

                }
            } else {
                if (numeroString.length() == 1) {
                    switch (numeroString.charAt(0)) {
                        case '1' -> salida = "uno";
                        case '2' -> salida = "dos";
                        case '3' -> salida = "tres";
                        case '4' -> salida = "cuatro";
                        case '5' -> salida = "cinco";
                        case '6' -> salida = "seis";
                        case '7' -> salida = "siete";
                        case '8' -> salida = "ocho";
                        case '9' -> salida = "nueve";
                    }
                } else {
                    switch (numeroString.charAt(0)) {
                        case '2' -> salida = "veinti";
                        case '3' -> salida = "trenta y ";
                        case '4' -> salida = "cuarenta y ";
                        case '5' -> salida = "cinquenta y ";
                        case '6' -> salida = "sesenta y ";
                        case '7' -> salida = "setenta y ";
                        case '8' -> salida = "ochenta y ";
                        case '9' -> salida = "noventa y ";
                    }
                    switch (numeroString.charAt(1)) {
                        case '1' -> salida += "uno";
                        case '2' -> salida += "dos";
                        case '3' -> salida += "tres";
                        case '4' -> salida += "cuatro";
                        case '5' -> salida += "cinco";
                        case '6' -> salida += "seis";
                        case '7' -> salida += "siete";
                        case '8' -> salida += "ocho";
                        case '9' -> salida += "nueve";
                    }
                }
            }
        } else {
            System.out.println("El número debe estar comprendido entre 0 y 99, incluidos");
        }

        System.out.println(salida);
        sc.close();
    }
}
