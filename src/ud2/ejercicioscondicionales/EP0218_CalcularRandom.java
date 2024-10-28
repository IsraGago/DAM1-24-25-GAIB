package ud2.ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;

public class EP0218_CalcularRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(1, 99);
        int b = random.nextInt(1, 99);
        char operador = ' ';
        int resultado = 0;
        switch (random.nextInt(1, 3)) {
            case 1:
                operador = '+';
                resultado =  a + b;
                break;
            case 2:
                operador = '-';
                resultado =  a - b;

                break;
            case 3:
                operador = '*';
                resultado =  a * b;

                break;

            default:
                break;
        }
        System.out.printf("%d %s %d = ",a,operador,b);
        int respuesta = sc.nextInt();
        sc.close();

        if (respuesta == resultado) {
            System.out.printf("Correcto!!!\n%d %s %d = %d",a,operador,b,resultado);
        }
        else{
            System.out.printf("Has fallado... \n%d %s %d = %d",a,operador,b,resultado);
        }
        
    }
}
