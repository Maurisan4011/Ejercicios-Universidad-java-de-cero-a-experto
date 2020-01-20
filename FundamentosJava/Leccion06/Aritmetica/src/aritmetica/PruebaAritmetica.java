
package aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Aritmetica
        
        Aritmetica ari = new Aritmetica();
        
        //Llamamos el metodo sumar y recibimos el valor devuelto
        
        int resultado = ari.sumar(5,3);
        
        System.out.println("El resultado de la suma es: " +resultado);
    }
    
}
