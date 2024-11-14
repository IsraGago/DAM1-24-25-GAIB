package ud2.ejerciciosrecursividad;

public class Suma {
    static int suma(int ultimo){
        int resultado = 0;
        if (ultimo == 1) {
            resultado = 1;
        } else {
            resultado = ultimo + suma(ultimo-1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(suma(2)); // 3
        System.out.println(suma(5)); // 15
    }
}
