/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloDoWhile;

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
        
        /*
        //variable entero
        int numeroMaximo = 1;
        //do
        do{
            //Muestra el numero
            //postincrementa numeroMaximo
            System.out.println("Numero: "+numeroMaximo++);
        }while(numeroMaximo <= 20);//while condición a cumplir
        //Fin...
        
        */
        //La clase Scanner para ingresar datos
        Scanner scan = new Scanner(System.in);
        //Variable String
        String dato;
        //do
        do{
            //Pide que ingrese un texto
            System.out.println("Ingrese un texto: ");
            //Caprtura el texto ingresado en la linea
            dato = scan.nextLine();
            //Imprime el texto ingresado
            System.out.println(dato);
        }while(!dato.equalsIgnoreCase("fin"));
        //Fin...
        
    }
    
}
