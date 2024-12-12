package ud3.ejerciciospropuestos;

public class MarcaPagina {
    private int pagina;
    // String libro;

    MarcaPagina(int pagina) {
        this.pagina = pagina;
    }
    public int getPagina(){
        return pagina;
    }

    public void volverAEmpezar() {
        pagina = 0;
    }

    public void incrementarPagina() {
        pagina++;
    }

    public int paginaAnterior() {
        return pagina - 1;
    }

}
