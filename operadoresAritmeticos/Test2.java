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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializamos las variables
        int a = 0;
        int b = 0;
        
        //Operador de Incremento
        //postincremento, primero asigna luego incrementa
        System.out.println("Potsincremento: "+(a++));
        System.out.println("Resultado del postincremento: "+a);
        System.out.println();
        
        //preincremento, primero incrementa luego asigna
        System.out.println("Resultado del preincremento: "+(++b));
        System.out.println();
        
        //Operador de Decremento
        //Modificamos las variables
        a = 6;
        b = 4;
        //Postdecremento, primero asigna luego decrementa
        System.out.println("Potsdecremento: "+(a--));
        System.out.println("Resultado del postdecremento: "+a);
        System.out.println();
        
        //Predecremento
        System.out.println("Resultado del predecremento: "+(--b));
        System.out.println();
    }
    
}
