package ud2.ejerciciosfunciones;

public class E0406_esPrimo {
    static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num1  = 7;
        int num2 = 4;
        System.out.println(esPrimo(num1));
        System.out.println(esPrimo(num2));
    }
}
