package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0312_Binario_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resto = 0, numero = 0;
        String numConvertido = "";

        System.out.print("Desea pasar de binario a decimal (1) o de decimal a binario (2): ");
        byte respuesta = sc.nextByte();

        switch (respuesta) {
            case 1:
                System.out.print("Introduzca un número binario: ");
                // String binario = sc.nextLine();
                // TODO PASR DE BINARIO A DECIMAL

                break;
            case 2:
                System.out.print("Introduzca un número decimal entero: ");
                numero = sc.nextInt();

                while (numero > 0) {
                    resto = numero % 2;
                    numero = numero / 2;

                    numConvertido = resto + numConvertido;
                }
                System.out.println("En binario es: "+numConvertido);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        sc.close();


    }
}
