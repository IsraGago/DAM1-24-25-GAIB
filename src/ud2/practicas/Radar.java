package ud2.practicas;

import java.util.Scanner;

public class Radar {
    static int excesoVelocidad(double distancia, int tiempo, int limite) {
        double tiempoHoras = tiempo / 3600.0;
        double velocidadMedia = distancia / tiempoHoras;
        System.out.printf("LLevaba una velocidad media de %.2f km/h%n",velocidadMedia);
        if (velocidadMedia > limite) {
            return (int) velocidadMedia - limite;
        } else {
            return 0;
        }
    }

    static int multaInfraccion(int limite, double excesoVelocidad) {
        int multa = 0;
        if (limite <= 50 && excesoVelocidad > 0) {
            if (excesoVelocidad <= 20) {
                multa = 100;
            } else if (excesoVelocidad <= 30){
                multa = 300;
            } else if (excesoVelocidad <= 40){
                multa = 400;
            } else if (excesoVelocidad <= 50){
                multa = 500;
            }else {
                multa = 600;
            }
        } else if (limite >= 60 && excesoVelocidad > 0) {
            if (excesoVelocidad <= 30) {
                multa = 100;
            } else if (excesoVelocidad <= 50) {
                multa = 300;
            } else if (excesoVelocidad <= 60) {
                multa = 400;
            } else if (excesoVelocidad <= 70){
                multa = 500;
            } else {
                multa = 600;
            }
        }
        return multa;
    }

    public static void main(String[] args) {
        final int DISTANCIA = 10;
        final int LIMITE_VELOCIDAD = 120;
        Scanner sc = new Scanner(System.in);
        System.out
                .print("Introduzca la cantidad de segundos que tardó el vehículo en recorrer la distancia indicada: ");
        int segundos = sc.nextInt();
        sc.close();

        int exceso = excesoVelocidad(DISTANCIA, segundos, LIMITE_VELOCIDAD);
        if (exceso > 0) {
            int multa = multaInfraccion(LIMITE_VELOCIDAD, exceso);
            System.out.println("El exceso ha sido de "+exceso+" km/h");
            System.out.println("La multa es de "+multa+" euros.");

        } else {
            System.out.println("No ha habido exceso de velocidad.");
        }

    }
}
