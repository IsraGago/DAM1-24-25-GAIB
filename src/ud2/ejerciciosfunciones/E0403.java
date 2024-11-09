package ud2.ejerciciosfunciones;

public class E0403 {
    static double calcularAreaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (altura * radio);
    }

    static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    static double calcularAreaOVolumenCilindro(int opcion, double radio, double altura) {
        switch (opcion) {
            case 1: return calcularAreaCilindro(radio, altura);
            case 2: return calcularVolumenCilindro(radio, altura);
            default: return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("El area del cilindro es: "+calcularAreaOVolumenCilindro(1, 30, 50));
        System.out.println("El volumen del cilindro es: "+calcularAreaOVolumenCilindro(2, 30, 50));
    }
}
