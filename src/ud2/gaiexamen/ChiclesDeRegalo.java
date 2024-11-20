package ud2.gaiexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// AUTOR: Israel Benjamín Gago Acuña

public class ChiclesDeRegalo {
    public static int totalChicles(int chiclesComprados, int numEnvoltorios, int chiclesPorEnvoltorios) {
        if (chiclesComprados < 0 || numEnvoltorios < 0 || chiclesPorEnvoltorios < 0) { // ERROR
            return -1;
        } 
        if (numEnvoltorios == 0) { // NO HAY OFERTA
            return chiclesComprados;
        } 
        if (chiclesPorEnvoltorios > numEnvoltorios) { // ERROR
            return -1;
        } 

        int totalChicles = chiclesComprados;
        int chiclesExtra = chiclesComprados / numEnvoltorios;
        totalChicles += chiclesExtra;

        while (totalChicles % numEnvoltorios == 0) {
            chiclesExtra = chiclesPorEnvoltorios;
            totalChicles += chiclesExtra;
        }

        return totalChicles;
    }
    public static void main(String[] args) {
      totalChicles(5, 5, 1);
        
    }
    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
    }
}
