package ud2.gaiexamen;
// AUTOR: Israel Benjamín Gago Acuña

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DuracionDeBombillas {
    static String causaFinBombilla(int maxHoras, int maxEncendidos, int horasEncendidaPorUso) {
        String cadena = "";
        if (horasEncendidaPorUso < 1 || maxHoras < 1 || horasEncendidaPorUso > 10 || maxEncendidos < 1) {
            return "ERROR";
        }
        int cantidadEncendidos = maxHoras / horasEncendidaPorUso;
        // int horasMaxEstiamdasUso = maxEncendidos * horasEncendidaPorUso; otra posible solución

        if (cantidadEncendidos == maxEncendidos) {
            cadena = "ENCENDIDOS + HORAS";
        } else if (cantidadEncendidos < maxEncendidos) {
            cadena = "HORAS";
        } else if (cantidadEncendidos > maxEncendidos) { // esta última comprobación sobra, con el else llega y es más eficiente,
            cadena = "ENCENDIDOS";                       // porque no van a haber más casos
        }
        return cadena;
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
