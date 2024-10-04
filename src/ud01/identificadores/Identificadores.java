package ud01.identificadores;

public class Identificadores {
    public static void main(String[] args) {
        final int NUMERO_ALUMNOS = 33; //final para que sea una constante. SNAKE_CASE
        int numeroDeTelefono=622095700; //camelCase
        
        double $totalVentas=576.55; // con $ para comprobar que si lo admite aunque siga la nomenclatura -> totalVentas
        String mi_nombre="Israel Benjamín Gago Acuña"; //con _ en medio para comprobar que lo admite aunque siga la nomenclatura -> miNombre
        boolean estaLloviendo=false;
        char letraPreferida='B';
        byte edad =0x0A ; //0x para que java entienda que es hexadecimal

        float monedero= 55.22f; // "f" para que java interprete que es un float, sino da error porque piensa que es double
        long numEnorme=-99999999999999999L; // lo mismo, para que interprete que es un long y no un int

        System.err.print("Número de teléfono: ");
        System.out.println(numeroDeTelefono);
        System.out.println("Total ventas: "+$totalVentas);
        System.out.println("Me llamo: "+mi_nombre);
        if(estaLloviendo){
            System.out.println("Está lloviendo");
        }
        else{
            System.out.println("No está lloviendo");
        }
        System.out.println("Mi letra preferida es: " + letraPreferida);
        System.out.println("Monedero: "+monedero);
        System.out.println("Numero enorme: "+numEnorme);
        System.out.println("Mi edad es:" + edad);
        System.out.println("El número total de alumnos es:"+ NUMERO_ALUMNOS);

        
    }
}