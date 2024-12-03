package ud3.ejerciciosclases;

public class E0708 {
    public static void main(String[] args) {
        try {
            Sintonizador miRadio = new Sintonizador(108);
            miRadio.display();
            miRadio.guardarEmisora1();
            miRadio.up();
            miRadio.display();
            miRadio.irEmisora1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
