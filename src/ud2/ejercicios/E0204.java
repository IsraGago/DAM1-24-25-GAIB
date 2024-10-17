package ud2.ejercicios;
import java.util.Scanner;
public class E0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        String mensaje = "";
        System.out.print("Inserte un número: ");
        numero = sc.nextDouble();
        sc.close();
        if (numero == 0) {
            mensaje = " no es un número casi 0";
        }
        else if (numero < 1 && numero > -1) {
            mensaje = " es un número casi 0";
        }
        else{
            mensaje = " no es un número casi 0";
        }
        System.out.println(numero+mensaje);
    }
}
