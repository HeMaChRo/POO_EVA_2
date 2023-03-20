/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_herencia;

/**
 *
 * @author invitado
 */
public class EVA2_5_HERENCIA {
    
    public static void main(String[] args) {
        SubClase obj = new SubClase();
        obj.mensaje();
    }
    
    
}

 class SuperClase{
     public void mensaje(){
         System.out.println("Hola");
     }
 }

class SubClase extends SuperClase{

}
