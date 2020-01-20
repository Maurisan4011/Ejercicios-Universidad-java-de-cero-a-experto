package caja;

public class PruebaCaja {

    public static void main(String[] args) {
        // valores locales 
        int medidaAncho = 3, medidaAlto = 2, medidaProfunda = 6;

        // Creamos un objeto de la clase Aritmetica enviando argumentos 
        //Imprimimos el resultado
        Caja caja1 = new Caja();
        int resultado = caja1.calcularVolumen(medidaAncho, medidaAlto, medidaProfunda);

        System.out.println("resultado de caja 1:" + resultado);
        
        Caja caja2 = new Caja(2,4,6);
        System.out.println("\nResultado de la caja 2 : "+ caja2.calcularVolumen());

    }
}