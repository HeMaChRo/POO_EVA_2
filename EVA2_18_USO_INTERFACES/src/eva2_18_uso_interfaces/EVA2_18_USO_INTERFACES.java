
package eva2_18_uso_interfaces;

public class EVA2_18_USO_INTERFACES {

    public static void main(String[] args) {
        //Figuras figu = new Figuras(); no se puede
        //MostrarDatos mostrar = new MostrarDatos(); no se puede
        
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(50);
        circulo1.imprimirDatos();
        
        Triangulo triangulo1 = new Triangulo(20, 20);
        triangulo1.imprimirDatos();
    }
    
}
