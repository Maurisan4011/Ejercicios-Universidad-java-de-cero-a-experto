/*
*Derechos reservados Mauride.com.ar
*/


package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de 
 * @author Mauri
 * @version 1.1
 */

public class EjemploJavaDoc {
     
    /**
         * MEtodo que ejecuta la prueba de la clase Aritmetica
         * @param args argumentos de la linea de comando
         */
    public static void main(String[] args) {
        
        int resultado  = new Aritmetica(3,2).sumar();
        
        System.out.println("resultado: " +resultado);
        
    }
    
}
