
package aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Aritmetica con el constructor vacio 
        Aritmetica obj1  = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        int resultado = obj1.sumar(5,89);
        
        System.out.println("El resultado de la suma directa obj1 es: " +resultado);
   
        //Si llamamos directamente el metodo sumar sin argumentos 
        //el valor es cero, ya que los atributos del objeto se inicializanron
        //ya que no se uso el contructor con argumentos, sino el constructor vacio
        System.out.println("Resultados suma atributos obj1:  "  + obj1.sumar());
        
        //ahora creamos un objeto con el contructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(898, 1);
        
        //Imprimimps directamente el resultado.
        //Al llamar directamente al metodo suma, nos regresa el vañpr de la suma 
        System.out.println("\nResultado suma atributos:  " + obj2.sumar());
    }
    
}
