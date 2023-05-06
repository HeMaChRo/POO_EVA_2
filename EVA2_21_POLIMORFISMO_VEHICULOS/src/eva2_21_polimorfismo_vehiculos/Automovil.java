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
public class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "";
        this.año = 0;
    }

    public Automovil(String modelo, int año, String Marca, int Velocidad) {
        super(Marca, Velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
        System.out.println("\nAutomovil");
        System.out.println("Velocidad: "+Velocidad);
        System.out.println("Combustible: (Pendiente)");
        System.out.println("Revoluciones: (Pendiente)");
    }
    
        
}
