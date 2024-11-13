package ud2.ejerciciosfunciones;

public class E0410_PotenciasRecursivas {
    static double potenciasRecursivas(double numero){
        if (numero == 0) {
            return 1;
        } else {
            return numero * Math.pow(numero, numero - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(potenciasRecursivas(3));
    }
}
