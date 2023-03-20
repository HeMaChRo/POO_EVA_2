
package eva2_13_abstractas_herencia;


public class Triangulo extends Figuras{
    
    private double base;
    private double altura;

    public Triangulo() {
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
    public double calcularArea(){        
        return (base * altura)/2;     
    }
    
    @Override
    public double calcularPerimetro(){        
        double hip = Math.sqrt(base)+ Math.sqrt(altura);
        return base + altura + hip;        
    }
    
    @Override
    public String toString(){
        String cadena = "Datos: \n" + "Base: " + base + "\nAltura: " + altura;
        return cadena;    
    }   
    
}
