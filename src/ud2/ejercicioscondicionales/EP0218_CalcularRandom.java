package ud2.ejercicioscondicionales;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;
// import java.time.Duration; esto nos permitiría hacer Duration.between(inicio, fin);

public class EP0218_CalcularRandom {
    public static void main(String[] args) {
        final int MIN = 1, MAX = 100, MAX_OPERADORES = 4;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int segundos = LocalTime.now().getSecond();
        // int a = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // genera un número mayor o igual que 1 y menor que 100
        int a = random.nextInt(MIN, MAX);
        int b = random.nextInt(MIN, MAX);
        char operador = ' ';
        int resultado = 0;
        switch (random.nextInt(MIN, MAX_OPERADORES)) {
            case 1:
                operador = '+';
                resultado = a + b;
                break;
            case 2:
                operador = '-';
                resultado = a - b;

                break;
            case 3:
                operador = '*';
                resultado = a * b;

                break;

            default:
                break;
        }
        System.out.printf("%d %s %d = ", a, operador, b);
        int respuesta = sc.nextInt();
        sc.close();

        if (respuesta == resultado) {
            System.out.printf("Correcto!!!\n");
        } else {
            System.out.printf("Has fallado... \n%d %s %d = %d", a, operador, b, resultado);
        }
        System.out.printf("\nHas tardado %d segundos en responder.", LocalTime.now().getSecond() - segundos);

    }
}
