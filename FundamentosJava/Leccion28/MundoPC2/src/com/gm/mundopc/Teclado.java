package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclado;

    }
    @Override
    public String toString(){
        return"Teclado {" +"idTeclado=  " + idTeclado+ " , " +super.toString();
    }

}
