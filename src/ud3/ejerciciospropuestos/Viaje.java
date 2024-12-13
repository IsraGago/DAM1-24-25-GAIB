package ud3.ejerciciospropuestos;

import java.time.LocalDateTime;

public class Viaje {
    private User conductor;
    private LocalDateTime fecha;
    private PuntoGeografico origen;
    private PuntoGeografico destino;
    private int numPlazasLibres;

    public Viaje(User conductor, LocalDateTime fecha, PuntoGeografico origen, PuntoGeografico destino,
            int numPlazasLibres) {

        if (numPlazasLibres > 0) {
            this.numPlazasLibres = numPlazasLibres;
        } else {
            throw new IllegalArgumentException("ERROR: El número de plazas libres no puede ser menor que 0");
        }
        this.conductor = conductor;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;

    }

    public void mostrar() {
        System.out.println("CONDUCTOR");
        conductor.mostrar();
        System.out.println("Plazas libres: "+numPlazasLibres);
        System.out.println();

        System.out.println("FECHA");
        System.out.println(fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() +
                " " + fecha.getHour() + ":" + fecha.getMinute());
        System.out.println();

        System.out.println("ORIGEN");
        origen.mostrarGradosDecimales();
        System.out.println(origen.urlGoogleMaps());;
        System.out.println();

        System.out.println("DESTINO");
        destino.mostrarGradosDecimales();
        System.out.println(destino.urlGoogleMaps());
        System.out.println();

        System.out.println("TRAYECTO");
        System.out.println(urlOpenStreetMaps());
    }

    public String urlOpenStreetMaps() {
        return "https://www.openstreetmap.org/directions?engine=fossgis_osrm_car&route=" + origen.getLatitud() + "%2C"
                + origen.getLongitud() + "%3B" + destino.getLatitud() + "%2C" + destino.getLongitud() + "";
    }

    public String toString() {
        // dd/mm/aaaa hh:mm - conductor - PuntoOrigen >> PuntoDestino
        return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() +
                " " + fecha.getHour() + ":" + fecha.getMinute() + " - " + conductor.getUsername() + origen.getNombre()
                + destino.getNombre();
    }

    // GETTERS
    public User getConductor() {
        return conductor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public PuntoGeografico getOrigen() {
        return origen;
    }

    public PuntoGeografico getDestino() {
        return destino;
    }

    public int getNumPlazasLibres() {
        return numPlazasLibres;
    }

}
