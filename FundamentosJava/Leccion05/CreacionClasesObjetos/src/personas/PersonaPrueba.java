
package personas;

public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        //Llamado a un metodo del objeto creado
        System.out.println("Valosres por default del objeto Persona");
        p1.desplegarNombre();
        
        //Modificar valores p1
        p1.nombre ="Juan";
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        //Volvemos a llamar al metodo para imprimir p1
        System.out.println("\nNuevos valores del objeto Persona p1");
        p1.desplegarNombre();
        
        // Modificar valores p2
        p2.nombre ="Mauricio";
        p2.apellidoPaterno = "Sanchez";
        p2.apellidoMaterno = "Sanchez";
        
        //Volvemos a llamar al metodo para imprimir p1
        System.out.println("\nNuevos valores del objeto Persona p2");
        p2.desplegarNombre();
        
        
    }
    
}
