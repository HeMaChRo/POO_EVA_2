package eva2_2_herencia;

public class Docente {
    private String nombre;
    private String apellido;
    private String plaza;
    private int edad;

    public Docente() {
    }

    public Docente(String nombre, String apellido, String plaza, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.plaza = plaza;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
