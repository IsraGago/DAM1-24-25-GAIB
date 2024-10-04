package ud01.identificadores;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte valorByte = 127;
        short valorShort= 32767;
        int valorInt=2147483647;
        long valorLong=9223372036854775807L;
        float valorFloat=345.55f;
        double valorDouble=423345.777777;
        char valorChar='i';
        boolean valorBoolean=true;
        String valorString="DAM 1";



        System.out.println("Tipo    NumBits    Valor");
        System.out.println("------------------------");
        System.out.println("byte      8          "+valorByte);
        System.out.println("short     16         "+valorShort);
        System.out.println("int       32         "+valorInt);
        System.out.println("long      64         "+valorLong);
        System.out.println("float     32         "+valorFloat);
        System.out.println("double    64         "+valorDouble);
        System.out.println("char      16         "+valorChar);
        System.out.println("boolean   1          "+valorBoolean);
        System.out.println("string    ?          "+valorString);

       
    }
}
