package ud01.ejercicios;

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {
        int horas,minutos,segundos,segundosTotales;
        System.out.println("CALCULAR LOS SEGUNDOS");
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte las horas: ");
        horas = sc.nextInt();           
        System.out.print("Inserte los minutos: ");  
        minutos = sc.nextInt();    
        System.out.print("Inserte los segundos: ");   
        segundos = sc.nextInt();   
        sc.close();
        segundosTotales = (horas*60*60)+(minutos*60)+segundos;
        System.out.println(horas+" horas "+minutos+" minutos "+segundos+" y segundos son "+segundosTotales+" segundos en total.");
    }
}
