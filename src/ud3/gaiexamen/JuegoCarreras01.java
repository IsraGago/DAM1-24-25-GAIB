package ud3.gaiexamen;

import java.util.Random;

public class JuegoCarreras01 {
    // AUTOR: ISRAEL BENJAMÍN GAGO ACUÑA

    public static void jugarTurno(CocheCarreras coche) {
        Random rd = new Random();
        int avance = 0;
        boolean usoTurbo = false;
        if (coche.getAutonomiaRestante() > 0) {
            if (coche.getTurbosRestantes() > 0) {
                if (rd.nextInt(1, 5) == 1) { // 25% de probabilidades
                    avance = coche.usarTurbo();
                    usoTurbo = true;
                } else {
                    avance = coche.avanzar();
                }
            } else {
                avance = coche.avanzar();
            }
        } else {
            System.out.printf("%s para a repostar.%n", coche.getNombre());
            coche.repostar();
            avance = 0;
        }
        if (usoTurbo) {
            System.out.printf(
                    "%s usa un turbo y avanza %d metros. Quedan %d turbos. %n(Total recorrido: %d metros).%n",
                    coche.getNombre(), avance, coche.getTurbosRestantes(), coche.getDistanciaRecorrida());
        } else {
            System.out.printf("%s avanza %d metros (Total recorrido: %d metros).%n", coche.getNombre(), avance,
                    coche.getDistanciaRecorrida());
        }
    }

    public static void main(String[] args) {

        final int META_CARRERA = 500;
        int contadorTurnos = 1;

        CocheCarreras coche1 = new CocheCarreras("Rayo", 90, 400);
        CocheCarreras coche2 = new CocheCarreras("Trueno", 60, 5, 300);

        CocheCarreras primero = coche1.getVelocidadMax() >= coche2.getVelocidadMax() ? coche1 : coche2;
        CocheCarreras segundo = coche1.getVelocidadMax() <= coche2.getVelocidadMax() ? coche1 : coche2;

        primero.mostrar();
        segundo.mostrar();

        // EMPIEZA EL JUEGO
        while (primero.getDistanciaRecorrida() <= META_CARRERA && segundo.getDistanciaRecorrida() <= META_CARRERA) {
            System.out.printf("%dº turno %n", contadorTurnos);
            contadorTurnos++;

            jugarTurno(primero);
            if (primero.getDistanciaRecorrida() <= META_CARRERA) { // EL SEGUNDO COCHE NO JUEGA TURNO PORQUE YA GANÓ EL PRIMERO
                jugarTurno(segundo);
            }

            System.out.println("-------------------------------------------------------");
        }

        if (primero.getDistanciaRecorrida() >= META_CARRERA) {
            System.out.printf("%s ha cruzado la meta y es el ganador!", primero.getNombre());
        } else {
            System.out.printf("%s ha cruzado la meta y es el ganador!", segundo.getNombre());
        }
    }

}
