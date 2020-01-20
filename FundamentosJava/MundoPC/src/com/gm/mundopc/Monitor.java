package com.gm.mundopc;

//Creación de la clase
public class Monitor {
    //Declaración de variables
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor(){
         idMonitor = ++contadorMonitores;
   }
    
    //Constructor que inicializa las variables
    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
      public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    //Método que concatena las variables y regresa una cadena
    @Override
    public String toString() {
        return "Monitor{" + " idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + '}';
    }

}
