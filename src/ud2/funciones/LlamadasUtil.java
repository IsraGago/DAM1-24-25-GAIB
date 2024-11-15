package ud2.funciones;
// Para que una funcion sea visible desde otro paquete tien que ser "public"

import ud2.Util;

public class LlamadasUtil {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" - "+Util.numeroAtexto(i));
        }
    }
}
