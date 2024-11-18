package ud2.ejerciciosbucles;

public class E0310 {
    public static void main(String[] args) {
        int suma = 0;
        int contadorImpares = 0;
        final int MAX = 10;
        for (int i = 0; contadorImpares < MAX; i++) {
            if (i % 2 != 0) {
                contadorImpares++;
                System.out.println(i);
                suma += i;
            }
        }
        System.out.printf("La suma de los %d primeros números impares es: %d",MAX,suma);
        
    }
}
