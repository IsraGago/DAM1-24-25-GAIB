package ud2.ejercicios;

import java.util.Scanner;

public class Ventas {

    public static String nombreDia(int numero){
        String nombreDia = "";
            switch (numero) {
                case 1: nombreDia = "MARTES"; break;
                case 2: nombreDia = "MIÉRCOLES"; break;
                case 3: nombreDia = "JUEVES"; break;
                case 4: nombreDia = "VIERNES"; break;
                case 5: nombreDia = "SÁBADO"; break;
                case 6: nombreDia = "DOMINGO"; break;
            }
        return nombreDia;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0, min = 0, media = 0;
        int diaMaxRecaudacion =0, diaMinRecaudacion =0;
        double recaudacion = 0;
        final double NUM_DIAS = 6;
        for (int i = 1; i <= NUM_DIAS; i++) {

            String nombreDia = nombreDia(i);
            System.out.print("Ventas del " + nombreDia.toLowerCase() + ": ");
            recaudacion = sc.nextDouble();
            if (i == 1) {
                min = recaudacion;
                max = recaudacion;
                diaMaxRecaudacion = i;
                diaMinRecaudacion = i;
            } else if (recaudacion < min) {
                min = recaudacion;
                diaMinRecaudacion = i;
            } else if (recaudacion > max) {
                max = recaudacion;
                diaMaxRecaudacion = i;
            }
            media += recaudacion;
        }
        media /= NUM_DIAS;
        sc.close();

        System.out.println(nombreDia(diaMaxRecaudacion)+" "+nombreDia(diaMinRecaudacion)+(recaudacion > media ? " SI" : " NO" ));
    }
}
