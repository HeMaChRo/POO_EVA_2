
package eva2_4_formato_apa;

public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("AR Editorial", 3);
        libro1.setAutor("Marissa Meyer");
        libro1.setTitulo("SuperNova");
        libro1.setAño(2018);
        libro1.setMes("Abril");
        libro1.setDia(18);
        libro1.setCiudad("México");
        
        Articulo articulo1 = new Articulo("Heraldo", 17);
        articulo1.setAutor("Pedro Perez");
        articulo1.setTitulo("Al estrellato");
        articulo1.setAño(2020);
        articulo1.setMes("Diciembre");
        articulo1.setDia(2);
        articulo1.setCiudad("Chihuahua");
        
        Informe informe1 = new Informe("Cientifico", "Uanl");
        informe1.setAutor("Maria");
        informe1.setTitulo("Los hongos");
        informe1.setAño(2023);
        informe1.setMes("Febrero");
        informe1.setDia(21);
        informe1.setCiudad("Monterrey");
        
        SitioWeb sitio1 = new SitioWeb("https://github.com", "GitHub");
        sitio1.setAutor("Chris Wanstrath");
        sitio1.setTitulo("Discover projects");
        sitio1.setAño(2008);
        sitio1.setMes("Noviembre");
        sitio1.setDia(20);
        sitio1.setCiudad("San Francisco");
    }
    
}
