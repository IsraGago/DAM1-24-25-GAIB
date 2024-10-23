package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un número entre 0 y 9999: ");
        int numero = sc.nextInt();
        String numeroString = numero+"";
        String numeroAlReves= "";
        sc.close();
        if (numero > 0 && numero < 9999){
            for (int i = numeroString.length()-1; i >= 0; i--) {
                numeroAlReves+=numeroString.charAt(i);
            }
        }
        if (numeroString.equals(numeroAlReves)) {
            System.out.println("El número "+numero+" es capicúa");
        } else{
            System.out.println("El número "+numero+" NO es capicúa");

        }
    }
}
