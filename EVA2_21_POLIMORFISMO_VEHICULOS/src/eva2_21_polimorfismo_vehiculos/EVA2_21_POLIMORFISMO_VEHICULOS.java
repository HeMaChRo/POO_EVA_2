
package eva2_21_polimorfismo_vehiculos;

public class EVA2_21_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        
       Automovil auto1 = new Automovil("Silverado", 1997, "Chevrolet", 0);
      /*auto1.tablero();
       auto1.cambiarVelocidad(50);
       auto1.tablero();*/
       
       modificarVel(auto1, 50);
       
       Bicicleta bici1 = new Bicicleta("Montaña", "Apache", 0);   
       /*bici1.tablero();
       bici1.cambiarVelocidad(20);
       bici1.tablero();*/
       
        modificarVel(bici1, 10);
    }
    
    public static void modificarVel(ControlarDatos datos, int velocidad){
        datos.cambiarVelocidad(velocidad);
        datos.tablero();
        
    
    }
    
}
