package ud3.ejerciciosclases;
//E0213

public class Calendario {
    public int año;
    public int mes;
    public int dia;

    Calendario(int año, int mes, int dia) {
        if (esFechaValida(dia, mes, año)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            año++;
        }
    }

    public void incrementarAño() {
        año++;
    }

    public void incrementarDia() {
        dia++;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia > 31) {
                    dia = 1;
                    mes++;
                    if (mes > 12) {
                        mes = 1;
                        año++;
                    }
                }
            }
            case 2 -> {
                if (dia > 28) {
                    mes++;
                    dia = 1;
                    if (mes > 12) {
                        mes = 1;
                        año++;
                    }
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia > 30) {
                    dia = 1;
                    mes++;
                    if (mes > 12) {
                        año++;
                        mes = 1;
                    }
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
        return esDiaValido && esMesValido;
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
