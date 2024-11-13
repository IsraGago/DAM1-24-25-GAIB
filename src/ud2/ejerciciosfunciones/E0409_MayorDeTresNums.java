package ud2.ejerciciosfunciones;

public class E0409_MayorDeTresNums {
    static int maxNum(int a, int b, int c) {
        int mayor = a;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else if (c >= a && c >= b) {
            mayor = c;
        }

        return mayor;
    }
    static int maxNum(int a ,int b){
        return a >= b ? a : b ;
    }

    public static void main(String[] args) {
        int a = 6, b = 32, c = 11;
        System.out.println(maxNum(a, b, c));
        System.out.println(maxNum(a, c));
    }
}