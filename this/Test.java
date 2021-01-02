package palabrathis;

public class Test {

    public static void main(String[] args) {
        Alumno a = new Alumno("Rocio");
    }

}

class Alumno {

    String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
        Imprimir i = new Imprimir();
        i.imprimir(this);
    }
}

class Imprimir {

    public void imprimir(Object o) {
        System.out.println("Imprimir parametro: " + o);
        System.out.println("Imprimir objecto actual: " + this);
    }
}
