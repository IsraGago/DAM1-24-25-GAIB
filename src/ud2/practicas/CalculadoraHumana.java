package ud2.practicas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    static char operadorAleatorio(int numero){
        switch (numero) {
            case 1: return '+';
            case 2: return '-';
            case 3: return '*';
            case 4: return '/';
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final int NUM_OPERACIONES_MAXIMAS = 7;
        final int NUM_FALLOS_MAXIMOS = 10;
        int numFallos = 0;
        int numAciertos = 0;
        int num1, num2,resultado = 0,respuesta = 0;
        char operador = ' ';
        

        System.out.println("LA CALCULADORA HUMANA");

        while (numAciertos != NUM_OPERACIONES_MAXIMAS  && numFallos != NUM_FALLOS_MAXIMOS ) {
            operador = operadorAleatorio(random.nextInt(1,4));
            if (numAciertos == 0) {
                num1 = random.nextInt(1,200);
            } else {
                num1 = resultado;
            }
            num2 = random.nextInt(1,200);
            switch (operador) {
                case '+': resultado = num1 + num2; break;
                case '-': resultado = num1 - num2; break;
                case '*': resultado = num1 * num2; break; 
                case '/': resultado = num1 / num2; break;
            }
            System.out.printf("%d %s %d = ",num1,operador,num2);
            respuesta = sc.nextInt();
            // respuesta == resultado ? numAciertos++ : numFallos++ ;
            if (respuesta == resultado) {
                numAciertos++;
                System.out.printf("Correcto!! %d aciertos%n",numAciertos);
            } else {
                numFallos++;
                System.out.printf("Has fallado %d fallos%n",numFallos);

            }
            
        }
        sc.close();

    }
}
