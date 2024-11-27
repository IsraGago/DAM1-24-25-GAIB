package ud3.ejercicios;

public class E0701_CuentaCorriente {
    private String dni, nombreCompleto;
    private double saldo = 0;

    E0701_CuentaCorriente(String dni, String nombreCompleto) {
        if (dni.length() == 9 && nombreCompleto.length() > 0) {
            this.dni = dni;
            this.nombreCompleto = nombreCompleto;
        }

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
