
public class FiguraGeometrica {

    //Atributos de la Clase
    private String nombreFigura;
    //private String colorFigura;
    private int alto;

    //Metodos Getters y Setters
    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    //Metodo para mostrar la Figura
    public void mostrarFigura() {
        switch (nombreFigura) {
            case "cuadrado" ->
                dibujarCuadrado(alto);
            case "triangulo" ->
                dibujarTriangulo(alto);
            default ->
                System.out.println("Error: seleccione cuadrado o triangulo");
        }
    }

    //Metodos privados que dibujan la figura
    private void dibujarCuadrado(int alto) {
        int alto2 = alto;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < alto2; j++) {
                if ((i > 0 && i < alto - 1) && (j > 0 && j < alto2 - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private void dibujarTriangulo(int alto) {
        int mitad = alto / 2;
        int fila = mitad + 1;

        int rest = 0;
        int suma = 0;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < alto; j++) {
                if (j < mitad - rest) {
                    System.out.print(" ");
                } else if (j > mitad + suma) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            rest++;
            suma++;
            if (suma == fila && alto % 2 == 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
