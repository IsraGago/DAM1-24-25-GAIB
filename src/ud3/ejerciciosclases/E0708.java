package ud3.ejerciciosclases;

// import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E0708 {
    public static void main(String[] args) {

        Sintonizador miRadio = new Sintonizador(108);
        miRadio.display();
        miRadio.guardarEmisora1();
        miRadio.up();
        miRadio.display();
        miRadio.irEmisora1();
    }
    @Test
    public void testSintonizador(){
        // assertEquals(null, null);
    }
}
