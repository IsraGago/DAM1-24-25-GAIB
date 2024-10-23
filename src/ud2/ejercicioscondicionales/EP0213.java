package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0213 {
    public static void main(String[] args) {
        int comidaDiaria, numAnimales;
        double kilosPorAnimal, kilosDisponibles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de comida de la que dispone (en kg): ");
        comidaDiaria = sc.nextInt();
        System.out.print("Introduzca la canidad de animales que hay: ");
        numAnimales = sc.nextInt();
        System.out.print("Introduzca la cantidad de kg que come un animal: ");
        kilosPorAnimal = sc.nextDouble();

        kilosDisponibles = (double) comidaDiaria / numAnimales;

        if (numAnimales != 0) {
            if (comidaDiaria / numAnimales >= kilosPorAnimal) {
                System.out.println("Hay suficiente comida");
            } else {
                System.out.println(
                        "No hay suficiente comida, a cada animal le corresponden " + kilosDisponibles + " kilos");
            }
        } else{
            System.out.println("Si no tienes animales que estas intentando calcular??");
        }

        sc.close();
    }
}
