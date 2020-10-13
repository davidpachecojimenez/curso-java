
package constructores;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    //Constructor vacio
    public Persona() {

    }

    //constructor con argumentos
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //constructor con argumentos
    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        this.edad = edad;
    }
    public Persona(String nombre, int edad, String apellido) {
        this(nombre, apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
