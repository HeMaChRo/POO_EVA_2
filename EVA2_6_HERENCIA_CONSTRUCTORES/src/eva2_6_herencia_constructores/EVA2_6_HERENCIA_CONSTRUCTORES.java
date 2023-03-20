package eva2_6_herencia_constructores;

public class EVA2_6_HERENCIA_CONSTRUCTORES {

    public static void main(String[] args) {
        System.out.println("Clase Animal");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        
        System.out.println("\nClase Mamifero");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.respirar();
        mamifero.tenerPelo();
    }
    
}
