
package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        
        Persona perso2 = new Persona("José", 20);
        
        System.out.println(perso1);
        System.out.println(perso2);
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "";
        this.edad = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        String cadena = "Datos: \n" + "Nombre: " + nombre + "\nEdad: " + edad;
        return cadena;    
    }
    
}
