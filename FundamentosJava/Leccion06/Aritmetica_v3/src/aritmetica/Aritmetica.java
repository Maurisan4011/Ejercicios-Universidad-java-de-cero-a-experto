package aritmetica;

public class Aritmetica {

    //Atributos de las clases
    int a;
    int b;

    //Constructor vacio
    //Recordar que si agregamos un constructor distinto al vacio 
    //ya nose crea esste constructor y nosotros debemos crearlo si necesitamos 
    public Aritmetica() {
    }

    //Contructor con dos argumentos
    Aritmetica(int a, int b) {
        //Uso del operador this
        this.a = a;
        this.b = b;
    }

    //Este metodo toma los atributos de la clase para hacer la suma
    int sumar() {
        return a + b;
    }

    //Metodo restar
    int restar() {
        return a - b;
    }

    //Metodo multiplicar
    int multiplicar() {
        return a * b;
    }

    //Metodo dividir
    int dividir() {
        return a / b;
    }

}
