package ud3.gaiexamen;

import java.util.Random;

public class JuegoCarreras01 {
    // AUTOR: ISRAEL BENJAMÍN GAGO ACUÑA

    // public void turno(CocheCarreras coche){

    // }

    public static void main(String[] args) {
        Random rd = new Random();
        final int META_CARRERA = 500;
        int contadorTurnos = 1;

        CocheCarreras coche1 = new CocheCarreras("Rayo", 90, 400);
        CocheCarreras coche2 = new CocheCarreras("Trueno", 60, 5, 300);

        CocheCarreras primero = coche1.getVelocidadMax() >= coche2.getVelocidadMax() ? coche1 : coche2;
        CocheCarreras segundo = coche1.getVelocidadMax() <= coche2.getVelocidadMax() ? coche1 : coche2;

        primero.mostrar();
        segundo.mostrar();

        // EMPIEZA EL JUEGO
        while (primero.getDistanciaRecorrida() < META_CARRERA && segundo.getDistanciaRecorrida() < META_CARRERA) {
        System.out.printf("%dº turno %n",contadorTurnos);
        contadorTurnos++;
            // PRIMER COCHE
            int avance = 0;
            boolean usoTurbo = false;
            if (primero.getAutonomiaRestante() > 0) {
                if (primero.getTurbosRestantes() > 0) {
                    if (rd.nextInt(1, 5) == 1) { // 25% de probabilidades
                        avance = primero.usarTurbo();
                        usoTurbo = true;
                    } else {
                        avance = primero.avanzar();
                    }
                } else {
                    avance = primero.avanzar();
                }
            } else {
                System.out.printf("%s para a repostar.%n", primero.getNombre());
                primero.repostar();
                avance = 0;
            }
            if (usoTurbo) {
                System.out.printf(
                        "%s usa un turbo y avanza %d metros. Quedan %d turbos. %n(Total recorrido: %d metros).%n",
                        primero.getNombre(), avance, primero.getTurbosRestantes(), primero.getDistanciaRecorrida());
            } else {
                System.out.printf("%s avanza %d metros (Total recorrido: %d metros).%n", primero.getNombre(), avance,
                        primero.getDistanciaRecorrida());
            }

            // SEGUNDO COCHE
            avance = 0;
            usoTurbo = false;
            if (segundo.getAutonomiaRestante() > 0) {
                if (segundo.getTurbosRestantes() > 0) {
                    if (rd.nextInt(1, 5) == 1) { // 25% de probabilidades
                        avance = segundo.usarTurbo();
                        usoTurbo = true;
                    } else {
                        avance = segundo.avanzar();
                    }
                } else {
                    avance = segundo.avanzar();
                }
            } else {
                System.out.printf("%s para a repostar", segundo.getNombre());
                segundo.repostar();
                avance = 0;
            }
            if (usoTurbo) {
                System.out.printf(
                        "%s usa un turbo y avanza %d metros. Quedan %d turbos. %n(Total recorrido: %d metros).%n",
                        segundo.getNombre(), avance, segundo.getTurbosRestantes(), segundo.getDistanciaRecorrida());
            } else {
                System.out.printf("%s avanza %d metros (Total recorrido: %d metros).%n", segundo.getNombre(), avance,
                        segundo.getDistanciaRecorrida());
            }
            System.out.println("-------------------------------------------------------");
        }

        if (primero.getDistanciaRecorrida() > 500) {
            System.out.printf("%s ha cruzado la meta y es el ganador!",primero.getNombre());
        } else {
            System.out.printf("%s ha cruzado la meta y es el ganador!",segundo.getNombre());
        }
    }

}
