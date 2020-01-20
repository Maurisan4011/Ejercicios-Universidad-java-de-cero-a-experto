
package VectoresCodoACodo;
import java.util.Scanner;

public class VectorDiez {
// //lea un vector de 10 elementos enteros  y luego los imprime en un orden inverso 
    public static void main(String[] args) {
     
        int Vector [] = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los valores o numeros  :");
        
        for (int i = 0; i < Vector.length; i++) {
            
            System.out.println("Valor :" +(i+1)+ " : ");
             Vector [i]= sc.nextInt();
            
        }
        
        System.out.println("los valores ingresados son :");
         for (int i = 9; i >= 0; i--) {
             System.out.println("Valor :" +(i+1)+ " : " + Vector[i]);
            
        }
    }
    
}
