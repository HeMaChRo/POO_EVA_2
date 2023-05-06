/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jesus", "De la cruz", 18, "011235813");
        //estudiante.imprimirDatos();
        
        Docentes docente = new Docentes("Jose", "Perez", 52, "Medio Tiempo");
        //docente.imprimirDatos();
        
        //Ocultamos las diferencias
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona2 = estudiante;
        persona2.imprimirDatos();
        
        
        //No se puede hacer la conversion de superclase a subclase
        //En este caso no existe la plaza                           
        Persona persona3 = new Persona();
        Docentes doce = persona3;
    }
    
    
}
