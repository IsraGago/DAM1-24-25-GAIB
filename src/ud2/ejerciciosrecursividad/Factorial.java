package ud2.ejerciciosrecursividad;

public class Factorial {
    static int factorial(int numero){
        int factorial = 0;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = numero * factorial(numero-1);
        }
        
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
    }
}
