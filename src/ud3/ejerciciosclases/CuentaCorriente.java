package ud3.ejerciciosclases;

public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo = 0;
    private static String banco = "Santander";
    private Gestor gestor;

    CuentaCorriente(String dni, String titular, double saldo, Gestor gestor) {
        if (dni.length() == 9 && titular.length() > 0 && saldo > 0) {
            this.dni = dni;
            this.titular = titular;
            this.saldo = saldo;
            this.gestor = gestor;
        }

    }

    CuentaCorriente(String dni, double saldo, Gestor gestor) {
        this(dni, " ", saldo, gestor);
    }

    public boolean sacarDinero(int importeARetirar) {
        boolean sePuedeRetirar = saldo > importeARetirar;
        if (sePuedeRetirar) {
            saldo -= importeARetirar;
        }
        return sePuedeRetirar;
    }

    public void ingresarDinero(int importe) {
        if (importe > 0)
            saldo += importe;
    }

    public void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre del titular: " + titular);
        System.out.printf("Saldo: %.2f%n", saldo);
        System.out.println();
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }
    public Gestor getGestor() {
        return gestor;
    }
    // public static void main(String[] args) {
    //     Gestor gestor = new Gestor("Israel Gago", "622095700");
    //     CuentaCorriente cuentaCorriente = new CuentaCorriente("54321342B","Mario Gago",70,gestor);
    //     cuentaCorriente.mostrarInformacion();
    // }

}
