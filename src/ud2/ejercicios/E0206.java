package ud2.ejercicios;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b;
        String mensaje = "";

        System.out.print("Escriba el primer número entero: ");
        a = sc.nextInt();
        System.out.print("Escriba el segundo número entero: ");
        b = sc.nextInt();
        sc.close();

        if(a > b){
            mensaje = a+" "+b;
        }
        else if (b > a){
            mensaje = b+" "+a;
        }
        else if (a == b){
            mensaje = "Los números son iguales";
        }
        System.out.println(mensaje);
    }
}
