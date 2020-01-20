package ventas;

import com.gm.ventas.*;

public class Ventas {

    public static void main(String[] args) {
        //Creamos varios objetos Producto
        Producto p1 = new Producto("Camisa", 50.00);
        Producto p2 = new Producto("Pantalón", 100.00);
        Producto p3 = new Producto("Corbata", 30.00);
        Producto p4 = new Producto("Alpargatas", 500.00);

        //Creamos un objeto Orden
        Orden orden1 = new Orden();

        //Agregamos prductos Orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        orden1.agregarProducto(p4);

        //Imprimimos la orden
        orden1.mostrarOrden();

        //Cramos una segunda orden 
        Orden orden2 = new Orden();

        //Cramos nuevos productos
        Producto p5 = new Producto("Zapatos", 200);
        Producto p6 = new Producto("Blusa", 90);
        Producto p7 = new Producto("Ojotas", 450);

        //Agregamos productos a la orden 2
        orden2.agregarProducto(p7);
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p6);
        orden2.agregarProducto(p3);

        //Imprimimos Orden 2
        System.out.println("Numero de orden 2");
        orden2.mostrarOrden();

    }

}
