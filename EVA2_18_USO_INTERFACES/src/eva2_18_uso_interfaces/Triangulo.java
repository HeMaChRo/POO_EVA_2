
package eva2_18_uso_interfaces;


public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 10;
        this.altura = 5;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip = Math.sqrt((base*base)+(altura*altura));
        return base + altura + hip;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("\nBase: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPeri());
    }
    
}
