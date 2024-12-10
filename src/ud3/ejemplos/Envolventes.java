package ud3.ejemplos;

public class Envolventes {
    public static void main(String[] args) {
        int k = 23;
        // Integer numero = new Integer(k); // obsoleto
        Integer entero = k; // se crea el objeto y se le asigna el valor
        
        String cadena = "4.21";
        Float objetoFloat = Float.valueOf(cadena); // objeto Float cogiendo el valor de una String

        // float floatPrimitivo = objetoFloat.floatValue(); // obsoleto
        float floatPrimitivo = objetoFloat;

        String s1 ="25",s2 = "92.2";
        int n = Integer.parseInt(s1); // tipo primitivo int cogiendo el valor de un objeto Integer
        double d = Double.parseDouble(s2);

        int decimalABinario = Integer.parseInt("101",2);

        System.out.println(entero);
        System.out.println(floatPrimitivo);
        System.out.println(n);
        System.out.println(d);
        System.out.println(decimalABinario);

    }
}
