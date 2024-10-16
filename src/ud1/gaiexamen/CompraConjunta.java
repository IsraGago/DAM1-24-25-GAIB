package ud1.gaiexamen;
//Autor:  Israel Benjamín Gago Acuña

import java.util.Scanner;

public class CompraConjunta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amigo1, amigo2, amigo3, suma, precioProducto, resto;

        System.out.print("Inserte el valor del producto que quiere comprar: ");
        precioProducto = sc.nextDouble();
        System.out.print("Inserte el dinero que aporta el primer amigo: ");
        amigo1 = sc.nextDouble();
        System.out.print("Inserte el dinero que aporta el segundo amigo: ");
        amigo2 = sc.nextDouble();
        System.out.print("Inserte el dinero que aporta el tercer amigo: ");
        amigo3 = sc.nextDouble();

        suma = amigo1 + amigo2 + amigo3;
        resto = precioProducto - suma;

        System.out.println(suma > precioProducto ? "Sobran " + String.format("%.2f", Math.abs(resto)) + " euros."
                : suma < precioProducto ? "Faltan " + String.format("%.2f", resto) + " euros "
                        : "No sobra ni falta dinero");

        sc.close();
    }
}
