
package eva2_21_polimorfismo_vehiculos;

public class Vehiculo {
    private String Marca;
    protected int Velocidad;

    public Vehiculo(){
        this.Marca = "";
        this.Velocidad = 0;
    }

    public Vehiculo(String Marca, int Velocidad) {
        this.Marca = Marca;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    
}
