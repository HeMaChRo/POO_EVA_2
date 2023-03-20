package eva2_3_extends;

public class EVA2_3_EXTENDS {
    
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Juan");
        estu1.setApellido("Perez");
        estu1.setEdad(50);
        estu1.setNoControl(00112255);
        
        System.out.println(estu1.getNombre());
        System.out.println(estu1.getApellido());
        System.out.println(estu1.getEdad());
        System.out.println(estu1.getNoControl());
        
        Docentes docente1 = new Docentes();
        docente1.setNombre("Jose");
        docente1.setApellido("Ramirez");
        docente1.setEdad(30);
        docente1.setPlaza("");
        
        
    
    }
       
}

    class Persona{
        private String nombre;
        private String apellido;
        private int edad;

        public Persona(){
        }

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}


