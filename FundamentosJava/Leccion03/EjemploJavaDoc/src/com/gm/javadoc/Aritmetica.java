package com.gm.javadoc;

/**
 * Eat clse permite operaciones de aritmetica como sumar, restar, etc.
 * @author Mauri
 * @version 1.0
 */

public class Aritmetica {

    /**
     * Primer Operando
     */
    int operandoA;

    /**
     * Segundo opreando
     */
    int operandoB;

    /**
     * Constructor de la clase
     *
     * @param a recibe el valor de operando A
     * @param b recibe el valor de operando
     */
    public Aritmetica(int a, int b) {
        this.operandoA = a;
        this.operandoB = b;

    }
    /**
     * Este metodo realiza la suma de dos operandos enteros 
     * @return int resultado de la suma 
     */
    public int sumar(){
        return operandoA + operandoB;
    }
}
