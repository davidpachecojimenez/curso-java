/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author TDAVI
 */
public class Test {
    
    int numero1;
    int numero2;

    void mostrarMensaje() {
        System.out.println("Saludo");
    }
    
    private void leerDatos(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
    }

    //Metodo sumar del tipo void
    void sumar() {
        leerDatos();
        int sumar = numero1 + numero2;
        System.out.println(sumar);
    }

    //Metodo sumar del tipo void con parametro
    void sumar(int n1, int n2) {
        int sumar = n1 + n2;
        System.out.println(sumar);
    }

    //Metodo sumar del tipo entero sin parametros
    int sumarNumero() {
        leerDatos();
        int sumar = numero1 + numero2;
        return sumar;
    }
    
    //Metodo sumar del tipo entero con parametros
    int sumarNumero(int n1, int n2) {
        int sumar = n1 + n2;
        return sumar;
    }
}
