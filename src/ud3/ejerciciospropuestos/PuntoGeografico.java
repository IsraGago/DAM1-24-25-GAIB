package ud3.ejerciciospropuestos;

import java.util.Random;

public class PuntoGeografico {
    private String nombre;
    private double latitud; // de norte a sur
    private double longitud; // de este a peste
    private final double MAX_LATITUD = 90;
    private final double MIN_LATITUD = -90;
    private final double MAX_LONGITUD = 180;
    private final double MIN_LONGITUD = -180;

    public PuntoGeografico(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        if (latitud < MIN_LATITUD || latitud > MAX_LATITUD) {
            throw new IllegalArgumentException("La latitud debe estar comprendida entre 90 y -90");
        }
        this.latitud = latitud;

        if (latitud < MIN_LATITUD || latitud > MAX_LATITUD) {
            throw new IllegalArgumentException("La longitud debe estar comprendida entre 180 y -180");
        }
        this.longitud = longitud;
    }

    public PuntoGeografico(double latitud, double longitud) {
        this("", latitud, longitud);
    }

    public PuntoGeografico() {
        this("", 0, 0);
    }

    public void mostrarGradosDecimales() {
        System.out.println("Latitud:" + latitud + "º");
        System.out.println("Longitud:" + longitud + "º");
    }

    public PuntoGeografico generarAleatorio() {
        double latitud;
        double longitud;

        Random rd = new Random();
        latitud = rd.nextDouble(MIN_LATITUD, MAX_LATITUD + 1);
        longitud = rd.nextDouble(MIN_LONGITUD, MAX_LONGITUD + 1);

        return new PuntoGeografico(latitud, longitud);

    }

    public String urlGoogleMaps(){
        return "https://www.google.es/maps/@"+latitud+","+longitud+",12z";
    }
    public String urlOpenStreetMaps(){
        return "https://www.openstreetmap.org/#map=14/"+latitud+"/"+longitud;
    }
    public String urlNominatimXml(){
        return "https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat="+latitud+"&lon="+longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
}
