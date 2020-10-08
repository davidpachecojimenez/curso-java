/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TDAVI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        figuraGeometrica.setNombreFigura("cuadrado");
        figuraGeometrica.setAlto(4);
        figuraGeometrica.mostrarFigura();
        
        FiguraGeometrica figuraGeometrica2 = new FiguraGeometrica();
        figuraGeometrica2.setNombreFigura("triangulo");
        figuraGeometrica2.setAlto(11);
        figuraGeometrica2.mostrarFigura();
    }
    
}
