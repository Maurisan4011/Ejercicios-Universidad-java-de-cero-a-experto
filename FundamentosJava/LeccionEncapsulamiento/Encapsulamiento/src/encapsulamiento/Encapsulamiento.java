
package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
      //Creamos el objeto
      Persona p1 = new Persona ("Juan" , "Perez" , false);
      //Accedemos solo al atributo nombre del objeto p1
        System.out.println("Nombre  del objeto p1: " +p1.getNombre() );
        
      // Creamos  el segundo objeto p2
      Persona p2 = new  Persona("Karla", "Gonzales", false);
      //Imprimimos el estado completo de nuestor segundo objeto p2
        System.out.println("Este es el estado del segundo objeto p2: " +p2);
        
      //Marcamos como eliminada a la persona u objeto p2
      p2.setBorrado(true);
      //Imprimir el estado completo del Objeto p2  unsando el metro booleano 
        System.out.println("Este es el estado del segundo objeto p2: " +p2);
        
      //Creamos en tercer objeto p3 pero Vacio!!
      Persona p3 = new Persona();
      System.out.println("Este es el estado del segundo objeto p3 con valores por defecto : " +p3);
              
    }
    
}
