package aritmetica;

public class Aritmetica {
    
    //Atributos de las clases
    int a ;
    int b;
    
    //Constructor vacio

    public Aritmetica() {
    }
    
    //Contructor con dos argumentos

    public Aritmetica(int obj1, int obj2) {
        a= obj1;
        b=obj2;       
    }
    
    //Este metodo toma nuevos valores 
        int sumar (int a, int b ){
            return  a+b ;
        }
     //Este metodo toma los atributos de la clase 

    int sumar() {
        return a + b;
    }

}
