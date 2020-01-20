
package sobrecargametodos;

public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println(" Resulado sumar solo un metodo(int,int): "+ Operaciones.sumar(3,4));
        
        System.out.println("Resulado sumar double double : " + Operaciones.sumar(2.2,6.8));
        
        System.out.println("Resulado sumar (int, double ) : " + Operaciones.sumar(5,4.1));
    
         System.out.println("Resultado  sumar (double, int): " +Operaciones.sumar(7.1, 3));
        
         System.out.println("Metodo sumar (double, int)"+ Operaciones.sumar(3, 1L));
         
          System.out.println("Metodo sumar (double, int)"+ Operaciones.sumar(3F, 'A'));
    }
    
}
