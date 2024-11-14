package ud2.ejerciciosrecursividad;

public class NumDigitos {
    static int numDigitos(int numero){
        if (numero / 10 == 0) {
            return 1;
        } 
        return  1 + numDigitos(Math.abs(numero)/10);
    }
    public static void main(String[] args) {
        System.out.println(numDigitos(7));
        System.out.println(numDigitos(70));
        System.out.println(numDigitos(700));
        System.out.println(numDigitos(-7000));
    }
}
