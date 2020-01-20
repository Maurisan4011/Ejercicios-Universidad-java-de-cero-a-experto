package com.gm.ventas;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor vacio
    private Producto() {
        //Asignamos el id producto por cada objeto ingresado o creado 
        this.idProducto = ++contadorProductos;

    }
    //constructor sobre cargado de dos argumentso 

    public Producto(String nombre, double precio) {
        //llamamos al constructor vacio para asignarle idProducto
        this();
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    @Override
    public String toString(){
           return "Producto {" + "idProducto #"+ idProducto + " "
                   + ",  nombre = " + nombre + ", precio = " +precio +'}';
    }
}
