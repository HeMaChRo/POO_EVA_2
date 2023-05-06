
package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

public class EVA2_20_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        
        /*Circulo circu = new Circulo(5);
        circu.imprimirDatos();
       
              
        //Figura es padre de circulo
        //Podemos asignar un objeto circulo a una variable
       
        Figuras figu = circu;
        System.out.println("\nUsando figuras: \n");
        System.out.println("Área: "+figu.calcularArea());
        System.out.println("Perimetro: "+figu.calcularPeri()); */
       
        /*int[] arreglo = new int[10];//Arreglo que guarda 10 enteros
        
        //Un arreglo inicia 0, ultima posicion N - 1
        //Donde N es la cantidad de elementos del arreglo
        arreglo[0] = 100;
        System.out.println(arreglo[0]);*/
        
        System.out.print("¿Cuántas figuras necesitas? ");
        Scanner leer = new Scanner(System.in);
        int cant = leer.nextInt();
        
        Figuras[] figuras = new Figuras[cant];
        
        for (int i = 0; i < figuras.length ; i++) {
            System.out.print("¿Qué tipo de figuras necesitas? 1.- Circulo  2.- Triangulo: ");
            int tipo = leer.nextInt();
            
            if(tipo == 1){//Circulo
                
                Circulo circu = new Circulo();
                System.out.print("Introduce el radio: ");
                circu.setRadio(leer.nextDouble());
                
                figuras[i] = circu;
            }else{//Triangulo
                
                Triangulo trian = new Triangulo();
                System.out.print("Introduce la base: ");
                trian.setBase(leer.nextDouble());
                
                System.out.print("Introduce la altura: ");
                trian.setAltura(leer.nextDouble());
                
                figuras[i] = trian;
                
            }
        }
        
        //Imprimir resultados
        for (int i = 0; i < figuras.length ; i++) {
            if(figuras[i] instanceof Circulo){
                System.out.println("\nCirculo: " + (i+1));
                
                //Casting: --> Conversión
                
                //int val = (int)(Math.random()*100);
            
                Circulo circu = (Circulo)figuras[i];
                circu.imprimirDatos();
                
            }else{
                System.out.println("\nTriangulo: " + (i+1));
                Triangulo trian = (Triangulo)figuras[i];
                trian.imprimirDatos();
            }
            /*System.out.println("Área: "+ figuras[i].calcularArea());
            System.out.println("Perimetro: "+ figuras[i].calcularPeri());*/
        }
        
        /*Circulo[] circulos = new Circulo[cant];
        
        for (int i = 0; i < cant; i++) {
            circulos[i]= new Circulo();
        }
        
        for (int i = 0; i < cant; i++) {
            circulos[i].imprimirDatos();
        }*/
        
        
        
    }
    
}
