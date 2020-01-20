package sobrecargaconstructores;

public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    //Constructor sin argumentos y privado
    //Asigna el idPersona
    private Persona() {
        //Contructor vacio predefiniendo contador  id persona 
        this.idPersona = ++contadorPersonas;
    }
    
    //Constructos completo sobrecargado
    public Persona(String nombre, int edad) {
        //Se manda a llamar al constructor vacio para que asigne el id persona 
        this(); //invocamos al constructor vacio con todos sus atributos 
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona {" + "idPersona=  " + idPersona + " , nombre= " + nombre
                + " , edad= " + edad+ '}';

    }

}
