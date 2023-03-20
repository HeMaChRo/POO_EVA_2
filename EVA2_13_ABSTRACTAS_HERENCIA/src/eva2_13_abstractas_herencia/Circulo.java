
package eva2_13_abstractas_herencia;

public class Circulo extends Figuras{
    private double radio;

    public Circulo() {
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        
    @Override
    public double calcularArea(){        
        return Math.PI * (radio*radio);        
    }
    
    @Override
    public double calcularPerimetro(){        
        return Math.PI * (radio*2);        
    }
    
    @Override
    public String toString(){
        String cadena = "Datos: \n" + "Radio: " + radio;
        return cadena;    
    }   
    
}
