package ud01.operadores;

import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        double x1,x2,y1,y2,distancia,potencia1,potencia2;

        Scanner sc = new Scanner(System.in);
        System.out.print("x1 : ");
        x1 = sc.nextDouble();
        
        System.out.print("y1 : ");
        y1 = sc.nextDouble();

        System.out.print("x2 : ");
        x2 = sc.nextDouble();

        System.out.print("y2 : ");
        y2 = sc.nextDouble();
        sc.close();

        potencia1=Math.pow(x2-x1,2);
        potencia2=Math.pow(y2-y1,2);
        distancia = Math.sqrt(potencia1+potencia2);

        System.out.println("La distancia entre los dos puntos es de: "+distancia);
        
    }
}
