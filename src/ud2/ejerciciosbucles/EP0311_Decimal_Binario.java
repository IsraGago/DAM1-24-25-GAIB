package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0311_Decimal_Binario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resto = 0, numero;
        String numBinario = "";
        System.out.print("Introduzca un número entero: ");
        numero = sc.nextInt();

        sc.close();
        while (numero > 0) {
            resto = numero % 2;
            numero = numero / 2;

            numBinario = resto + numBinario;
        }
        System.out.println(numBinario);

    }
}
