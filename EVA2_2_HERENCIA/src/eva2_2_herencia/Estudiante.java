package eva2_2_herencia;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String numControl;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String numControl, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numControl = numControl;
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

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
