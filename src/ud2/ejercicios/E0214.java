package ud2.ejercicios;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anho;
        String mensaje = "";
        boolean fechavalida = false;

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
                    if (dia + 1 > 31) {
                        dia = 1;
                        if (mes + 1 > 12) {
                            mes = 1;
                            anho++;
                        } else {
                            mes++;
                        }
                    } else {
                        dia++;
                    }
                }
            }
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    if (dia + 1 > 28) {
                        dia = 1;
                        if (mes + 1 > 12) {
                            mes = 1;
                            anho++;
                        } else {
                            mes++;
                        }
                    } else {
                        dia++;
                    }
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    if (dia + 1 > 30) {
                        dia = 1;
                        if (mes + 1 > 12) {
                            anho++;
                            mes = 1;
                        } else {
                            mes++;
                        }
                    } else {
                        dia++;
                    }
                }
            }
            default -> {
                fechavalida = false ;
            }
        }
        mensaje = "El día siguiente sería: ";
        mensaje = dia < 10 ? "0" + dia : dia + "";
        mensaje += mes < 10 ? "/0" + mes : "/" + mes;
        mensaje += anho < 10 ? "/0" + anho : "/" + anho;

        if (fechavalida){
            System.out.println(mensaje);
        }else{
            System.out.println("Error con la fecha proporcionada.");
        }
    }
}
