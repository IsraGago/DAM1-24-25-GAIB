package ud1.operadores;
import java.util.Scanner;
public class EnergiaCinetica {
    public static void main(String[] args) {
        double masa,velocidad,energiaCinetica;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte la masa: ");
        masa = sc.nextDouble();
        System.out.println("Inserte la velocidad: ");
        velocidad = sc.nextDouble();
        sc.close();
        energiaCinetica = 1/2.0 * masa * Math.pow(velocidad,2);
        System.out.println("La energia cinética del objeto es de: "+energiaCinetica);
    }
}
