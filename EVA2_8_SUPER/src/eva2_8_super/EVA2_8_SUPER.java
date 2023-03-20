package eva2_8_super;

public class EVA2_8_SUPER {
    
    public static void main(String[] args) {
        Animal animal1 = new Animal(50);
        Mamifero mamifero1 = new Mamifero("Cafe", 12);
        Perros perro1 = new Perros();
        //perro1.
    }
    
}

class Animal {

    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Animal() {
        System.out.println("Animal: Its alive!!");
    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("Animal: Its alive!! Constructor 2 ");
    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }

    public void comer() {
        System.out.println("Estoy comiendo");
    }

}

class Mamifero extends Animal {
    private String colorPelo;
    
    public Mamifero() {
        super();
        System.out.println("Soy un mamifero");
    }

    public Mamifero(String colorPelo, int peso) {
        super(peso);
        System.out.println("Soy un mamifero Constructor 2");
        this.colorPelo = colorPelo;
    }

    

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}

class Perros extends Mamifero{

    public Perros() {
        super();
        System.out.println("Soy Genar y soy un perro");
    }
    
    
}
