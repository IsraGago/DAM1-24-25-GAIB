package ud2.funciones;

import java.util.Scanner;

public class BordearString {

    public static void cajaTexto(String str, char caracter) {
        imprimirLinea(str, caracter);
        System.out.println(caracter + " " + str + " " + caracter);
        imprimirLinea(str, caracter);

    }

    public static void imprimirLinea(String str, char caracter) {
        int n = str.length();
        for (int i = 1; i <= n + 4; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char caracter;

        System.out.print("Introduzca cadena de texto: ");
        cadena = sc.nextLine();
        System.out.print("Introduzca el caracter para bordear: ");
        caracter = sc.nextLine().charAt(0);
        
        sc.close();
        cajaTexto(cadena, caracter);
    }

}
