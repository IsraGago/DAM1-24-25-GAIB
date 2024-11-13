package ud2.ejerciciosfunciones;

public class E0411_MaximoComunDivisor {
    static int maximoComunDivisor(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        if (a >= b) {
            return maximoComunDivisor(a - b, b);
        } else if (b > a) {
            return maximoComunDivisor(a, b - a);
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maximoComunDivisor(57, 30));
    }
}
