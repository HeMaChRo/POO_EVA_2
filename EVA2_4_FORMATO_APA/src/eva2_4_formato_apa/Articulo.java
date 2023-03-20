
package eva2_4_formato_apa;

public class Articulo extends Documento {
    private String tituloPeriodico;
    private int pagina;

    public Articulo(String tituloPeriodico, int pagina) {
        this.tituloPeriodico = tituloPeriodico;
        this.pagina = pagina;
    }   
    

    public String getTituloPeriodico() {
        return tituloPeriodico;
    }

    public void setTituloPeriodico(String tituloPeriodico) {
        this.tituloPeriodico = tituloPeriodico;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
    
    
    
}
