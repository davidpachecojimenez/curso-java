/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaWhile;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        //Variable entera
        int numeroMaximo = 0;
        //while (condicion a utilizar)
        while (numeroMaximo <= 20) {
            //Muetras el valor de la variable 
            //pero en cada vuelta postincrementa
            System.out.println("numero: " + numeroMaximo++);
        }

        
        
        //La clase Scanner para ingresar datos
        Scanner scan = new Scanner(System.in);
        //Variable String
        String dato = "";
        //While mientras no ingresemos el texto fin 
        //seguira repetiendo el codigo de instrucción
        while (!dato.equalsIgnoreCase("fin")) {
            //Pide que ingrese un texto
            System.out.println("Ingrese un texto: ");
            //Caprtura el texto ingresado en la linea
            dato = scan.nextLine();
            //Imprime el texto ingresado
            System.out.println(dato);
        }
    }

}
