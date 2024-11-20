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

        if (cantidadEncendidos == maxEncendidos) {
            cadena = "ENCENDIDOS + HORAS";
        } else if (cantidadEncendidos < maxEncendidos) {
            cadena = "HORAS";
        } else if (cantidadEncendidos > maxEncendidos) {
            cadena = "ENCENDIDOS";
        }
        return cadena;
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
