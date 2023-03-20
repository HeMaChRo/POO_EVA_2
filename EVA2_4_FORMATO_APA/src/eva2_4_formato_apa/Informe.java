
package eva2_4_formato_apa;

public class Informe extends Documento{
    private String tipoInforme;
    private String institucion;

    public Informe(String tipoInforme, String institucion) {
        this.tipoInforme = tipoInforme;
        this.institucion = institucion;
    }

    public String getTipoInforme() {
        return tipoInforme;
    }

    public void setTipoInforme(String tipoInforme) {
        this.tipoInforme = tipoInforme;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    
    
}
