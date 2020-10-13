
package constructores;

/**
 *
 * @author TDAVI
 */
public class TestConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();

        Persona p2 = new Persona("David", "Pacheco");
        //es 
        p2.setNombre("David");
        p2.setApellido("pacheco");

        Persona p3 = new Persona("Maria", "Martinez", 28);
        System.out.println(p3.getNombre() + " " + p3.getApellido() + " " + p3.getEdad());

    }

}
