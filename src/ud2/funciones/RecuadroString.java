package ud2.funciones;

import java.util.Scanner;

public class RecuadroString {

    public static void cajaTexto(String str){
        imprimirLinea(str);
        System.out.println("# " + str + " #");
        imprimirLinea(str);

    }
    public static void imprimirLinea(String str){
        int n = str.length();
        for (int i = 1; i <= n + 4; i++){
             System.out.print("#"); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        sc.close();
        cajaTexto(cadena);
    }

}
