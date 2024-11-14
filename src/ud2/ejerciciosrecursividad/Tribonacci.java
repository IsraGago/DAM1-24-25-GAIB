package ud2.ejerciciosrecursividad;

public class Tribonacci {
    static int tribonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1 || numero == 2) {
            return 1;
        }
        return tribonacci(numero - 1) + tribonacci(numero - 2) + tribonacci(numero - 3);
    }
    public static void main(String[] args) {
        System.out.println(tribonacci(21));
    }
}
