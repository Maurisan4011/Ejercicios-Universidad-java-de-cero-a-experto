package ciclos;

import java.util.Scanner;

public class CicloWhileV2 {

    public static void main(String[] args) {
        System.out.println("Por favor introduce el numero de  elmentos a iterar");
        int maxElementos;
        Scanner sc = new Scanner(System.in);//Creacion de objeto para leer datos 
        maxElementos = sc.nextInt();// Leeemos el valor proporcionado por el usuario
        int contador = 0; // Inicializamos el contador
        while (contador < maxElementos) {
            System.out.println("contador = " + contador);
            contador++;
        }

    }

}
