package ud3.ejerciciosclases;

public class Gestor {
    public String nombreGestor;
    public final String telefono;
    double importeMaximo;

    public Gestor(String nombreGestor, String telefono, double importeMaximo) {
        this.nombreGestor = nombreGestor;
        if (telefono.length() == 9) {
            this.telefono = telefono;
        } else {
            this.telefono = null;
        }
        if (importeMaximo >= 0) {
            this.importeMaximo = importeMaximo;
        }
    }

    public Gestor(String nombreGestor, String telefono) {
        this(nombreGestor, telefono, 10000);
    }

    public String getNombreGestor() {
        return nombreGestor;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }
}
