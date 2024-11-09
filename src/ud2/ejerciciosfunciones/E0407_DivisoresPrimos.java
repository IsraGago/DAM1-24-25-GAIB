package ud2.ejerciciosfunciones;

public class E0407_DivisoresPrimos {
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
    static int numDivisoresPrimos(int numero){
        int numDivisoresPrimos = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                if (esPrimo(i)) {
                    // System.out.println(i);
                    numDivisoresPrimos++;
                }
            }
        }
        return numDivisoresPrimos;
    }
    public static void main(String[] args) {
        System.out.println(numDivisoresPrimos(7));
    }
}
