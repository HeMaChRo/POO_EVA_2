package eva2_9_super_2;

public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Héctor", "Chavira", 18, "22550355");
        estudiante1.imprimirDatos();
        //System.out.println("Número de control: "+estudiante1.getNoControl());
        
        Docentes docente = new Docentes();
        docente.imprimirDatos();
        //System.out.println("No de plaza: "+docente.getPlaza());
        
    }
    
}
