package ud2.ejerciciosfunciones;

public class E0402 {
    public static void numerosComprendidosEntre(int a, int b){
        if (a == b) {
            System.out.println("Los números son iguales.");
            return;
        }
        int mayor = a > b ? a : b ;
        int menor = a < b ? a : b ;
        for (int i = menor+1; i < mayor; i++) {
            System.out.println(i);
        }
    }   
    public static void main(String[] args) {
        numerosComprendidosEntre(30, 70);
    } 
}
