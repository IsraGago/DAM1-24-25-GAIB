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

    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
        
    }
    static int numCifras (int numero){
        numero = Math.abs(numero);
        int cifras = 0;
        while (numero > 0) {
            numero = numero / 10;
            cifras++;
        }
        return cifras;
    }
    static String notaEnTexto(int nota){
        switch (nota) {
            case 0,1,2,3,4: return "insuficiente";
            case 5: return "suficiente";
            case 6: return "bien";
            case 7,8: return "notable";
            case 9,10: return "sobresaliente";
            default:
                return "Nota inválida (0-10)"; 
        }
    }

    static String diaSemana(int numDia){
        switch (numDia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default:
                return "dia inválido (1-7)"; 
        }
    }

}
