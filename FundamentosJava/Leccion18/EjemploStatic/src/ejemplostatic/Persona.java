package ejemplostatic;

public class Persona {

    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public Persona(String nombre) {
        //Cada que creamos un objeto persona incrementamos el contador 
        //Para obtener obtener un nuedo idpersona
        contadorPersonas++;
        //Asignamos el nuevo valor al id persona , que nos servira para el contador
        idPersona = contadorPersonas;
        //Asignamos el nombre recibido 
        this.nombre = nombre;
    }

    public String toString() {
        return "Persona[idPersona : " + idPersona + " , nombre: " + nombre + " ] ";

    }
     public static int getContadosPersona(){
         return contadorPersonas;
     }
}
