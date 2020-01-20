package ejemploarreglos;

import com.gm.dominio.arreglos.Persona;

public class EjemploArreglos {

    public static void main(String[] args) {
        // 1. Declaramos un arreglo de enteros 
        int edades[];
        // 2. Instaciamos el arreglo de enteros 
        edades = new int[3];
        //3. Inicializamos los valores del arreglo enteros

        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //Imprimimos los valores a la salida Standar
        //4. leemos los valores de cada elemento del arreglo 
        System.out.println("Arreglo de enteros indice [0]:  " + edades[0]);
        System.out.println("Arreglo de enteros indice [1]:  " + edades[1]);
        System.out.println("Arreglo de enteros indice [2]:  " + edades[2]);

        // Ejemplos tipo -obj
        //1. Declaramos Arreglo de objeto persona  
        Persona personas[];
        //2.Instanciamos el arreglo de String  
        personas = new Persona[4];
        //3. Inicializamos los valores del arreglo de enteros 
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        personas[2] = new Persona("Pedro");

        //Imprimimos los valores a la salida estandar
        //4. leemos los valores de cada elemento  del arreglo 
        System.out.println("");
        System.out.println("Arreglo persona indice [0]:  " + personas[0]);
        System.out.println("Arreglo persona indice [1]:  " + personas[1]);
        System.out.println("Arreglo persona indice [2]:  " + personas[2]);

        //1. Arreglo de String , notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        //Imprimimos valores a la salida standar 
        //2. Iteramos el arreglo String  cin un for

        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice  " + i + ":  " + nombres[i]);

        }

    }

}
