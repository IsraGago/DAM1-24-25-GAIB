package ud3.ejerciciosclases;

public class Bombilla {
    private boolean estaEncendida = false;
    private static boolean hayLuz = false;

    public boolean estado() {
        return estaEncendida && hayLuz;
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
