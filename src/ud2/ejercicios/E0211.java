package ud2.ejercicios;

import java.util.Scanner;

public class E0211 {
    public static void main(String[] args) {
        String mensaje= "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número comprendido entre 1 y 7: ");
        int dia = sc.nextInt();
        sc.close();
        switch (dia) {
            case 1: mensaje = "Lunes";
                break;
            case 2: mensaje = "Martes";
                break;
            case 3: mensaje = "Miércoles";
                break;
            case 4: mensaje = "Jueves";
                break;
            case 5: mensaje = "Viernes";
                break;
            case 6: mensaje = "Sábado";
                break;
            case 7: mensaje = "Domingo";
                break;
        
            default:
                break;
        }
        System.out.println("Hoy es "+mensaje);
    }
}
