package ud1.ejercicios.gaib20241015;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double importe, resto;
        int billetes20, billetes50, billetes5, billetes10,monedas1,monedas2;
        System.out.print("Importe en efectivo que desea retirar (€): ");
        importe = sc.nextInt();

        billetes50 = (int) importe / 50;
        resto = importe % 50;

        billetes20 = (int) resto / 20;
        resto = resto % 20;

        billetes10 = (int) resto / 10;
        resto = resto % 10;

        billetes5 = (int) resto / 5;
        resto = resto % 5;

        monedas2 = (int) resto / 2;
        resto = resto % 2;

        monedas1 = (int) resto / 1;
        resto = resto % 1;

        System.out.println(resto);
        System.out.println("Se retirarán " + importe + " euros");
        System.out.println(billetes50 + " billetes de 50 euros: ");
        System.out.println(billetes20 + " billetes de 20 euros: ");
        System.out.println(billetes10 + " billetes de 10 euros: ");
        System.out.println(billetes5 + " billetes de 5 euros: ");
        System.out.println(monedas2 + " monedas de 2 euros: ");
        System.out.println(monedas1 + " billetes de 1 euro: ");
        System.out.println(resto > 0 ? resto + " euros no se retirarán por no haber billetes tan pequeños" : "");
        sc.close();
    }
}
