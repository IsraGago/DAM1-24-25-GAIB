package ud3.ejerciciosclases;

public class Sintonizador {
    private double frecuencia = 80;
    private double emisora1 = 0;
    private double emisora2 = 0;
    private double emisora3 = 0;
    public static final double FRECUENCIA_MAX = 108;
    public static final double FRECUENCIA_MIN = 80;

    Sintonizador(double frecuencia) {
        try {
            setFrecuencia(frecuencia);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean esFrecuenciaValida(double frecuencia) {
        return frecuencia >= FRECUENCIA_MIN && frecuencia <= FRECUENCIA_MAX;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) throws IllegalArgumentException {
        if (esFrecuenciaValida(frecuencia)) {
            this.frecuencia = frecuencia;
        } else {
            throw new IllegalArgumentException(
                    "Frecuencia inválida, debe estar comprendida entre " + FRECUENCIA_MIN + " y " + FRECUENCIA_MAX
                            + " MHz");
        }
    }

    public void display() {
        System.out.println("La frecuencia es: " + frecuencia + " MHz");
    }

    // SUBIR Y BAJAR FRECUENCIAS
    private void cambiarFrecuencia(double incremento) {
        frecuencia += incremento;
        if (frecuencia > FRECUENCIA_MAX) {
            frecuencia = FRECUENCIA_MIN;
        } else if (frecuencia < FRECUENCIA_MIN) {
            frecuencia = FRECUENCIA_MAX;
        }
    }

    public void up() {
        cambiarFrecuencia(0.5);
    }

    public void down() {
        cambiarFrecuencia(-0.5);
    }

    public void upLow() {
        cambiarFrecuencia(0.1);
    }

    public void downLow() {
        cambiarFrecuencia(-0.1);
    }

    // GESTIÓN MEMORIAS
    public double irEmisora1() {
        if (emisora1 != 0) {
            frecuencia = emisora1;
            return emisora1;
        }
        return 0;
    }

    public double irEmisora2() {
        if (emisora2 != 0) {
            frecuencia = emisora2;
            return emisora2;
        } else {
            return 0;
        }
    }

    public double irEmisora3() {
        if (emisora3 != 0) {
            frecuencia = emisora3;
            return emisora3;
        } else {
            return 0;
        }
    }

    public void guardarEmisora1() {
        emisora1 = frecuencia;
    }

    public void guardarEmisora2() {
        emisora2 = frecuencia;
    }

    public void guardarEmisora3() {
        emisora3 = frecuencia;
    }
}
