package ud3.ejerciciosclases;

public class Jugador {
    private String dni;
    private String nombre;
    public enum posiciones{PORTERO,DEFENSA,CENTROCAMPISTA,DELANTERO}
    private posiciones posicion;
    private double estatura; // en metros

    Jugador(String dni, String nombre,posiciones posicion,double estatura){
        // if (dni.length() == 9 && estatura > 1) {
            this.dni = dni;
            this.nombre = nombre;
            this.posicion = posicion;
            this.estatura = estatura;
        // }
    }
    Jugador(String nombre){
        this("", nombre,posiciones.CENTROCAMPISTA,0);
    }
    Jugador(String nombre,posiciones posicion){
        this("",nombre,posicion,0);
    }

    public void mostrarFicha(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Estatura: "+estatura);
        System.out.println("Posición: "+posicion.toString().toLowerCase());
    }
    
    public void cambiarPosicion(posiciones posicion){
        this.posicion = posicion;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public double getEstatura() {
        return estatura;
    }
    public posiciones getPosicion() {
        return posicion;
    }

}
