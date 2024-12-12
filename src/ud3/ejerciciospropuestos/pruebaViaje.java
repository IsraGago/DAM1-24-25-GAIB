package ud3.ejerciciospropuestos;

import java.time.LocalDateTime;

public class pruebaViaje {
    public static void main(String[] args) {
        User conductor = new User("Israel", "abc123.,");
        PuntoGeografico origen = new PuntoGeografico().generarAleatorio();
        PuntoGeografico destino = new PuntoGeografico().generarAleatorio();
        Viaje viaje = new Viaje(conductor, LocalDateTime.of(2024, 12, 27, 8, 0, 0), origen, destino, 5);

        viaje.mostrar();
    }
}
