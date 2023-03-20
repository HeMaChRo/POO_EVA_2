                             //Superclase
                                //|
package eva2_9_super_2;         //|
                                //v
public class Docentes extends Persona{
    private String Plaza;

    public Docentes() {
        super();
        this.Plaza = "______";
    }

    public Docentes(String nombre, String apellido, int edad, String Plaza) {
        super(nombre, apellido, edad);
        this.Plaza = Plaza;
    }   
        
    public String getPlaza() {
        return Plaza;
    }

    public void setPlaza(String Plaza) {
        this.Plaza = Plaza;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de la Plaza: "+this.Plaza);
    }
    
    
}
