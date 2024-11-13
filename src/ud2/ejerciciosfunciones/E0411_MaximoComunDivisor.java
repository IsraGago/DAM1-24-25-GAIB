package ud2.ejerciciosfunciones;

public class E0411_MaximoComunDivisor {
    static int minimoComunDivisor(int a, int b) {

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        if (a >= b) {
            return minimoComunDivisor(a - b, b);
        } else if (b > a) {
            return minimoComunDivisor(a, b - a);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(minimoComunDivisor(25, 30));
    }
}
