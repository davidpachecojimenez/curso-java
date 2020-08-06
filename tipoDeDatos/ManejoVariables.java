/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoDeDatos;

/**
 *
 * @author David
 */
public class ManejoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplos de variables de tipo Primitivos en JAVA
        //El operador = asigna el valor de derecha a izquierda

        //TIPOS NO NUMERICOS: boolean y char*
        //Declarar variables: tipoDato nombreVariable;
        //Declarar variable
        boolean bool1;
        //Inicializar Variables: nombreVariable = valor;
        //Inicializar variable bool1 (Por defecto se inicializa en false)
        bool1 = true;
        //Declarar variables e Inicializar: tipoDato nombreVariable = valor;
        //Declarar e inicializarboolean una variable
        boolean bool2 = false;
        //Mostrar valor de las variables boolean
        System.out.println("Valor de boolean 1: " + bool1);
        System.out.println("Valor de boolean 2: " + bool2);
        System.out.println();

        //variable char, almacena 16 bits de memoria
        char vocal = 'A';
        char numero = 97;
        System.out.println("Variable char vocal: " + vocal);
        System.out.println("Variable char numero: " + numero);
        System.out.println();

        //TIPOS NUMERICOS: Variables enteros*
        //Variable entera, almacena 32 bits en memoria
        int decimal = 25;
        int octa = 031; //Inicia con 0
        int hexa = 0x19; //Inicia con 0x
        System.out.println("Variable entera decimal: " + decimal);
        System.out.println("Variable entera octal: " + octa);
        System.out.println("Variable entera hexadecimal: " + hexa);
        System.out.println();

        //variable byte, almacena 8 bits en memoria
        byte bit1 = 6;
        byte bit2 = 0x6;
        System.out.println("Variable byte 1: " + bit1);
        System.out.println("Variable byte 2: " + bit2);
        System.out.println();

        //Variable short, almacena 16 bits de memoria
        short dia = 16;
        System.out.println("Variable short: " + dia);
        System.out.println();

        //Variable long, almacena 64 bits de memoria
        long num1 = 54;
        long num2 = 54L;
        System.out.println("Variable long 1: " + num1);
        System.out.println("Variable long 2: " + num2);
        System.out.println();

        //TIPOS FLOTANTES*
        //Variable float, almacena 32 bits de memoria
        float temperatura1 = 35.0F;
        float temperatura2 = 35;
        System.out.println("Variable float 1: " + temperatura1);
        System.out.println("Variable float 2: " + temperatura2);
        System.out.println();

        //Variable double, almacena 64 bits de memoria
        double precio1 = 14.90;
        double precio2 = 14.9D;
        System.out.println("Variable double 1: " + precio1);
        System.out.println("Variable double 2: " + precio2);
  

    }

}
