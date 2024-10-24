package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0222_Ahorcado {
    public static void main(String[] args) {
        int numFallos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el número de fallos: ");
        numFallos = sc.nextInt();
        sc.close();

        String fallo0 = "____\r\n"+
                        "|  |\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|_____";
        String fallo1 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|_____";
        String fallo2 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "|  |\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|\r\n" +
                        "|_____";
        String fallo3 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "| /|\r\n" +
                        "|    \r\n" +
                        "|    \r\n" +
                        "|    \r\n" +
                        "|_____";
        String fallo4 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "| /|\\\r\n" +
                        "|    \r\n" +
                        "|    \r\n" +
                        "|    \r\n" +
                        "|_____";
        String fallo5 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "| /|\\\r\n" +
                        "|  |  \r\n" +
                        "|    \r\n" +
                        "|    \r\n" +
                        "|_____";
        String fallo6 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "| /|\\\r\n" +
                        "|  |  \r\n" +
                        "| /  \r\n" +
                        "|    \r\n" +
                        "|_____";
        String fallo7 = "____ \r\n"+
                        "|  |\r\n" +
                        "|  O\r\n" +
                        "| /|\\\r\n" +
                        "|  |  \r\n" +
                        "| / \\\r\n" +
                        "|    \r\n" +
                        "|_____";

        switch (numFallos) {
            case 0 -> {
                System.out.println(fallo0);
            }
            case 1 -> {
                System.out.println(fallo1);
            }
            case 2 -> {
                System.out.println(fallo2);
            }
            case 3 -> {
                System.out.println(fallo3);
            }
            case 4 -> {
                System.out.println(fallo4);
            }
            case 5 -> {
                System.out.println(fallo5);
            }
            case 6 -> {
                System.out.println(fallo6);
            }
            case 7 -> {
                System.out.println(fallo7);
                System.out.println();
                System.out.println("Has perdido...");
            }

            default -> {
                System.out.println("Número inválido");
            }
        }
    }
}
