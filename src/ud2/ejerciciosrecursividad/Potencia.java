package ud2.ejerciciosrecursividad;

public class Potencia {
    static double potencia(double base,double exponente){
        if (exponente == 0) {
            return 1;
        }
        // Llamada recursiva para calcular la potencia
        return base * potencia(base, exponente - 1);
    }
    public static void main(String[] args) {
        System.out.println(Math.pow(5, 2));
        System.out.println(potencia(5, 2));
    }
}
