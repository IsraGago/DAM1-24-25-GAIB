package ud2.gaiexamen;
// AUTOR: Israel Benjamín Gago Acuña

public class ChiclesDeRegalo {
    public static int totalChicles(int chiclesComprados, int numEnvoltorios, int chiclesPorEnvoltorios){
        if (chiclesComprados < 0 || numEnvoltorios < 0 || chiclesPorEnvoltorios < 0) { return -1;} // ERROR
        if (numEnvoltorios == 0) { return chiclesComprados; } // NO HAY OFERTA
        if ( chiclesPorEnvoltorios > numEnvoltorios) { return -1; } // ERROR
        int totalChicles = chiclesComprados;
        int chiclesExtra = chiclesComprados / numEnvoltorios;

        while (totalChicles % numEnvoltorios == 0) {
            chiclesExtra+=chiclesPorEnvoltorios;
            totalChicles += chiclesExtra;
        }

        return totalChicles;
    }
}
