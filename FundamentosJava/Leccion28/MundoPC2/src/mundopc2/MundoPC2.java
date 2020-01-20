package mundopc2;

import com.gm.mundopc.*;

public class MundoPC2 {

    public static void main(String[] args) {

        //creacion de computadora toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuThosiba = new Computadora("Computadora Toshiba", monitorToshi,
                tecladoToshi, ratonToshi);

        //cracion de computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);

        //agregamos las computadoras a la orden
        Orden orden1 = new Orden();
        orden1.agregaComputadora(compuThosiba);
        orden1.agregaComputadora(compuDell);
        orden1.agregaComputadora(compuArmada);
        //Imprimimos la orden 
        orden1.mostrarORden();

        //Agregamos una segunda orden 
        Orden orden2 = new Orden();
        orden2.agregaComputadora(compuArmada);
        orden2.agregaComputadora(compuDell);
        System.out.println("");
        orden2.mostrarORden();

    }

}
