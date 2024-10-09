package ud1.ejercicios;

import java.util.Scanner;

public class EP0117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hormigas,aranas,cochinillas,total;
        System.out.println("CONTADOR DE PATAS DE INSECTOS");
        System.out.print("Inserte el número hormigas capturadas: ");
        hormigas = sc.nextInt()*6;
        System.out.print("Inserte el número arañas capturadas: ");
        aranas = sc.nextInt()*8;
        System.out.print("Inserte el número cochinillas capturadas: ");
        cochinillas = sc.nextInt()*14;

        total = hormigas+aranas+cochinillas;

        System.out.println("El número total de patas de esta joranada es: "+total);
        
        sc.close();
    }
}
