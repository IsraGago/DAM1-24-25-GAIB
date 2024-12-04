package ud3.ejerciciosclases;

public class E0709 {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        bombilla.interruptor();
        System.out.println(bombilla.getEstado());
        Bombilla.interruptorGeneral();
        System.out.println(bombilla.getEstado());
        Bombilla.interruptorGeneral();
        System.out.println(bombilla.getEstado());
    }
}
