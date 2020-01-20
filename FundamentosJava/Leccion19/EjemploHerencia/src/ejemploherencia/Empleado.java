package ejemploherencia;

//definimos clase hija (Empleado) heredando algunos argumentos de la clase padre Persona 
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    //Constructor con todos los argumentos + herencia de atributo nombre clase PErsona 
    public Empleado(String nombre, double sueldo) {
        super(nombre); //Super simepre va en la primera linea 
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;

    }
        
    //mediante getters &  setters volvemos todos los argumentos publicos para 
    //poder usar  y modicar en las clases hijas 

    public int getIdEmpleado() {
        return idEmpleado;
    
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

@Override
public String toString(){
    //Primero mandamos a llamar al metodo tostring() de la clase padre Persona
    //para  que podamos observar los  valores de la clase padre
    //y despues imprimimos los valores de la clase hija (Empleado)
    return super.toString() +"Empleado {" + "ideEmpleado = " +
            idEmpleado+ ", sueldo=  " +sueldo+ '}';
}

}
