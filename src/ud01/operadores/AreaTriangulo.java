package ud01.operadores;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area,base,altura;

        System.out.print("Base del triangulo (centímetros): ");
        base =sc.nextDouble();
        System.out.print("Altura del triangulo (centímetros): ");
        altura =sc.nextDouble();
        sc.close();

        area = (base*altura)/2;

        System.out.println("El área del triangulo es de "+area+" cm cuadrados.");

    }
}
