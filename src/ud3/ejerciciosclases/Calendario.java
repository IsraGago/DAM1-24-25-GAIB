package ud3.ejerciciosclases;
//E0213

public class Calendario {
    public int año;
    public int mes;
    public int dia;

    Calendario(int año, int mes, int dia) throws IllegalArgumentException {
        if (esFechaValida(dia, mes, año)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("ERROR: La fecha no es válida");
        }
    }

    boolean iguales(Calendario fecha1, Calendario fecha2) {
        return fecha1.año == fecha2.año && fecha1.mes == fecha2.mes && fecha1.dia == fecha2.dia;
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
        if (año == 0) {
            año = cantidad < 0 ? -1 : 1; // El año 0 no existe
        }
    }

    public void incrementarDia() {
        dia++;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia > 31) {
                    dia = 1;
                    incrementarMes();
                }
            }
            case 2 -> {
                if (dia > 28) {
                    dia = 1;
                    incrementarMes();
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia > 30) {
                    dia = 1;
                    incrementarMes();
                }
            }
            default -> {
            }
        }
    }

    public void mostrar() {
        System.out.printf("%d/%d/%d%n", dia, mes, año);
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        boolean esDiaValido = false, esMesValido = true;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    esDiaValido = true;
                }
            }
            case 2 -> {
                if (esBisiesto(año)) {
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
        return esDiaValido && esMesValido && año != 0;
    }

    public static boolean esBisiesto(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        Calendario calendario = new Calendario(2004, 13, 30);
        calendario.mostrar();
        calendario.incrementarDia();
        calendario.mostrar();
        calendario.incrementarMes();
        calendario.mostrar();
    }
}
