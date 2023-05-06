/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_interfaces_2;

/**
 *
 * @author invitado
 */
public class EVA2_17_INTERFACES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface IntA{
    void A();//equivale a public abstract void A();
}

interface IntB{
    public abstract void B();//equivale a void B();
}

interface IntC extends IntA, IntB{
    public abstract void C();
}

class Prueba implements IntC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
      
    }
}