/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaSwitch;

/**
 *
 * @author David
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sentencia de control switch

        //Variable mes del año del 1 al 12
        int mes = 52;
        //Variable String guarda la estacion
        String estacion;

        //Sentencia switch
        //acepta int, byte, short, char y String
        switch (mes) {
            case 1:
            case 2:
            case 12:
                //Instrucciones
                estacion = "Invierno";
                //Termina la sentencia
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            //default es opcional
            //si ningun case coincide
            //por ejemplo si ingresa 13 como mes
            default:
                estacion = "Mes incorrecto";
                break;
        }
        //Muestra un mensaje con la estacion del mes
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
        //Fin...
    }

}
