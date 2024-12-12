package ud3.ejerciciospropuestos;

public class EcuacionSegundoGrado {
    private double a, b, c;
    private double discriminante = Math.pow(b, 2) - 4 * a * c;

    EcuacionSegundoGrado(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double resultadoPositivo(){
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }
    public double resultadoNegativo(){
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
    public boolean discriminantePositivo(){
        return discriminante > 0;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    public static void main(String[] args) {
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1231,750,95);
        System.out.println(ecuacion.discriminantePositivo());
        System.out.println(ecuacion.resultadoNegativo());
        System.out.println(ecuacion.resultadoPositivo());
    }
    
}
