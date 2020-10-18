package memoriaStack_Heap;

public class TestMemoriaJava {

    //Variables globales
    int n1 = 10;
    String nombre = "David";

    public static void main(String[] args) {
        //Variable primitivo entero
        int n2 = 15;
        //Se crea una instancia de TestMemoriaJava
        TestMemoriaJava objeto = new TestMemoriaJava();
        //Se crea una variable entera
        int suma = objeto.sumar(n2);
        //Crear un array de enteros
        int[] arrayTest = new int[2];
        arrayTest[0] = 20;
        arrayTest[1] = 289;
        //Se crea una instancia Object
        Object dato = new Object();
        System.out.println("Promedio: " + suma);
    }

    public int sumar(int n2) {
        this.nombre = "null";
        return this.n1 + n2;
    }
}
