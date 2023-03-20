
package eva2_11_figuras;

public class EVA2_11_FIGURAS {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(50);
        System.out.println(circulo1);
        System.out.println("Area: "+circulo1.calcularArea());
        System.out.println("Perimetro: "+circulo1.calcularPerimetro());
        
        Triangulo triangulo1 = new Triangulo(10, 22);
        System.out.println("\n"+triangulo1);
        System.out.println("Area: "+triangulo1.calcularArea());
        System.out.println("Perimetro: "+triangulo1.calcularPerimetro());
    }
    
}
