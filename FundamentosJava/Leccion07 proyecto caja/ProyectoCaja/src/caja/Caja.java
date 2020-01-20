/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author Mauri
 */
public class Caja {

    //Atributo de la lase caja     
    int ancho, alto, profundo;

    //Constructor vacio
    //Recordar que si agregamos un constructor distinto al vacio 
    //ya nose crea esste constructor y nosotros debemos crearlo si necesitamos 
    public Caja() {
    }

    //Contructor con 3 argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Este metodo toma los atributos de la clase caja para hacer el calculo
    //vol= ancho * alto * profundo
    public int calcularVolumen() {
        return ancho * alto * profundo;

    }
    
    public int calcularVolumen(int ancho, int alto, int profundo) {
        return ancho * alto * profundo;
    }

}
