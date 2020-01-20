
package ejemploherencia;

public class Persona { //Definimos la clase padre 
   
    private String  nombre;
    private char genero;
    private int edad;
    private String direccion ;
    
    //Constructor vacio
    public Persona(){}
    
    //Constructor con 1 Argumento 
    public Persona(String nombre){
        this.nombre = nombre;
        
       
    }
    
    //Constructor con todos los argumentos copletos 
    public Persona(String nombre, char genero, int edad, String direccion){
         
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        
    }
    
    //mediante getters y setter volvemos todos los argumentos publicos para 
    //poder usar  y modicar en las clases hijas 


  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "Persona { "+" , nombre =  "  +nombre+ " , genero = " +genero +" ,"
                + " edad =  " + edad + " , direccion=" +direccion + '}';
             
    }
}
