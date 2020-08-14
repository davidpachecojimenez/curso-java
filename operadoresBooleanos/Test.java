/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresBooleanos;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tabla de verdad para el operador AND condicional (&&)
        System.out.println("Tabla de verdad para el operador AND condicional (&&)");
        System.out.println("false && false " + (false && false));
        System.out.println("false && true " + (false && true));
        System.out.println("true && false " + (true && false));
        System.out.println("true && true " + (true && true));
        System.out.println();

        // Tabla de verdad para el operador OR condicional (||)
        System.out.println("Tabla de verdad para el operador OR condicional (||)");
        System.out.println("false || false " + (false || false));
        System.out.println("false || true " + (false || true));
        System.out.println("true || false " + (true || false));
        System.out.println("true || true " + (true || true));
        System.out.println();

        // Tabla de verdad para el operador AND lógico booleano (&)
        System.out.println("Tabla de verdad para el operador AND lógico booleano (&)");
        System.out.println("false & false " + (false & false));
        System.out.println("false & true " + (false & true));
        System.out.println("true & false " + (true & false));
        System.out.println("true & true " + (true & true));
        System.out.println();

        // Tabla de verdad para el operador OR inclusivo lógico booleano (|)
        System.out.println("Tabla de verdad para el operador OR inclusivo lógico booleano (|)");
        System.out.println("false | false " + (false | false));
        System.out.println("false | true " + (false | true));
        System.out.println("true | false " + (true | false));
        System.out.println("true | true " + (true | true));
        System.out.println();

        // Tabla de verdad para el OR exclusivo lógico booleano(^)
        System.out.println("Tabla de verdad para el OR exclusivo lógico booleano (^)");
        System.out.println("false ^ false " + (false ^ false));
        System.out.println("false ^ true " + (false ^ true));
        System.out.println("true ^ false " + (true ^ false));
        System.out.println("true ^ true " + (true ^ true));
        System.out.println();

        //Tabla de verdad para el operador lógico de negación (!)
        System.out.println("Tabla de verdad para el operador lógico de negación (!)");
        System.out.println("!false " + (!false));
        System.out.println("!true " + (!true));

    }

}
