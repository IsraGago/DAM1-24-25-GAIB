package ud3.ejerciciosclases;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) throws Exception {
        boolean esHoraCorrecta = horas < 24 && horas >= 0 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60 ;
        if (esHoraCorrecta) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
         else {
            throw new Exception("ERROR: parámetros incorrectos");
        }
    }

    public void incrementarSegundo(){
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                horas++;
                if (horas >= 24) {
                    horas = 0;
                }
            }
        }
    }

    public void mostrar(){
        System.out.printf("%d:%d:%d%n",horas,minutos,segundos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
