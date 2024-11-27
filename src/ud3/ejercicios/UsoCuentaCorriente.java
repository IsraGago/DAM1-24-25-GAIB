package ud3.ejercicios;

public class UsoCuentaCorriente {
    public static void main(String[] args) {
        E0701_CuentaCorriente cuenta = new E0701_CuentaCorriente("54321342B", "Israel Benjamín Gago Acuña");
        E0702_CuentaCorriente cuenta2 = new E0702_CuentaCorriente("54321342B", "Mario Gago Acuña",300);
        E0702_CuentaCorriente cuenta3 = new E0702_CuentaCorriente("54321342B", 500);
        cuenta.ingresarDinero(3000);
        cuenta.sacarDinero(30);
        cuenta.mostrarInformacion();

        cuenta2.sacarDinero(60);
        cuenta2.mostrarInformacion();

        cuenta3.ingresarDinero(800);
        cuenta3.mostrarInformacion();
        
    }
}
