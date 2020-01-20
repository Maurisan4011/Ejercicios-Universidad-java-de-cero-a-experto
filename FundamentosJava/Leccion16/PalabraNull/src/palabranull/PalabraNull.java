package palabranull;

public class PalabraNull {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println("Nombre p1:  " + p1.obtenerNombre());

        Persona p2 = p1;// p2 apunta al mismo objeto p1
        System.out.println("Nombre p2:  " + p2.obtenerNombre());

        //Hacemos que p1 ya no apunte al  objeto p1
        p1 = null;

        //Comprobamos que p2 sigue accediendo al  objeto 
        System.out.println("Nombre p2:  " + p2.obtenerNombre());

        //La siguiente linea marca error de tipo NullPoinException
        //System.out.println("Nombre p1:  " + p1.obtenerNombre());
        //Solo en caso de que no se nulo podemos utilizar este metodo en esta variable 
        if (p1 != null) {
            System.out.println("Nombre p1:  " + p1.obtenerNombre());

        }

    }

}

class Persona {

    String nombre; // valor por default es null

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre; // uso opcional
    }
 
}
