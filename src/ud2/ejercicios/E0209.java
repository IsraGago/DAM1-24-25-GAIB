package ud2.ejercicios;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cifras = 0, numeroAbsoluto;
        System.out.print("Introduzca un número entre 0 y 100.000: ");
        numero = sc.nextInt();
        sc.close();

        numeroAbsoluto = Math.abs(numero);

        if (numeroAbsoluto > 0 && numeroAbsoluto < 100000) {
            cifras = 1;
            if (numeroAbsoluto > 10) {
                cifras = 2;
                if (numeroAbsoluto > 100) {
                    cifras = 3;
                    if ( numeroAbsoluto > 1000){
                        cifras = 4;
                        if (numeroAbsoluto > 10000) {
                            cifras = 5;
                        }
                    }
                }
            }
        } else {
            System.out.println("El número tiene que ser mayor que 0 y menor que 100.000");
        }
        if (cifras > 0){
            System.out.println("El número "+numero+" tiene "+cifras+" cifras");
        }
    }
}
