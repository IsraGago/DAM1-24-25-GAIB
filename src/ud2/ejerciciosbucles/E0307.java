package ud2.ejerciciosbucles;

public class E0307 {
    public static void main(String[] args) {
        final int NUM_MULTIPLOS = 7;
        final int MAX = 100;
        for (int i = 0; i < MAX; i++) {
            if (i % NUM_MULTIPLOS == 0) {
                System.out.println(i);
            }
        }
    }
}
