package ud2.ejerciciosfunciones;

public class Factorial {
    public long factorialIterativo(int numero){
        long factorial = 1;
        if (numero == 0) {
            factorial = 1;
        } else {
            for (int i = 0; i < numero; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
    public long factorial (int numero){
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
