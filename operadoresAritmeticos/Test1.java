/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresAritmeticos;

/**
 *
 * @author David
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializamos las variables enteras
        //Los operadores aritmeticos evaluan de izquierda a derecha
        int a = 6; 
        int b = 10; 
        int c = 4; 
        int d = 8;
        int resultado = 0;
        
        //Hacemos una operación de sumas y restas
        //Primero resuelve la resta del parentesis
        resultado = a + d - (b - c);
        //Mostrar el resultado
        System.out.println("6 + 8 - (10 - 4) = "+resultado);
        System.out.println();
        //Volvemos el resultado a 0
        resultado = 0;
        
        //Ahora usamos la multiplicación y división
        resultado = a + d * b/c - (d- c);
        System.out.println("6 + 8 * 10/4 - (8 - 4) = "+resultado);
        System.out.println();
        //Volvemos el resultado a 0
        resultado = 0;
        
        //Ahora usamos todo los operadores aritméticos
        resultado = (a * d + (b - c)/a) % b;
        System.out.println("(6 * 8 + (10 - 4)/6) % 10 = "+resultado);
        System.out.println();
              

    }
    
}
