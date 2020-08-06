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
public class VariablesCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos e inicializamos las cadenas de texto
        String cadena1 = "Dia";
        String cadena2 = "Noche";

        //Probamos con los diferentes caracteres de escape
        System.out.println("Concatenacion: " + cadena1 + cadena2);
        System.out.println("Nueva Linea:\n" + cadena1 + " " + cadena2);
        
        System.out.println("Tabulador:\t" + cadena1 + " " + cadena2);
        System.out.println("Retroceso:\b" + cadena1 + " " + cadena2);
        System.out.println("Retroceso de Carro:\r" + cadena1 + " " + cadena2);
        System.out.println("Comilla Simple: \'" + cadena1 + " " + cadena2 + "\'");
        System.out.println("Comilla Doble: \"" + cadena1 + " " + cadena2 + "\"");
        System.out.println("Insertar una barra invertida:\\\\");
        System.out.println();

        //Algunos metodos de JAVA para Cadenas de Texto
        //Convertir a Mayusculas
        System.out.println(cadena1.toUpperCase());
        System.out.println();
        //Convertir a Minusculas
        System.out.println(cadena2.toLowerCase());
        System.out.println();
        //Comparar dos cadenas, devuelve true o false
        System.out.println(cadena1.equals(cadena2));
        System.out.println();
        //Comparar dos cadenas, sin distinguir entre mayusculas y minusculas
        System.out.println(cadena1.equalsIgnoreCase(cadena2));//Dia
        System.out.println();
        //Reemplazar texto
        System.out.println(cadena1.replace("D", "P"));
        System.out.println();
        //Obtiene tamaño de caracteres de una cadena de texto
        System.out.println(cadena1.length());
        System.out.println();
        //Elimina espacios en blanco del lado derecho e izquierdo
        System.out.println(cadena1.trim()); //dia
        System.out.println();
        //Devuelve true si el tamaño de caracteres es 0
        System.out.println(cadena1.isEmpty());
        System.out.println();
        //Uso de split, nos permite dividir una cadena de caracteres
        //en base a una expresión regular como puede ser una letra, una coma, espacio...
        String dias = "lunes,martes,miercoles,viernes,sabado,domingo\n";
        System.out.println(dias);
        String[] diaArray = dias.split(",");
        for (String dia : diaArray) {
            System.out.println(dia);
        }

    }

}
