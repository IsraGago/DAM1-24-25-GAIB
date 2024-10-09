package ud1.operadores;

import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        double volumen,radio,altura;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio del cilindro: ");
        radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        altura = sc.nextDouble();
        sc.close();
        volumen = Math.PI*Math.pow(radio,2)*altura;
        System.out.println("El volumen del cilindro es "+volumen);
    }
}
