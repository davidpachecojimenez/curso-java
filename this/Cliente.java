package palabrathis;

public class Cliente {

    private String nombre;
    private String apellido;
    private int edad;

    public void insertarDatos(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " - Apellido: " + apellido + " - Edad: " + edad);
    }

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.insertarDatos("Maria", "Lizardo", 25);
        c.mostrarDatos();

    }

}
