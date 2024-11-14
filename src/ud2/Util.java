package ud2;

public class Util {


    public static void imrpimirTrianguloRectangulo(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }    
    }

    public static void imrpimirTrianguloRectanguloInverso(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }    
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean casiCero(double numero) {
        return (numero > -1 && numero < 0) || (numero < 1 && numero > 0);
    }

    public static boolean esBisiesto(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static boolean esPrimo(int numero) {
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

    public static int numCifras(int numero) {
        numero = Math.abs(numero);
        int cifras = 0;
        while (numero > 0) {
            numero = numero / 10;
            cifras++;
        }
        return cifras;
    }

    public static String notaEnTexto(int nota) {
        switch (nota) {
            case 0, 1, 2, 3, 4:
                return "insuficiente";
            case 5:
                return "suficiente";
            case 6:
                return "bien";
            case 7, 8:
                return "notable";
            case 9, 10:
                return "sobresaliente";
            default:
                return "";
        }
    }

    public static String notaEnTexto(double nota) {
        if (nota < 0 || nota > 10) {
            return "";
        }

        String notaEnTexto = "";

        if (nota > 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota > 5 && nota < 6) {
            notaEnTexto = "suficiente";
        } else if (nota > 6 && nota < 7) {
            notaEnTexto = "bien";
        } else if (nota > 7 && nota < 9) {
            notaEnTexto = "notable";
        } else if (nota > 9 && nota <= 10) {
            notaEnTexto = "sobresaliente";
        }
        return notaEnTexto;
    }

    public static String diaSemana(int numDia) {
        switch (numDia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "";
        }
    }

    public static boolean esFechaValida(int dia, int mes, int anho) {
        boolean esDiaValido = false, esMesValido = true;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    esDiaValido = true;
                }
            }
            case 2 -> {
                if (esBisiesto(anho)) {
                    if (dia >= 1 && dia <= 29) {
                        esDiaValido = true;
                    }
                } else if (dia >= 1 && dia <= 28) {
                    esDiaValido = true;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    esDiaValido = true;
                }
            }
            default -> {
                esMesValido = false;
            }
        }
        return esDiaValido && esMesValido;
    }

    public static boolean esHoraCorrecta(int segundos, int minutos, int horas) {
        if (segundos > 0 && segundos < 60) {
            if (minutos > 0 && minutos < 60) {
                if (horas >= 0 && horas < 24) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String numeroAtexto(int i){
        if (i < 1 || i > 99) {return "";}

        int decenas = i / 10; // obtengo las decenas entre 0 y 9;
        switch (decenas) {
            case 0: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
        }

        String strUnidades = "";
        switch (i) {
            case 1: strUnidades = "uno"; break;
            case 2: strUnidades = "dos"; break;
            case 3: strUnidades = "tres"; break;
            case 4: strUnidades = "cuatro"; break;
            case 5: strUnidades = "cinco"; break;
            case 6: strUnidades = "seis"; break;
            case 7: strUnidades = "siete"; break;
            case 8: strUnidades = "ocho"; break;
            case 9: strUnidades = "nueve"; break;
        }
        return strUnidades;
    }

}
