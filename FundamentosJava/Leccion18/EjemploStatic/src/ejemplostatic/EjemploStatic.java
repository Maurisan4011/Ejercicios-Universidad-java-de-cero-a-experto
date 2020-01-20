
package ejemplostatic;

public class EjemploStatic {

    public static void main(String[] args) {
       //Invocamos  la clase objeto Persona y creamos un nuevo atributo persona 1
       Persona p1 = new Persona ("Santino");
        System.out.println("Persona N°1:  " +p1);
        
        //De nuevo Invocamos  la clase objeto Persona y creamos un nuevo atributo persona 2 
       Persona p2 = new Persona ("Francesca"); 
       System.out.println("Persona N°2:  " +p2);
       
        //De nuevo Invocamos  la clase objeto Persona y creamos un nuevo atributo persona 3 
       Persona p3 = new Persona ("Rosario"); 
       System.out.println("Persona N°3:  " +p3);
       
        //De nuevo Invocamos  la clase objeto Persona y creamos un nuevo atributo persona 4 
       Persona p4 = new Persona ("Maria Elena "); 
       System.out.println("Persona N°4:  " +p4);
       
       
       //Imprimimos el ContadorPersona para validar la cantidad de veces que ingreso
       //nuevo atributo de objeto 
        System.out.println("Numero de persona ingresadas a la actualidad : " +Persona.getContadosPersona());
       
    }
    
}
