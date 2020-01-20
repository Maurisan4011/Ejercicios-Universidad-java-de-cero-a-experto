
package VectoresCodoACodo;

import java.util.Scanner;


public class VectoresAyB {

    public static void main(String[] args) {
        int VectorA [] = new int [45];
        int VectorB [] = new int [45];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los valores o numeros  :");
        
        for (int i = 0; i < VectorA.length; i++) {
            
            System.out.println("Valor :" +(i+1)+ " : ");
             VectorA [i]= sc.nextInt();
            
        }
         for (int i = 0; i < VectorB.length; i++) {
            
            System.out.println("Valor :" +(i+1)+ " : ");
             VectorB [i]= sc.nextInt();
            
        }
        
        System.out.println("los valores ingresados son :");
         for (int i = 45; i >= 0; i--) {
             System.out.println("Valor :" +(i+1)+ " : " + VectorA[i]);
            
        }
    }
       
    }
    

