
public class Persona {

    private int codPersona;
    private String nombrePersona;
    private String direccion;
    //los atributos de la clase...

    

    //Muestra el nombre y apellido
    public void mostrarNombre() {
        System.out.println("Mi nombre es: " + nombrePersona);
        
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
