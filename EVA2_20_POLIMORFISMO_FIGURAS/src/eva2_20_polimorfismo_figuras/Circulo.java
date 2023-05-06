
package eva2_20_polimorfismo_figuras;


public class Circulo implements Figuras, MostrarDatos{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nRadio: "+radio);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPeri());
    }
    
    
    
}
