
package eva2_16_interfaces;


public class EVA2_16_INTERFACES {

    public static void main(String[] args) {
        //MostrarDatos obj = new MostrarDatos(); no se puede instanciar una interfaz
        
        Persona perso1 = new Persona("Juan Pérez", 50);
        perso1.imprimirDatos();
        
        Computadora compu = new Computadora("Lenovo", "i7", 25000, "Lenovo Legion");
        compu.imprimirDatos();
    }
    
}
