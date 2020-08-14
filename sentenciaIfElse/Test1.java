/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaIfElse;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usaremos un JOptionPane para introducir dos datos
        int dato1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        int dato2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));

        //Los operadores de igualdad y relación evalúan de izquierda a derecha
        //Usamos el operador ==
        //Si la sentencia es una linea, 
        //no es necesario usar llaves { }
        if (dato1 == dato2) {
            System.out.println(dato1 + " y " + dato2 + " son iguales");
        } else {
            System.out.println(dato1 + " y " + dato2 + " no son iguales");
        }

        //Usamos el operador ! =
        //usar else es opcional se usa cuando se necesita
        if (dato1 != dato2) {
            System.out.println(dato1 + " y " + dato2 + " son diferentes");
        }

        //usamos el operador >
        if (dato1 > dato2) {
            System.out.println(dato1 + " es mayor que " + dato2);
        } else {
            System.out.println("No se cumple la condicion " + dato1 + " > " + dato2);
        }

        //Ejercicios
        System.out.println("\nAhora prueba con los demas operandos");

    }

}
