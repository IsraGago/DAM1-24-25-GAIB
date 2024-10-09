package ud1.operadores;
import java.util.Scanner;
public class E0110 {
    public static void main(String[] args) {
        boolean estaLLoviendo, tengoTareas, tengoRecados, podemosSalir;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (si/no) ");
        respuesta = sc.nextLine();
        estaLLoviendo = respuesta.toLowerCase().equals("si");

        System.out.print("¿Tienes tareas? (si/no) ");
        respuesta = sc.nextLine();
        tengoTareas = respuesta.toLowerCase().equals("si");

        System.out.print("¿Tienes algun recado? (si/no) ");
        respuesta = sc.nextLine();
        tengoRecados = respuesta.toLowerCase().equals("si");

        podemosSalir = (!estaLLoviendo && !tengoTareas) || tengoRecados == true;

        System.out.println("Puedes salir: "+podemosSalir);
        

        sc.close();
    }
}
