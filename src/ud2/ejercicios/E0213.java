package ud2.ejercicios;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos;
        String mensaje = "";

        System.out.print("Introduzca el número de las horas: ");
        horas = sc.nextInt();
        System.out.print("Introduzca el número de los minutos: ");
        minutos = sc.nextInt();
        System.out.print("Introduzca el número de los segundos: ");
        segundos = sc.nextInt();
        sc.close();

        if (segundos < 60 && minutos < 60 && horas < 24) {
            if (segundos + 1 == 60) {
                segundos = 00;
                if (minutos + 1 == 60) {
                    minutos = 0;
                    if (horas + 1 == 24) {
                        horas = 00;
                    } else {
                        horas++;
                    }
                } else {
                    minutos++;
                }
            } else {
                segundos++;
            }
            mensaje = horas < 10 ? "0" + horas : horas + "";
            mensaje += minutos < 10 ? ":0" + minutos : ":" + minutos;
            mensaje += segundos < 10 ? ":0" + segundos : ":" + segundos;
        } else {
            mensaje = "Error en los datos";
        }

        System.out.println(mensaje);

    }
}
