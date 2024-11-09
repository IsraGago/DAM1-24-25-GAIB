package ud2.ejerciciosfunciones;

public class E0408_calculadora {
    static double calculadora(int operacion,double a , double b){
        double resultado = 0;
        switch (operacion) {
            case 1: resultado = a + b; 
            case 2: resultado = a - b; 
            case 3: resultado = a * b; 
            case 4: if (b > 0) { resultado = a / b;}; 
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(calculadora(1, 1, 4)); // 5
        System.out.println(calculadora(2, 5, 2)); // 3
        System.out.println(calculadora(3, 6, 2)); // 12
        System.out.println(calculadora(4, 28, 2));// 14
        System.out.println(calculadora(4, 0, 0)); // error
    }
}
