package ud3.ejerciciosclases;

public class Bombilla {
    private boolean estaEncendida = false;
    private static boolean hayLuz = true;

    public boolean getEstado() {
        if (estaEncendida && hayLuz) {
            return estaEncendida;
        } else {
            return false;
        }
    }

    public void interruptor() {
        if (estaEncendida) {
            estaEncendida = false;
        } else {
            estaEncendida = true;
        }
    }

    public static void interruptorGeneral() {
        if (hayLuz) {
            hayLuz = false;
        } else {
            hayLuz = true;
        }
    }

}
