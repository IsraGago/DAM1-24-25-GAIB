package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IMC {
    static Scanner sc = new Scanner(System.in);

    static int leerInt(String mensaje){
        int numero = 0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print(mensaje);
                numero = sc.nextInt();
                sc.nextLine();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: el valor introducido debe ser un entero.");
                sc.nextLine();
            }
        }
    
        return numero;
    }
    static double leerDouble(String mensaje){
        double numero = 0.0;
        boolean esValido = false;
        while (!esValido) {
            try {
                System.out.print(mensaje);
                numero = sc.nextDouble();
                sc.nextLine();
                esValido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: el valor introducido debe ser double.");
                sc.nextLine();
            }
        }
    
        return numero;
    }

    static double imc(double kg, double cm){
        double metros = cm / 100;
        return kg / Math.pow(metros, 2);
    }
    static String clasificacionIMC(double imc){
        String clasificacion = "";
        if (imc < 18.50) {
            clasificacion = "Bajo peso";
        } else if (imc > 18.5 && imc < 24.99 ){
            clasificacion ="Normal";
        } else if (imc >= 25){
            clasificacion ="Sobrepeso";
        } else if (imc >= 30){
            clasificacion ="Obesidad";
        }
        return clasificacion;

    }
    public static void main(String[] args) {

        double kg = leerDouble("Introduzca su peso en kg: ");
        while (kg < 20 || kg > 300 ) {
            System.out.println("El valor debe estar comprendido entre 20 y 300 kg");
            kg = leerDouble("Introduzca su peso en kg: ");
        }
        double cm = leerInt("Introduzca su altura en cm: ");
        while (cm < 50 || cm > 250 ) {
            System.out.println("El valor debe estar comprendido entre 50 y 250 cm");
            cm = leerInt("Introduzca su altura en cm: ");
        }
        double imc = imc(kg, cm);
        System.out.println("Su IMC es de "+String.format("%.2f", imc));
        System.out.print("Según la OMS, su clasificación es: ");
        System.out.println(clasificacionIMC(imc));
        
    }
    @Test
    void testImc() {
    // Definir casos de prueba y sus resultados esperados
    // Caso 1: Peso 70 kg, Altura 170 cm
    double resultadoCaso1 = imc(70, 170);
    assertEquals(24.22, resultadoCaso1, 0.01);
    // Caso 2: Peso 90 kg, Altura 185 cm
    double resultadoCaso2 = imc(90, 185);
    assertEquals(26.30, resultadoCaso2, 0.01);
    // Caso 3: Peso 60 kg, Altura 160 cm
    double resultadoCaso3 = imc(60, 160);
    assertEquals(23.44, resultadoCaso3, 0.01);
    double resultadoCaso4 = imc(45, 160);
    assertEquals(17.578, resultadoCaso4, 0.01);
    double resultadoCaso5 = imc(65, 165);
    assertEquals(23.875, resultadoCaso5, 0.01);
    double resultadoCaso6 = imc(100, 175);
    assertEquals(32.653, resultadoCaso6, 0.01);
    double resultadoCaso7 = imc(99.98, 200);
    assertEquals(24.995, resultadoCaso7, 0.01);
    }

}
