/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = "";
    }

    public Bicicleta(String tipo, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = Velocidad + cambio;
        if( vel >= 0){
            Velocidad = vel;
        }
    }

    @Override
    public void tablero() {
        System.out.println("\nBicicleta ");
        System.out.println("Velocidad: " + Velocidad);
    }
    
    
    
}
