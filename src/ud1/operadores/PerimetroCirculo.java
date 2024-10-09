package ud1.operadores;
import java.util.Scanner;

public class PerimetroCirculo {
    public static void main(String[] args) {
        double perimetro, radio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte el radio del circulo: ");
        radio=sc.nextDouble();
        perimetro = 2*Math.PI*radio;
        System.out.println("El perimetro del circulo es "+perimetro);
        sc.close();
    }
}
