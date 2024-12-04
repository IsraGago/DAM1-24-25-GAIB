package ud3.ejerciciosclases;

import ud3.ejerciciosclases.Jugador.posiciones;

public class EP0717 {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Delio");
        Jugador jugador2 = new Jugador("54321342B","Israel",posiciones.DELANTERO,1.75);
        Jugador jugador3 = new Jugador("Mario",posiciones.PORTERO);
        
        jugador.mostrarFicha();
        jugador2.mostrarFicha();
        jugador3.mostrarFicha();
    }
}
