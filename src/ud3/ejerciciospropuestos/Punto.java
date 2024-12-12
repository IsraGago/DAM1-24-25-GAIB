package ud3.ejerciciospropuestos;

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        x += dx;
    }
    public void desplazaY(double dy) {
        y += dy;
    }
    public void desplaza(double dx, double dy){
        // desplazaX(dx);
        // desplazaY(dy);
        x += dx;
        y += dy;
    }
    public double distanciaEuclidea(Punto otro){
        return Math.sqrt(x - Math.pow(otro.x, 2) + Math.pow((y-otro.y), 2));
    }
    public void muestra(){
        System.out.printf("(%.2f, %.2f)%n",x,y);
    }
}
