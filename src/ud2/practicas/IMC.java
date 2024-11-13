package ud2.practicas;

import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
public class IMC {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su peso en kg: ");
        double kg = sc.nextDouble();
        while (kg < 20 || kg > 300 ) {
            System.out.println("El valor debe estar comprendido entre 20 y 300 kg");
            System.out.print("Introduzca su peso en kg: ");
            kg = sc.nextDouble();
        }
        System.out.print("Introduzca su altura en cm: ");
        double cm = sc.nextDouble();
        while (cm < 50 || kg > 250 ) {
            System.out.println("El valor debe estar comprendido entre 50 y 250 cm");
            System.out.print("Introduzca su altura en cm: ");
            cm = sc.nextDouble();
        }
        sc.close();
        double imc = imc(kg, cm);
        System.out.println("Su IMC es de "+String.format("%.2f", imc));
        System.out.print("Según la OMS, su clasificación es: ");
        System.out.println(clasificacionIMC(imc));
        
    }
}
