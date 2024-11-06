package ud2;

public class Util {

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    static boolean casiCero(double numero) {
        return (numero > -1 && numero < 0) || (numero < 1 && numero > 0);
    }

    static boolean esBisiesto(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}
