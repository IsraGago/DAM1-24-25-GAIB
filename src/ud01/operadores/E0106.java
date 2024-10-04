package ud01.operadores;

import java.util.Scanner;

public class E0106 {
    public static void main(String[] args) {
        int nota1,nota2,nota3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la primera nota: ");
        nota1=sc.nextInt();
        System.out.print("Inserte la segunda nota: ");
        nota2=sc.nextInt();
        System.out.print("Inserte la tercera nota: ");
        nota3=sc.nextInt();
        sc.close();

        double media;
        media = ((double)nota1+nota2+nota3)/3;
        System.out.println(media);
    }
}
