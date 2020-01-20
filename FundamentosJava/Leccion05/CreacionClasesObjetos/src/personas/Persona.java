package personas;

public class Persona {

    //Atributos de una clase
    //No es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    //Metodos de la clase
    //Los usaran los objetivos de esta clase
    public void desplegarNombre() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido Paterno : " + apellidoPaterno);
        System.out.println("Apellido Materno : " + apellidoMaterno);

    }

}
