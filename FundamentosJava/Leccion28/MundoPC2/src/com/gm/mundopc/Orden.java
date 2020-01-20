package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    //Declaramos el Arreglo de computadoras 
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    //Definimos el maximo elementos de arreglo 
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de computadoras
        computadoras = new Computadora[maxComputadoras];

    }

    public void agregaComputadora(Computadora computadora) {
        //Si las computadoras agragadas no superan el maximo de computadoras 
        // Agregamos la nueva computadora 
        if (contadorComputadoras < maxComputadoras) {
            //Agregamos la nueva computadora al arreglo
            //e incrementamos el contador de computadors 
            computadoras[contadorComputadoras++] = computadora;

        } else {
            System.out.println("Se ah superado el maximo de productos: " + maxComputadoras);
        }

    }
    
    public void mostrarORden(){
        System.out.println("Orden#:  "+ idOrden);
        System.out.println("Computadoras de la orden #"+idOrden+ ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
            
        }
    }

}
