package ud2.gaiexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// AUTOR: Israel Benjamín Gago Acuña

public class ChiclesDeRegalo {
    public static int totalChicles(int chiclesComprados, int numEnvoltorios, int chiclesPorEnvoltorios) {
        if (numEnvoltorios == 0) { // NO HAY OFERTA
            return chiclesComprados;
        }
        if (chiclesComprados < 0 || numEnvoltorios < 0 || chiclesPorEnvoltorios < 0 || chiclesPorEnvoltorios >= numEnvoltorios) { // ERROR
            return -1;
        } 

        int totalChicles = chiclesComprados;
        int envoltorios = chiclesComprados;

        while (envoltorios >= numEnvoltorios) {
            int chiclesExtra =(envoltorios/numEnvoltorios)*chiclesPorEnvoltorios;
            totalChicles +=chiclesExtra;
            envoltorios = (envoltorios %numEnvoltorios)+chiclesExtra;
        }

        return totalChicles;
    }

    @Test
    public void ChiclesRegaloTest() {
    assertEquals(31, totalChicles(25, 5, 1));
    assertEquals(6, totalChicles(5, 5, 1));
    assertEquals(111, totalChicles(100, 10, 1));
    assertEquals(-1, totalChicles(20, 2, 5));
    assertEquals(-1, totalChicles(10, -1, 0));
    assertEquals(-1, totalChicles(-1, 2, 1));
    assertEquals(-1, totalChicles(10, 1, -1));
    assertEquals(-1, totalChicles(20, 2, 2));
    assertEquals(10, totalChicles(7, 3, 1));
    assertEquals(40, totalChicles(27, 3, 1)); // mal
    assertEquals(21, totalChicles(11, 2, 1)); // mal
    assertEquals(31, totalChicles(16, 2, 1)); // mal
    assertEquals(100, totalChicles(100, 0, 0));
    assertEquals(100, totalChicles(100, 0, 1));
    assertEquals(0, totalChicles(0, 0, 1));
    assertEquals(0, totalChicles(0, 2, 1)); // mal
    }
}
