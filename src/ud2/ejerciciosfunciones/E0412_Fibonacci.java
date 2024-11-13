package ud2.ejerciciosfunciones;

public class E0412_Fibonacci {

    static int fibonacci(int n){
        if (n == 1) {
            return 1;
        } else if (n == 0){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
