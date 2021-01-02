package palabrathis;

public class Producto {

    private static long id;
    private String descripcion;
    private double precio;

    public Producto() {
        id += 1;
    }

    public Producto(String descripcion, double precio) {
        this();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id + " - Descripcion: " + descripcion + " - Precio: " + precio);
    }

    public static void main(String[] args) {

        Producto p = new Producto("Leche", 12.3);
        p.mostrarDatos();

        Producto p2 = new Producto("Arroz", 10.3);
        p2.mostrarDatos();

        Producto p3 = new Producto("Avena", 6.25);
        p3.mostrarDatos();

        Producto p4 = new Producto("Cereal", 8.2);
        p4.mostrarDatos();

    }

}
