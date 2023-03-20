
package eva2_4_formato_apa;


public class SitioWeb extends Documento{
    private String url;
    private String nombreSitio;

    public SitioWeb(String url, String nombreSitio) {
        this.url = url;
        this.nombreSitio = nombreSitio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }
    
    
    
}
