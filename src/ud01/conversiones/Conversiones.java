package ud01.conversiones;

public class Conversiones {
    public static void main(String[] args) {
        short s = 5;
        int i = s;
        long l = i;
        float f = l;
        double d = f ;
        d += 2000000.5;
        s = (short) d;
        System.out.println(d);
        System.out.println(s);

        int a = 5;
        int b = 2;
        double resultado = (double) a / b;
        System.out.println(resultado);

        int num = 65; // Puedes usa entre 65 y 90 o 97 y 122
        char letra = (char) num; // El 65 es el codigo ASCII de la letra A
        letra++;
        System.out.println(letra);

        boolean mayuscula = letra >= 'A' && letra <='Z';
        System.out.println(letra+" es mayuscula "+mayuscula);
        System.out.println("En minusculas sería: "+ (char)(letra+32));
        
    }
}
