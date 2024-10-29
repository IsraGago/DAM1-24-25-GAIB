package ud2.ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;
// import java.time.Duration; esto nos permitiría hacer Duration.between(inicio, fin);

public class EP0218_CalcularRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int segundos = LocalTime.now().getSecond();
        // int a = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // genera un número mayor o igual que 1 y menor que 100
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
        System.out.printf("Has tardado %d segundos en responder.",LocalTime.now().getSecond()-segundos);
        
    }
}
