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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Usaremos un JOptionPane para introducir dos datos
        int dato1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero"));
        int dato2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo numero"));

        if (dato1 == dato2) {
            System.out.println(dato1 + " es igual a " + dato2);
        } else {
            System.out.println(dato1 + " es diferente de " + dato2);
            if (dato1 > dato2) {
                System.out.println(dato1 + " es mayor de " + dato2);
            } else {
                System.out.println(dato1 + " es menor de " + dato2);
            }

        }

        //if else anidado manera, uso simplificado
        int mes = 9;
        String estacion;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);

        int edad = 65;
        int genero = 1;
        if ((genero == 4) | (++edad >= 90)) {
            System.out.println("exclusivo");

        }
        System.out.println(edad);

    }

}
