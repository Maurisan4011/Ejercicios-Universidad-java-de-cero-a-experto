package aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {
        //Variables locales
        int operadorA = 6;
        int operadorB = 2;

        // Creamos un objeto de la clase Aritmetica enviando argumentos 
        Aritmetica obj1 = new Aritmetica(operadorA, operadorB);

        //Imprimir operandos
        System.out.println("Operadoor A: " + operadorA + "  y operador B : " + operadorB);

        //Resultado de la suma
        System.out.println("\nResultados suma:  " + obj1.sumar());

        //Resultado de la resta
        System.out.println("\nResultado de la resta:  " + obj1.restar());

        //Resultados de la multiplicacion
        System.out.println("\nResultado de la multiplicacion:  " + obj1.multiplicar());

        //Resultado de la division
        System.out.println("\nResultado de la division :  " + obj1.dividir());

        // void otroMetodo(){
        //No se puede acceder a una variable local declarada en otro metodo
        //  System.out.println("valor operador A " +operadorA);}
    }
}
