package ud2.practicas;

import java.util.Random;

public class Dado {
    public static int lanzarDado(){
        Random rd = new Random();
        return rd.nextInt(1,7);
    }
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;
        int contador1,contador2,contador3,contador4,contador5,contador6;
        contador1 = contador2 = contador3 = contador4 = contador5 = contador6 = 0;
        int num;
        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            num = lanzarDado();
            switch (num) {
                case 1:contador1++;break;    
                case 2:contador2++;break;    
                case 3:contador3++;break;    
                case 4:contador4++;break;    
                case 5:contador5++;break;    
                case 6:contador6++;break;
                default:break;
            }
        }
       
        System.out.println("Ha salido 1: "+contador1+" veces ("+String.format("%.1f", (double)contador1/1000*100)+"%)");
        System.out.println("Ha salido 2: "+contador2+" veces ("+String.format("%.1f", (double)contador2/1000*100)+"%)");
        System.out.println("Ha salido 3: "+contador3+" veces ("+String.format("%.1f", (double)contador3/1000*100)+"%)");
        System.out.println("Ha salido 4: "+contador4+" veces ("+String.format("%.1f", (double)contador4/1000*100)+"%)");
        System.out.println("Ha salido 5: "+contador5+" veces ("+String.format("%.1f", (double)contador5/1000*100)+"%)");
        System.out.println("Ha salido 6: "+contador6+" veces ("+String.format("%.1f", (double)contador6/1000*100)+"%)");
    }
}
