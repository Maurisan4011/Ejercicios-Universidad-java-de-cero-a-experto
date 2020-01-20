package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    //constructor que inicializa las variables
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString();
    }
}
