package ejemploherencia;

import java.util.Date;

//definimos clase hija (cliente)heredando algunos argumentos de la clase padre (Persona) 
public class Cliente extends Persona {

    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    //Constructor con todos los argumentos + herencia de atributo nombre clase (Persona)
    public Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;

    }

    public int getIdCliente() {
        return idCliente;
    }


    public Date getFechaRegistro() {
        return fechaRegistro;
    }

   
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString(){
        //Perimero mandamos a llamar el metodo de la clase padre(Persona)
        //parq ue podamos observar los valores de la clase Padre,
        //y despues imprimimos los valores de la clases hija(Clientes)
        return  super.toString() + "Cliente { " +"idCliente= " +idCliente
                + ",  fechaRegistro=  " +fechaRegistro + ",  vip= " +vip+'}';
      
    }
    
}
