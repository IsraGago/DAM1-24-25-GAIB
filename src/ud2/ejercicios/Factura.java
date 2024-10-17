package ud2.ejercicios;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, precioFinal;
        int cantidad;
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;

        System.out.print("Introduce el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Introduce el número de unidades que deseas comprar: ");
        cantidad = sc.nextInt();
        sc.close();

        precioFinal = precio * cantidad;
        precioFinal += precioFinal * IVA;

        if (precioFinal > 100) {
            precioFinal -= precioFinal * DESCUENTO;
        }
        System.out.println("El precio final de su compra es: "+String.format("%.2f",precioFinal)+" euros");

    }
}
