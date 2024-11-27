package ud3.ejercicios;

public class E0702_CuentaCorriente {
    private String dni, nombreCompleto;
    private double saldo = 0;

    E0702_CuentaCorriente(String dni, String nombreCompleto, double saldo) {
        if (dni.length() == 9 && nombreCompleto.length() > 0 && saldo > 0) {
            this.dni = dni;
            this.nombreCompleto = nombreCompleto;
            this.saldo = saldo;
        }

    }

    E0702_CuentaCorriente(String dni, double saldo) {
        this(dni, " ", saldo);
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
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.printf("Saldo: %.2f%n", saldo);
        System.out.println();
    }

}
