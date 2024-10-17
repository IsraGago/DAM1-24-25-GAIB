package ud2.ejercicios;

import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        String mensaje = "";

        System.out.print("Inserte el valor del primer número: ");
        a = sc.nextInt();
        System.out.print("Inserte el valor del segundo número: ");
        b = sc.nextInt();
        System.out.print("Inserte el valor del tercer número: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                mensaje = a + " " + b + " " + c;
            } else {
                mensaje = a + " " + c + " " + b;
            }
        } else if (b > a && b > c) {
            if (a > c) {
                mensaje = b + " " + a + " " + c;
            } else {
                mensaje = b + " " + c + " " + a;
            }
        } else if (c > a && c > b){
            if (b > a) {
                mensaje = c + " " + b + " " + a;
            } else {
                mensaje = c + " " + a + " " + b;
            }
        }
        System.out.println(mensaje);
        sc.close();
    }
}
