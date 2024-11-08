package ud2.funciones;
// Para que una funcion sea visible desde otro paquete tien que ser "public"

import ud2.Util;

public class LlamadasUtil {
    public static void main(String[] args) {
        Util.esPar(2);
        boolean esHoraCorrecta = Util.esHoraCorrecta(59, 59, 24);
        System.out.println(esHoraCorrecta);
    }
}
