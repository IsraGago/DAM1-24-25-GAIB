package ud2.ejerciciosfunciones;

public class E0404_MayorDeDosNums {
    static int mayorDeDos(int a, int b) {
        return a > b ? a : b;
    }
    static double mayorDeDos(double a, double b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        double num3 = 24.4;
        double num4 = 21.3;
        System.out.println(mayorDeDos(num1, num2));
        System.out.println(mayorDeDos(num3, num4));
    }
}
